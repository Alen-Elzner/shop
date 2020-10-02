package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSum() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long expected = 15;

        long actual = service.calculateAverageSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldIndexOfMax() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long expected = 8;

        long actual = service.findIndexOfMax(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldIndexOfMin() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long expected = 9;

        long actual = service.findIndexOfMin(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSalesBelowAverage() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long expected = 5;

        long actual = service.findSalesBelowAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSalesAboveAverage() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long expected = 5;

        long actual = service.findSalesAboveAverage(purchases);

        assertEquals(expected, actual);
    }


}