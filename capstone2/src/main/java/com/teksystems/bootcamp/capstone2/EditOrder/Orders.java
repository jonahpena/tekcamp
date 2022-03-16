package com.teksystems.bootcamp.capstone2.EditOrder;

import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;
import com.teksystems.bootcamp.capstone2.Recepit.ReceiptValues;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<MenuAddOns> entrees = new ArrayList<>();
    private double sum = 0;
    private int orderNumber = 1;

    public Orders() {
    }

    public void newOrder(Orders order) {
        setOrderNumber(orderNumber++);
        order.entrees.clear();
        order.setSum(0);
    }

    public void addToEntrees(MenuAddOns item, Orders order) {
        order.entrees.add(item);
    }

    public void removeFromEntrees(MenuAddOns item, Orders order) {
        order.entrees.remove(item);
    }

    public void printReceipt(Orders order) {
        System.out.println("\n+-----------------------------+");
        System.out.println("|     Jonah's Poke Palace     |");
        System.out.println("|          Order#:" + this.getOrderNumber() + "           |");
        System.out.println("|                             |");
        ReceiptValues.displaySelectedMenuItemNames(this);
        System.out.println("|                             |");
        ReceiptValues.displayCurrentSubtotalOfOrder(this);
        System.out.println("|                             |");
        ReceiptValues.displayTaxOfOrder(this);
        ReceiptValues.displaySumOfOrder(this);
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
    }

    @Override
    public String toString() {
        return "Orders{" +
                "entrees=" + entrees +
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
