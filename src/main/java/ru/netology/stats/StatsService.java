package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] purchases) { //подсчет суммы продаж
        int sum = 0; //переменная для суммы
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public double calculateAverageSum(int[] purchases) { //средняя сумма в месяц
        double sum = calculateSum(purchases); //вызов метода для вычисления суммы продаж
        double averageSum = sum / purchases.length;
        return averageSum;
    }

    public int calculateMaxMonth(int[] purchases) { //номер месяця максимальной продажи
        int maxMonth = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[maxMonth] <= purchases[i]) {
                maxMonth = i;
            }
        }
        maxMonth += 1;
        return maxMonth;
    }

    public int calculateMinMonth(int[] purchases) { //номер месяца минимума продаж
        int minMonth = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[minMonth] >= purchases[i]) {
                minMonth = i;
            }
        }
        minMonth += 1;
        return minMonth;
    }

    public int calculateCounterUnderAverage(int[] purchases) { //кол-во месяцев, когда продажи меньше среднего
        int counter = 0;
        double averageSum = calculateAverageSum(purchases);
        for (int purchase : purchases) {
            if (purchase < averageSum) {
                counter += 1;
            }
        }
        return counter;
    }

    public int calculateCounterUpperAverage(int[] purchases) { //кол-во месяцев, когда продажи больше среднего
        int counter = 0;
        double averageSum = calculateAverageSum(purchases);
        for (int purchase : purchases) {
            if (purchase > averageSum) {
                counter += 1;
            }
        }
        return counter;
    }
}
