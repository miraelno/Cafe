package com.solvd.cafe.people;

import java.util.Objects;

public class Provider extends Person {
    private String nameCompany;
    private String products;

    public Provider(){
    }
    public Provider(String nameCompany, String products) {
        this.nameCompany = nameCompany;
        this.products = products;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Provider provider = (Provider) o;
        return nameCompany.equals(provider.nameCompany) && products.equals(provider.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameCompany, products);
    }

    @Override
    public String toString() {
        return "Provider{" +
                "nameCompany='" + nameCompany + '\'' +
                ", products='" + products + '\'' +
                '}';
    }
}
