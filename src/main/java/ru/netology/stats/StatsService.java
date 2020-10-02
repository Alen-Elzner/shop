package ru.netology.stats;

public class StatsService {
    public long[] purchases;

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageSum(long[] purchases) {
        long total = calculateSum(purchases);

        long averageSum = total / purchases.length;

        return averageSum;
    }

    public long findIndexOfMax(long[] purchases) {
        this.purchases = purchases;
        int indexOfMax = 0;

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] >= purchases[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return indexOfMax + 1;  //поскольку отсчет индекса начинается с нуля, а порядковый номер месяца с единицы
        //System.out.println(indexOfMax);
    }

    public long findIndexOfMin(long[] purchases) {
        int indexOfMin = 0;

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] <= purchases[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return indexOfMin + 1;  //поскольку отсчет индекса начинается с нуля, а порядковый номер месяца с единицы
    }

    public long findSalesBelowAverage(long[] purchases) {
        int monthBelowAverage = 0;
        long sumAverage = calculateAverageSum(purchases);
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < sumAverage) {
                monthBelowAverage++;
            }
        }
        return monthBelowAverage ;
    }

    public long findSalesAboveAverage(long[] purchases) {
        int monthAboveAverage = 0;
        long sumAverage = calculateAverageSum(purchases);
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > sumAverage) {
                monthAboveAverage++;
            }
        }
        return monthAboveAverage ;
    }
}
