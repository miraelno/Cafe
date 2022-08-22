package com.solvd.cafe.enums;

public enum Discount {
    FIRST_ORDER(10),
    SORRY_DISCOUNT(30),
    SHARE_IN_SOCIAL_NETWORK(15);

    private int discountSum;

    Discount(int discountSum) {
    }

    public int getDiscountSum() {
        return discountSum;
    }
}
