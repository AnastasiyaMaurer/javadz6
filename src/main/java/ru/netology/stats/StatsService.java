package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long TotalSale = 0;
        for (long sale : sales) {
            TotalSale += sale;
        }
        return TotalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;

    }

    public int monthMaximum(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }
        }
        return monthMaxSale + 1;
    }

    public int monthMinimum(long[] sales) {
        int monthMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSales]) {
                monthMinSales = i;
            }
        }
        return monthMinSales + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}