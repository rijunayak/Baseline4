package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnimportedUntaxableItemTest {

    @Test
    public void UnimportedUntaxableItemShouldNotHaveTax() {
        UnimportedUntaxableItem unimportedUntaxableItem = new UnimportedUntaxableItem(1, "book", 5);

        assertEquals(0.0, unimportedUntaxableItem.totalTax(), 0.0);
    }
}
