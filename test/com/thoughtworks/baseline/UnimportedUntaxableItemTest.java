package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnimportedUntaxableItemTest {

    @Test
    public void shouldNotHaveTax() {
        UnimportedUntaxableItem unimportedUntaxableItem = new UnimportedUntaxableItem(1, "book", 5);

        assertEquals(0.0, unimportedUntaxableItem.totalTax(), 0.0);
    }

    @Test
    public void shouldHaveSameTotalPriceAsBasePrice() {
        UnimportedUntaxableItem unimportedUntaxableItem = new UnimportedUntaxableItem(1, "book", 5);

        assertEquals(5.0, unimportedUntaxableItem.totalPrice(), 0.0);
    }
}
