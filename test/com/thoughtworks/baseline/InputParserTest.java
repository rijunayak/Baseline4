package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class InputParserTest {

    @Test
    public void shouldParseInput() {
        InputParser inputParser = new InputParser("1 book at 5.0\n1 perfume at 6.0\n1 imported chocolate at 7.0");
        UnimportedUntaxableItem unimportedUntaxableItem = new UnimportedUntaxableItem(1, "book", 5.0);
        UnimportedTaxableItem unimportedTaxableItem = new UnimportedTaxableItem(1, "perfume", 6.0);
        ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(1, "imported chocolate", 7.0);
        ArrayList<TaxableItem> taxableItems = new ArrayList<TaxableItem>(Arrays.asList(unimportedUntaxableItem, unimportedTaxableItem, importedUntaxableItem));

        assertEquals(taxableItems.toString(), inputParser.parseInput().toString());
    }
}
