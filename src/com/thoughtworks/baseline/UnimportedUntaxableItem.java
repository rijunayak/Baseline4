//An Unimported Untaxable Item can't be taxed and isn't imported which can return its string entry
package com.thoughtworks.baseline;

public class UnimportedUntaxableItem implements TaxableItem {
    private int quantity;
    private String itemName;
    private double price;

    public UnimportedUntaxableItem(int quantity, String itemName, double price) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public double totalTax() {
        return 0;
    }

    @Override
    public double totalPrice() {
        return price;
    }

    @Override
    public String toString() {
        return quantity + " " + itemName + ": " + price;
    }
}
