package com.solvd.cafe.enums;

public enum Promotion {
    MONDAY ("Doughnut for free!"),
    THURSDAY ("Free coffee if you order a pie."),
    SUNDAY ("Smoothies with 13% discount");

    private String promotionDescription;

    Promotion(String promotionDescription){
        this.promotionDescription = promotionDescription;
    }

    public String getPromotionDescription() {
        return promotionDescription;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "promotionDescription='" + promotionDescription + '\'' +
                '}';
    }
}
