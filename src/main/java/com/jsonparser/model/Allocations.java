package com.jsonparser.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Allocations {

    private String sector;
    private long assetValue;
    private float proportion;

    public Allocations(){
    }

    public Allocations(String sector, long assetValue){
        this.sector = sector;
        this.assetValue = assetValue;
        this.proportion = 0.0f;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public long getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(long assetValue) {
        this.assetValue = assetValue;
    }

    public float getProportion() {
        return proportion;
    }

    public void setProportion(float proportion) {
        this.proportion = proportion;
    }

    @Override
    public String toString() {
        return "Allocations [sector="+ sector +", assetValue=" + assetValue + ", proportion=" + proportion + "]";
    }
}
