package com.teksystems.bootcamp.capstone2.Order;

import com.teksystems.bootcamp.capstone2.Display.Items;
import com.teksystems.bootcamp.capstone2.Display.Subtotal;
import com.teksystems.bootcamp.capstone2.Display.Tax;
import com.teksystems.bootcamp.capstone2.Menu.MenuAddOns;
import com.teksystems.bootcamp.capstone2.Display.Total;

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
        Total total = new Total();
        Subtotal subtotal = new Subtotal();
        Tax tax = new Tax();
        Items items = new Items();
        System.out.println("\n+-----------------------------+");
        System.out.println("|     Jonah's Poke Palace     |");
        System.out.println("|          Order#:" + this.getOrderNumber() + "           |");
        System.out.println("|                             |");
        items.generate(this);
        System.out.println("|                             |");
        subtotal.generate(this);
        System.out.println("|                             |");
        tax.generate(this);
        total.generate(this);
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
