package com.example.myapplication;

public class GoldModel {
    String planName;
    String returnName;
    int image;

    public GoldModel(String planName, String returnName, int image) {
        this.planName = planName;
        this.returnName = returnName;
        this.image = image;
    }

    public String getPlanName() {
        return planName;
    }

    public String getReturnName() {
        return returnName;
    }

    public int getImage() {
        return image;
    }
}
