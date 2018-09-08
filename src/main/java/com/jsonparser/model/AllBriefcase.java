package com.jsonparser.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AllBriefcase {
    private long value;
    List <Allocations> allocations;

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public List<Allocations> getAllocations() {
        return allocations;
    }

    public void setAllocations(List<Allocations> allocations) {
        this.allocations = allocations;
    }

    @Override
    public String toString() {
        return "AllBriefcase [value=" + value + ", allocations=" + allocations + "]";
    }
}
