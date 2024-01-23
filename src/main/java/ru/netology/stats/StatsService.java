package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {

        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;


    }

    public long average(long[] sales) {

        return sum(sales) / 12;


    }

    public int monthMaximumSale(long[] sales) {
        long monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[(int) monthMaximum] <= sales[i]) {
                monthMaximum = i;

            }
        }
        return (int) (monthMaximum + 1);
    }

    public int monthMinimumSale(long[] sales) {
        long monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[(int) monthMinimum]) {
                monthMinimum = i;

            }
        }
        return (int) (monthMinimum + 1);
    }

    public int monthBelowAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }

        }

        return (int) (counter);
    }

    public int monthHigherAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (averageSale < sale) {
                counter++;
            }

        }

        return (int) (counter);
    }
}
