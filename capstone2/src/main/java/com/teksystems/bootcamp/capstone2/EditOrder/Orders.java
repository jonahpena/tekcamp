package com.teksystems.bootcamp.capstone2.EditOrder;

import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;
import com.teksystems.bootcamp.capstone2.TaxCalculator;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<MenuAddOns> entrees = new ArrayList<>();
    private double tax = TaxCalculator.calculateTax(this.getSum());
    private double sum = 0;
    private int orderNumber = 1;

    public Orders() {

    }

    @Override
    public String toString() {
        return "Orders{" +
                "entrees=" + entrees +
                ", tax=" + tax +
                ", sum=" + sum +
                ", orderNumber=" + orderNumber +
                '}';
    }

    public List<MenuAddOns> getEntrees() {
        return entrees;
    }

    public void setEntrees(List<MenuAddOns> entrees) {
        this.entrees = entrees;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
