package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldCalculateSQR() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculateSQR(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateZSQR() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculateSQR(30, 90);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateHSQR() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculateSQR(9802, 9805);
        assertEquals(expected, actual);
    }
}