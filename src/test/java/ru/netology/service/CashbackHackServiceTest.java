package ru.netology.service;

import org.junit.Test;

import org.junit.Assert;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRecommendSpend1() {
        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldRecommendSpend0() {
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldRecommendSpend1000() {
        Assert.assertEquals(1000, service.remain(0));
    }

}