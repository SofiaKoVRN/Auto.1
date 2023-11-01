package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackerTest {
    @Test
    public void shouldCalculateBoundaryWithAnyAmount() {
        CashBackHacker hack = new CashBackHacker();
        int amount = 900;

        int expected = 1000 - amount;
        int actual = hack.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateBoundaryWithAmountZero() {
        CashBackHacker hack = new CashBackHacker();
        int amount = 0;

        int expected = 1000 - amount;
        int actual = hack.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateBoundaryWithAmountEqualToIt() {
        CashBackHacker hack = new CashBackHacker();
        int amount = 1000;

        int expected = 1000;
        int actual = hack.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}
