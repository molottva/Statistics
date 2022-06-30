package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", delimiter = ';')
    void shouldCalculateSum(String nameTest, int saleJan, int saleFeb, int saleMar, int saleApr, int saleMay, int saleJun, int saleJul, int saleAug, int saleSep, int saleOct, int saleNov, int saleDec, int expectedSum, double expectedAverageSum, int expectedMaxMonth, int expectedMinMonth, int expectedCounterUnderAverage, int expectedCounterUpperAverage) {
        StatsService service = new StatsService();
        int[] sales = {saleJan, saleFeb, saleMar, saleApr, saleMay, saleJun, saleJul, saleAug, saleSep, saleOct, saleNov, saleDec};
        int actual = service.calculateSum(sales);
        assertEquals(actual, expectedSum);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", delimiter = ';')
    void shouldCalculateAverageSum(String nameTest, int saleJan, int saleFeb, int saleMar, int saleApr, int saleMay, int saleJun, int saleJul, int saleAug, int saleSep, int saleOct, int saleNov, int saleDec, int expectedSum, double expectedAverageSum, int expectedMaxMonth, int expectedMinMonth, int expectedCounterUnderAverage, int expectedCounterUpperAverage) {
        StatsService service = new StatsService();
        int[] sales = {saleJan, saleFeb, saleMar, saleApr, saleMay, saleJun, saleJul, saleAug, saleSep, saleOct, saleNov, saleDec};
        double actual = service.calculateAverageSum(sales);
        assertEquals(actual, expectedAverageSum);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", delimiter = ';')
    void shouldCalculateMaxMonth(String nameTest, int saleJan, int saleFeb, int saleMar, int saleApr, int saleMay, int saleJun, int saleJul, int saleAug, int saleSep, int saleOct, int saleNov, int saleDec, int expectedSum, double expectedAverageSum, int expectedMaxMonth, int expectedMinMonth, int expectedCounterUnderAverage, int expectedCounterUpperAverage) {
        StatsService service = new StatsService();
        int[] sales = {saleJan, saleFeb, saleMar, saleApr, saleMay, saleJun, saleJul, saleAug, saleSep, saleOct, saleNov, saleDec};
        int actual = service.calculateMaxMonth(sales);
        assertEquals(actual, expectedMaxMonth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", delimiter = ';')
    void shouldCalculateMinMonth(String nameTest, int saleJan, int saleFeb, int saleMar, int saleApr, int saleMay, int saleJun, int saleJul, int saleAug, int saleSep, int saleOct, int saleNov, int saleDec, int expectedSum, double expectedAverageSum, int expectedMaxMonth, int expectedMinMonth, int expectedCounterUnderAverage, int expectedCounterUpperAverage) {
        StatsService service = new StatsService();
        int[] sales = {saleJan, saleFeb, saleMar, saleApr, saleMay, saleJun, saleJul, saleAug, saleSep, saleOct, saleNov, saleDec};
        int actual = service.calculateMinMonth(sales);
        assertEquals(actual, expectedMinMonth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", delimiter = ';')
    void shouldCalculateCounterUnderAverage(String nameTest, int saleJan, int saleFeb, int saleMar, int saleApr, int saleMay, int saleJun, int saleJul, int saleAug, int saleSep, int saleOct, int saleNov, int saleDec, int expectedSum, double expectedAverageSum, int expectedMaxMonth, int expectedMinMonth, int expectedCounterUnderAverage, int expectedCounterUpperAverage) {
        StatsService service = new StatsService();
        int[] sales = {saleJan, saleFeb, saleMar, saleApr, saleMay, saleJun, saleJul, saleAug, saleSep, saleOct, saleNov, saleDec};
        int actual = service.calculateCounterUnderAverage(sales);
        assertEquals(actual, expectedCounterUnderAverage);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", delimiter = ';')
    void shouldCalculateCounterUpperAverage(String nameTest, int saleJan, int saleFeb, int saleMar, int saleApr, int saleMay, int saleJun, int saleJul, int saleAug, int saleSep, int saleOct, int saleNov, int saleDec, int expectedSum, double expectedAverageSum, int expectedMaxMonth, int expectedMinMonth, int expectedCounterUnderAverage, int expectedCounterUpperAverage) {
        StatsService service = new StatsService();
        int[] sales = {saleJan, saleFeb, saleMar, saleApr, saleMay, saleJun, saleJul, saleAug, saleSep, saleOct, saleNov, saleDec};
        int actual = service.calculateCounterUpperAverage(sales);
        assertEquals(actual, expectedCounterUpperAverage);
    }


//    @Test
//    void shouldCalculateSum() {
//        StatsService service = new StatsService();
//        int[] purchases = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//        int expected = 78;
//        int actual = service.calculateSum(purchases);
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    void calculateAverageSum() {
//        StatsService service = new StatsService();
//        int[] purchases = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
//        double expected = 1.5;
//        double actual = service.calculateAverageSum(purchases);
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    void calculateMaxMonth() {
//        StatsService service = new StatsService();
//        int[] purchases = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 9};
//        int expected = 11;
//        int actual = service.calculateMaxMonth(purchases);
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    void calculateMinMonth() {
//        StatsService service = new StatsService();
//        int[] purchases = {9, 10, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10};
//        int expected = 3;
//        int actual = service.calculateMinMonth(purchases);
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    void calculateCounterUnderAverage() {
//        StatsService service = new StatsService();
//        int[] purchases = {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3};
//        int expected = 5;
//        int actual = service.calculateCounterUnderAverage(purchases);
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    void calculateCounterUpperAverage() {
//        StatsService service = new StatsService();
//        int[] purchases = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100};
//        int expected = 1;
//        int actual = service.calculateCounterUpperAverage(purchases);
//        assertEquals(actual, expected);
//    }
}