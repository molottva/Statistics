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
        //назначаем индекс месяца с макс продажи на первый месяц в массиве (индексы в цикле начинаются с нуля)
        //по сути бы берем первый месяц за образец с которым будем сравнивать в условие if
        int maxMonth = 0;
        //берем цикл начиная с индекса 1 (0 мы уже назначили на пред этапе)
        //можно и начинать с i = 0 - так просто будет одна лишняя итерация вначале (при i = 0).
        // Можешь сам это проверить в дебаггере
        //цикл закончиться при i равному длине (количеству чисел) нашего массива т.е. 12 в нашем случаи
        // помни что индекс i начинается с 0.
        // Поэтому месяц с i = 12 уже будет 13 по счету, а его в массиве нету и код выдаст ошибку
        // почему сразу не назначить i < 12?
        // Чтобы можно было дать продажи например за два года и код все равно будет работать
        for (int i = 1; i < purchases.length; i++) {
            //тут сравниваем на каждой итерации цикла (if внутри цикла for) с макс значением на ДАННЫЙ МОМЕНТ цикла
            //на первой итерации (i = 1) будет:
            //число в массиве с индексом 0 (см. строку 22) сравниваем с числом с индексом 1
            //если purchases[1] окажеться больше или равно purchases[0]
            // то принимаем что индекс макс значения на ДАННОМ МОМЕНТЕ цикла будет равен 1
            //иначе индексом макс значения на ДАННОМ МОМЕНТЕ цикла останеться 0
            //И такое сравнение будет происходить на каждой итерации цикла, что хорошо видно в дебаггере
            //больше или равно - потому что по условиям нам надо найти номер последнего месяца с макс продажи
            //иначе в коде было бы просто <
            if (purchases[maxMonth] <= purchases[i]) {
                maxMonth = i;
            }
        }
        //после цикла (нахождения индекса месяца с макс продаж) прибавляем к индексу +1, потому что
        // индексы массива начинаются с 0, а нам надо вернуть номер месяца из массива
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
