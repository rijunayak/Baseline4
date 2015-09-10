package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImportedTaxableItemTest {

    @Test
    public void shouldRightlyShowTax() {
        ImportedTaxableItem importedTaxableItem = new ImportedTaxableItem(1, "imported perfume", 5.0);

        assertEquals(0.75, importedTaxableItem.totalTax(), 0.0);
    }
}
