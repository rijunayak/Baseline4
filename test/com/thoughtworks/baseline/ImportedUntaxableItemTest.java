package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImportedUntaxableItemTest {

    @Test
    public void shouldReturnCorrectTax() {
        ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(1, "imported book", 5.0);

        assertEquals(0.25, importedUntaxableItem.totalTax(), 0.0);
    }
}
