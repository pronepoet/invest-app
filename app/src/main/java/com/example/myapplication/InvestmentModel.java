package com.example.myapplication;

public class InvestmentModel {
    static String investmentTitle;
    static String investmentDescription;
    static int image;

    public InvestmentModel(String investmentTitle, String investmentDescription, int image) {
        this.investmentTitle = investmentTitle;
        this.investmentDescription = investmentDescription;
        this.image = image;
    }

    public String getInvestmentTitle() {
        return investmentTitle;
    }

    public String getInvestmentDescription() {
        return investmentDescription;
    }

    public int getImage() {
        return image;
    }
}
