package app.model;

import app.utils.Constants;

public class Product {

    int quota;
    double price;

    public Product(int quota, double price) {
        this.quota = quota;
        this.price = price;
    }

    public int getQuota() {
        return quota;
    }

    public double getPrice() {
        return price;
    }
}
