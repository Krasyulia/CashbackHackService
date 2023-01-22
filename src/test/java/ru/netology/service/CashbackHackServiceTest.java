package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRecommendSpend1() {
        Assertions.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldRecommendSpend0() {
        Assertions.assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldRecommendSpend1000() {
        Assertions.assertEquals(1000, service.remain(0));
    }
}