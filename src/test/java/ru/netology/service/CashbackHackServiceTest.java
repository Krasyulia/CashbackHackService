package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRecommendSpend1() {
        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldRecommendSpend0() {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldRecommendSpend1000() {
        Assert.assertEquals(service.remain(0), 1000);
    }
}