package com.jsonparser.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsonparser.model.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class BriefcaseController {

    private ObjectMapper mapper;
    private Inquiry inquiry;
    private ArrayList<DetailedStocks> detailedStocks;
    private HashMap <String,Long> assetValue;
    private List<Allocations> allocationsList;
    private AllBriefcase allBriefcase;
    private File readJsonFile;
    private File writeJsonFile;
    private URL url;

    public BriefcaseController() {
        mapper = new ObjectMapper();
        allBriefcase = new AllBriefcase();
        readJsonFile = new File("C:\\json\\injson.txt");
        writeJsonFile = new File("C:\\json\\outjson.txt");
        assetValue = new HashMap<String, Long>();
        allocationsList = new ArrayList<Allocations>();
        detailedStocks = new ArrayList<DetailedStocks>();
    }

    public void getShares (){
        System.out.print("Load file...");
        try {
            inquiry = mapper.readValue(new FileInputStream(readJsonFile),Inquiry.class);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        requestForShareOptions();
        calculateAssetValue();
        calculateAssetValueBySector();
        calculateAllBriefcase();
        System.out.print("Save file...");
        try {
            mapper.writeValue(writeJsonFile, allBriefcase);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void requestForShareOptions (){
        List <Stocks> stocks = inquiry.getStocks();
        String simbol[] = new String[stocks.size()];
        for (int i = 0; i < stocks.size(); i++) {
            simbol[i] = stocks.get(i).getSymbol();
        }
        for (int j = 0; j < simbol.length; j++) {
            System.out.print("Download data from the web for " + simbol[j] + "...");
            try {
                detailedStocks.add(mapper.readValue(buildUrl(simbol[j]),DetailedStocks.class));
                System.out.println("Done!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public URL buildUrl (String stock) {
        String stringurl = "https://api.iextrading.com/1.0/stock/" + stock + "/quote";
        try {
            url = new URL(stringurl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public void calculateAssetValue (){
        List<Stocks> stocks = inquiry.getStocks();
        for (int i = 0; i < detailedStocks.size(); i++) {
            assetValue.put(detailedStocks.get(i).getSymbol(), detailedStocks.get(i).getLatestPrice() * stocks.get(i).getVolume());
        }
    }

    public void calculateAssetValueBySector (){
        for (int i = 0; i < detailedStocks.size(); i++) {
            String tempsector = detailedStocks.get(i).getSector();
            String tempsymbol = detailedStocks.get(i).getSymbol();
            long tempassetvalue = assetValue.get(tempsymbol);
            int tempnumber = allocationListGetNumber(tempsector,allocationsList);
            if (allocationsList.size() == 0){
                allocationsList.add(new Allocations(tempsector, tempassetvalue));
            } else if (tempnumber > 0){
                long assetvaluetemp = allocationsList.get(tempnumber).getAssetValue();
                allocationsList.get(tempnumber).setAssetValue(assetvaluetemp + assetValue.get(tempsymbol));
            } else {
                allocationsList.add(new Allocations(tempsector, tempassetvalue));
            }
        }
    }

    public int allocationListGetNumber (String sector, List <Allocations> allocationsList) {
        int number = -1;
        for (int i = 0; i < allocationsList.size(); i++) {
            if (allocationsList.get(i).getSector().contains(sector)){
                number = i;
                return number;
            } else {
                number = -1;
            }
        }
        return number;
    }

    public void calculateAllBriefcase (){
        long valuetemp = 0;
        for (int i = 0; i < allocationsList.size(); i++) {
            valuetemp += allocationsList.get(i).getAssetValue();
        }
        allBriefcase.setValue(valuetemp);
        BigDecimal proptemp;
        for (int i = 0; i < allocationsList.size(); i++) {
            float assetValueTemp = allocationsList.get(i).getAssetValue();
            proptemp = new BigDecimal(assetValueTemp / valuetemp);
            float proportiontemp = proptemp.setScale(3, RoundingMode.HALF_EVEN).floatValue();
            allocationsList.get(i).setProportion(proportiontemp);
        }
        allBriefcase.setAllocations(allocationsList);
    }
}
