//An Imported Untaxable Item can't be taxed and is imported which can return its string entry
package com.thoughtworks.baseline;

import static java.lang.Math.ceil;

public class ImportedUntaxableItem {
    private int quantity;
    private String itemName;
    private double price;

    public ImportedUntaxableItem(int quantity, String itemName, double price) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
    }

    public double totalTax() {
        return roundOff(price * 0.05);
    }

    private double roundOff(double value) {
        return ceil(value * 20) / 20;
    }
}
