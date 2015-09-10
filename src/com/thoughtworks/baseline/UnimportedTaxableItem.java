//An Unimported Taxable Item can be taxed and isn't imported which can return its string entry
package com.thoughtworks.baseline;

import static java.lang.Math.ceil;

public class UnimportedTaxableItem implements TaxableItem {

    private int quantity;
    private String itemName;
    private double price;

    public UnimportedTaxableItem(int quantity, String itemName, double price) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public double totalTax() {
        return roundOff(price * 0.1);
    }

    @Override
    public double totalPrice() {
        return 0.0;
    }

    private double roundOff(double value) {
        return ceil(value * 20) / 20;
    }
}
