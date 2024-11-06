package app.entity;

import app.model.Product;

public class CalcCostDelivery extends CalcCostBase{
    private final static double deliveryPrice = 10.5;

    @Override
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice() + deliveryPrice;
    }
}
