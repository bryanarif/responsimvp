package com.responsi.mvp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Player {
    @SerializedName("result")
    String result;
    @SerializedName("nat")
    List<ResultsItem> nat;

    public String getResult() { return  result; }

    public void getResult(String result) { this.result = result; }

    public List<ResultsItem> getNat() { return nat; }

    public void setNat (List<ResultsItem> nat) { this.nat = nat;}
}
