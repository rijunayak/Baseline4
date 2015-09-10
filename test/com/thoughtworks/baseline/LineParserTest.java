package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineParserTest {

    @Test
    public void shouldGetCorrectImportedUntaxableItemOnParsingLine() {
        LineParser lineParser = new LineParser("1 imported book at 14.59");
        ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(1, "imported book", 14.59);

        assertEquals(importedUntaxableItem.toString(), lineParser.parseLine().toString());
    }

    @Test
    public void shouldGetCorrectImportedTaxableItemOnParsingLine() {
        LineParser lineParser = new LineParser("1 imported perfume at 14.59");
        ImportedTaxableItem importedTaxableItem = new ImportedTaxableItem(1, "imported perfume", 14.59);

        assertEquals(importedTaxableItem.toString(), lineParser.parseLine().toString());
    }
}
