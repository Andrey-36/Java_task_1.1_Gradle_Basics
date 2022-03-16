package ru.netology.unit;

import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldMessage1000Purchase0() {
        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldMessage0Purchase1000() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldMessage500PurchaseAbove1000() {
        int expected = 500;
        int actual = service.remain(1500);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldMessageLimitPurchaseAboveBoundary() {
        int expected = 1000;
        int actual = service.remain(2000);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldMessage1Purchase999() {
        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldMessage999Purchase1() {
        int expected = 999;
        int actual = service.remain(1);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldMessage500Purchase500() {
        int expected = 500;
        int actual = service.remain(500);

        assertEquals(actual, expected);
    }
}