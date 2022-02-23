package ru.netology.service;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest_JUnit_4 {

    @org.junit.Test
    public void remainAt1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected=0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void remainUpTo1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected=1;
        int actual = cashbackHackService.remain(999);
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void remainMove1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected=95;
        int actual = cashbackHackService.remain(1905);
        assertEquals(expected,actual);
    }
}