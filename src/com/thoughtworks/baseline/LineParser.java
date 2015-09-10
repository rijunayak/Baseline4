//A line parser has one line of string input corresponding to an item and parses it to a TaxableItem
package com.thoughtworks.baseline;

public class LineParser {

    private String input;

    public LineParser(String input) {
        this.input = input;
    }

    public TaxableItem parseLine() {
        TaxableItem taxableItem = null;
        String tokenizedLine[] = input.split(" ");
        int quantity = Integer.parseInt(tokenizedLine[0]);
        String itemName = "";
        for(int i = 1; i < tokenizedLine.length - 2; i++) {
            itemName += tokenizedLine[i];
            if(i != tokenizedLine.length - 3)
                itemName += " ";
        }
        double price = Double.parseDouble(tokenizedLine[tokenizedLine.length - 1]);
        if(itemName.contains("imported")) {
            if(itemName.contains("book") || itemName.contains("chocolate") || itemName.contains("headache pill")) {
                taxableItem = new ImportedUntaxableItem(quantity, itemName, price);
            } else {
                taxableItem = new ImportedTaxableItem(quantity, itemName, price);
            }
        }
        return taxableItem;
    }
}
