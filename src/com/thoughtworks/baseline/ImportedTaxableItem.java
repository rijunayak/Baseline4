//An Imported Taxable Item can be taxed and is imported which can return its string entry
package com.thoughtworks.baseline;

import static java.lang.Math.ceil;

public class ImportedTaxableItem implements TaxableItem{

    private int quantity;
    private String itemName;
    private double price;

    public ImportedTaxableItem(int quantity, String itemName, double price) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public double totalTax() {
        return roundOff(price * 0.15);
    }

    @Override
    public double totalPrice() {
        return 0;
    }

    private double roundOff(double value) {
        return ceil(value * 20) / 20;
    }
}
