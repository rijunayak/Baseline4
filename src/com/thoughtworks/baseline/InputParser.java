//An input parser takes the entire raw input and generates a list of TaxableItems
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class InputParser {

    private String input;

    public InputParser(String input) {
        this.input = input;
    }

    public ArrayList<TaxableItem> parseInput() {
        LineParser lineParser = null;
        ArrayList<TaxableItem> taxableItems = new ArrayList<TaxableItem>();
        String[] tokenizedItems = input.split("\n");
        for(int i = 0; i < tokenizedItems.length; i++) {
            lineParser = new LineParser(tokenizedItems[i]);
            taxableItems.add(lineParser.parseLine());
        }
        return taxableItems;
    }
}
