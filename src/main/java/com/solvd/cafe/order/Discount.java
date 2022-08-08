package com.solvd.cafe.order;

import java.util.Objects;

public class Discount {
    private int discountId;
    private String name;
    private int percent;

    public Discount(){
    }
    public Discount(int discountId, String name, int percent) {
        this.discountId = discountId;
        this.name = name;
        this.percent = percent;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {this.percent = percent;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discount discount = (Discount) o;
        return discountId == discount.discountId && percent == discount.percent && name.equals(discount.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountId, name, percent);
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discountId=" + discountId +
                ", name='" + name + '\'' +
                ", percent=" + percent +
                '}';
    }
}
