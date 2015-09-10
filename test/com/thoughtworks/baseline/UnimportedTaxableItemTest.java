package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnimportedTaxableItemTest {

    @Test
    public void shouldRightlyCalculateTax() {
        UnimportedTaxableItem unimportedTaxableItem = new UnimportedTaxableItem(1, "perfume", 5.0);

        assertEquals(0.5, unimportedTaxableItem.totalTax(), 0.0);
    }

    @Test
    public void shouldRightlyCalculateTotalPrice() {
        UnimportedTaxableItem unimportedTaxableItem = new UnimportedTaxableItem(1, "perfume", 5.0);

        assertEquals(5.5, unimportedTaxableItem.totalPrice(), 0.0);
    }

    @Test
    public void shouldRightlyHaveTheCorrectStringEntry() {
        UnimportedTaxableItem unimportedTaxableItem = new UnimportedTaxableItem(1, "perfume", 5.0);

        assertEquals("1 perfume: 5.5", unimportedTaxableItem.toString());
    }
}
