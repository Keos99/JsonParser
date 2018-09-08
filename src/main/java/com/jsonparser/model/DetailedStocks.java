package com.jsonparser.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailedStocks {
    String symbol;
    String companyName;
    String primaryExchange;
    String sector;
    String calculationPrice;
    long open;
    long openTime;
    long close;
    long closeTime;
    long high;
    long low;
    long latestPrice;
    String latestSource;
    String latestTime;
    long latestUpdate;
    long latestVolume;
    long iexRealtimePrice;
    long iexRealtimeSize;
    long iexLastUpdated;
    long delayedPriceTime;
    long extendedPrice;
    long extendedChange;
    long extendedPriceTime;
    long change;
    long changePercent;
    long iexMarketPercent;
    long iexVolume;
    long avgTotalVolume;
    long iexBidPrice;
    long iexBidSize;
    long iexAskPrice;
    long iexAskSize;
    long marketCap;
    long peRatio;
    long week52High;
    long week52Low;
    long ytdChange;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPrimaryExchange() {
        return primaryExchange;
    }

    public void setPrimaryExchange(String primaryExchange) {
        this.primaryExchange = primaryExchange;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCalculationPrice() {
        return calculationPrice;
    }

    public void setCalculationPrice(String calculationPrice) {
        this.calculationPrice = calculationPrice;
    }

    public long getOpen() {
        return open;
    }

    public void setOpen(long open) {
        this.open = open;
    }

    public long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(long openTime) {
        this.openTime = openTime;
    }

    public long getClose() {
        return close;
    }

    public void setClose(long close) {
        this.close = close;
    }

    public long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(long closeTime) {
        this.closeTime = closeTime;
    }

    public long getHigh() {
        return high;
    }

    public void setHigh(long high) {
        this.high = high;
    }

    public long getLow() {
        return low;
    }

    public void setLow(long low) {
        this.low = low;
    }

    public long getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(long latestPrice) {
        this.latestPrice = latestPrice;
    }

    public String getLatestSource() {
        return latestSource;
    }

    public void setLatestSource(String latestSource) {
        this.latestSource = latestSource;
    }

    public String getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(String latestTime) {
        this.latestTime = latestTime;
    }

    public long getLatestUpdate() {
        return latestUpdate;
    }

    public void setLatestUpdate(long latestUpdate) {
        this.latestUpdate = latestUpdate;
    }

    public long getLatestVolume() {
        return latestVolume;
    }

    public void setLatestVolume(long latestVolume) {
        this.latestVolume = latestVolume;
    }

    public long getIexRealtimePrice() {
        return iexRealtimePrice;
    }

    public void setIexRealtimePrice(long iexRealtimePrice) {
        this.iexRealtimePrice = iexRealtimePrice;
    }

    public long getIexRealtimeSize() {
        return iexRealtimeSize;
    }

    public void setIexRealtimeSize(long iexRealtimeSize) {
        this.iexRealtimeSize = iexRealtimeSize;
    }

    public long getIexLastUpdated() {
        return iexLastUpdated;
    }

    public void setIexLastUpdated(long iexLastUpdated) {
        this.iexLastUpdated = iexLastUpdated;
    }

    public long getDelayedPriceTime() {
        return delayedPriceTime;
    }

    public void setDelayedPriceTime(long delayedPriceTime) {
        this.delayedPriceTime = delayedPriceTime;
    }

    public long getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(long extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public long getExtendedChange() {
        return extendedChange;
    }

    public void setExtendedChange(long extendedChange) {
        this.extendedChange = extendedChange;
    }

    public long getExtendedPriceTime() {
        return extendedPriceTime;
    }

    public void setExtendedPriceTime(long extendedPriceTime) {
        this.extendedPriceTime = extendedPriceTime;
    }

    public long getChange() {
        return change;
    }

    public void setChange(long change) {
        this.change = change;
    }

    public long getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(long changePercent) {
        this.changePercent = changePercent;
    }

    public long getIexMarketPercent() {
        return iexMarketPercent;
    }

    public void setIexMarketPercent(long iexMarketPercent) {
        this.iexMarketPercent = iexMarketPercent;
    }

    public long getIexVolume() {
        return iexVolume;
    }

    public void setIexVolume(long iexVolume) {
        this.iexVolume = iexVolume;
    }

    public long getAvgTotalVolume() {
        return avgTotalVolume;
    }

    public void setAvgTotalVolume(long avgTotalVolume) {
        this.avgTotalVolume = avgTotalVolume;
    }

    public long getIexBidPrice() {
        return iexBidPrice;
    }

    public void setIexBidPrice(long iexBidPrice) {
        this.iexBidPrice = iexBidPrice;
    }

    public long getIexBidSize() {
        return iexBidSize;
    }

    public void setIexBidSize(long iexBidSize) {
        this.iexBidSize = iexBidSize;
    }

    public long getIexAskPrice() {
        return iexAskPrice;
    }

    public void setIexAskPrice(long iexAskPrice) {
        this.iexAskPrice = iexAskPrice;
    }

    public long getIexAskSize() {
        return iexAskSize;
    }

    public void setIexAskSize(long iexAskSize) {
        this.iexAskSize = iexAskSize;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public long getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(long peRatio) {
        this.peRatio = peRatio;
    }

    public long getWeek52High() {
        return week52High;
    }

    public void setWeek52High(long week52High) {
        this.week52High = week52High;
    }

    public long getWeek52Low() {
        return week52Low;
    }

    public void setWeek52Low(long week52Low) {
        this.week52Low = week52Low;
    }

    public long getYtdChange() {
        return ytdChange;
    }

    public void setYtdChange(long ytdChange) {
        this.ytdChange = ytdChange;
    }
}
