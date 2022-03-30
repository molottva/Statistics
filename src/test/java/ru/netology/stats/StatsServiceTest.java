package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] purchases = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int expected = 78;
        int actual = service.calculateSum(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void calculateAverageSum() {
        StatsService service = new StatsService();
        int[] purchases = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
        double expected = 1.5;
        double actual = service.calculateAverageSum(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void calculateMaxMonth() {
        StatsService service = new StatsService();
        int[] purchases = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 9};
        int expected = 11;
        int actual = service.calculateMaxMonth(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void calculateMinMonth() {
        StatsService service = new StatsService();
        int[] purchases = {9, 10, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int expected = 3;
        int actual = service.calculateMinMonth(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void calculateCounterUnderAverage() {
        StatsService service = new StatsService();
        int[] purchases = {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3};
        int expected = 5;
        int actual = service.calculateCounterUnderAverage(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void calculateCounterUpperAverage() {
        StatsService service = new StatsService();
        int[] purchases = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100};
        int expected = 1;
        int actual = service.calculateCounterUpperAverage(purchases);
        assertEquals(actual, expected);
    }
}