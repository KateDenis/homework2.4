package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCountNumbersExpected3() {
        SQRService service = new SQRService();

        int min = 200;
        int max = 300;
        int expected = 3;

        int actual = service.countNumbers(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountNumbersExpected0() {
        SQRService service = new SQRService();

        int min = 330;
        int max = 0;
        int expected = 0;

        int actual = service.countNumbers(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void countNumbersExpected90() {
        SQRService service = new SQRService();

        int min = 100;
        int max = 9801;
        int expected = 90;

        int actual = service.countNumbers(min, max);

        assertEquals(expected, actual);
    }
}