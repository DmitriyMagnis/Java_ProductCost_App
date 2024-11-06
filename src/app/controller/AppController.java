package app.controller;

import app.model.Product;
import app.entity.CalcCostBase;
import app.entity.CalcCostDelivery;
import app.utils.Constants;
import app.view.AppView;

public class AppController {

    private final AppView view = new AppView();

    public void runApp() {
        String[] data = view.getData();

        Product product = getProduct(data);

        CalcCostBase costBase = new CalcCostBase();
        double baseCost = costBase.calcCost(product);

        CalcCostDelivery costDelivery = new CalcCostDelivery();
        double deliveryCost = costDelivery.calcCost(product);

        String baseOutput = product + "\nCost is " +
                Constants.CURRENCY + " " + baseCost + ".";
        String deliveryOutput = product + "\nCost is " +
                Constants.CURRENCY + " " + deliveryCost + ".";

        view.getOutput(baseOutput);
        view.getOutput(deliveryOutput);
    }

    private Product getProduct(String[] data) {
        return new Product(
                Integer.parseInt(data[0]),
                Double.parseDouble(data[1]));
    }
}
