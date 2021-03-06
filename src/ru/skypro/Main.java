package ru.skypro;

public class Main {

    // Задача 1.
    public static void main(String[] args) {
	byte a = 127;
    short b = -32_768;
    int c = 2_147_483_647;
    long d = 2_147_483_648L;
    float e = -1.123456f;
    double f = 1.12345678901;
    System.out.println("Задача1: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);

    // Задача 2
    float weightBoxer1 = 78.2f;
    float weightBoxer2 = 82.7f;
    float sumWeight = weightBoxer1 + weightBoxer2;
    System.out.println("Общий вес двух бойцов равен " + sumWeight + " кг");
    float differenceWeight = weightBoxer2 - weightBoxer1;
    System.out.println("Разница между весами бойцов равна " + differenceWeight + " кг");

    // Задача 3
    byte numberBananas = 5;
    byte weightOneBanana = 80;
    short volumeMilk = 200;
    byte weight100VolumeMilk = 105;
    byte numberIceCreams = 2;
    byte weightOneIceCream = 100;
    byte numberEggs = 4;
    byte weightOneEgg = 70;

    var weightBananas = numberBananas * weightOneBanana; // Общая масса бананов
    var weightMilk = volumeMilk / 100 * weight100VolumeMilk; // Общая масса молока
    var weightIceCreams = numberIceCreams * weightOneIceCream; // Общая масса мороженого
    var weightEggs = numberEggs * weightOneEgg; // Общая масса яиц
    var totalWeight = weightBananas + weightMilk + weightIceCreams + weightEggs; // Количество спорт-завтрака в граммах
    float totalWeightKilogram = (float) totalWeight / 1000; // Перевод в килограммы
    System.out.println("Вес спорт-завтрака " + totalWeightKilogram + " кг");

    //Задача 4
    byte extraWeightKilogram = 7;
    short weightDayMin = 250;
    short weightDayMax = 500;

    float sumDayMax = (float) extraWeightKilogram * 1000 / weightDayMin;
    float sumDayMin = (float) extraWeightKilogram * 1000 / weightDayMax;
    float averageNumberDays = (sumDayMax + sumDayMin) / 2;
    System.out.println("Максимальное количество дней - " + sumDayMax);
    System.out.println("Минимальное количество дней - " + sumDayMin);
    System.out.println("Количество дней в среднем - " + averageNumberDays);

    // Задача 5
    int salaryMasha = 67_760;
    int salaryDenis = 83_690;
    int salaryKristina = 76_230;
// Расчет новой зарплаты, увеличенной на 10%:
    float newSalaryMasha = (float) 1.1 * salaryMasha;
    float newSalaryDenis = (float) 1.1 * salaryDenis;
    float newSalaryKristina = (float) 1.1 * salaryKristina;
// Расчет годовой зарплаты:
    int yearSalaryMasha = 12 * salaryMasha;
    int yearSalaryDenis = 12 * salaryDenis;
    int yearSalaryKristina = 12 * salaryKristina;
// Расчет новой годовой зарплаты:
    float yearNewSalaryMasha = 12 * newSalaryMasha;
    float yearNewSalaryDenis = 12 * newSalaryDenis;
    float yearNewSalaryKristina = 12 * newSalaryKristina;
// Расчет роста годового дохода:
    float yearDifferenceMasha = yearNewSalaryMasha - yearSalaryMasha;
    float yearDifferenceDenis = yearNewSalaryDenis - yearSalaryDenis;
    float yearDifferenceKristina = yearNewSalaryKristina - yearSalaryKristina;
    System.out.println("Маша теперь будет получать " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearDifferenceMasha + " рублей");
    System.out.println("Денис теперь будет получать " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearDifferenceDenis + " рублей");
    System.out.println("Кристина теперь будет получать " + newSalaryKristina + " рублей. Годовой доход вырос на " + yearDifferenceKristina + " рублей");

        // Задача 6
        a = 12;
        b = 27;
        c = 44;
        d = 15;
        e = 9;
        short result = (short) (a * (b + (c -d * e)));
        result = (short) (-1 * result);
        System.out.println(result);

        // Задача 7
        float g = 9;
        float h = 4;
        g = g / h;
        h = g * h;
        g = h / g;
        System.out.println("g=" + g + ", h=" + h);

        // Задача 7 (решение через сложение и вычитание)
        a = 9;
        b = 4;
        a = (byte) (a + b); // 9+4
        b = (short) (a - b); // (9+4) - 4 = 9
        a = (byte) (a - b); // (9+4) - 9 = 4
        System.out.println("a=" + a + ", b=" +  b);

        // Задача 7 (решение через умножение)
        a = 9;
        b = 4;
        a = (byte) ( a * b);
        b = (short) (a / b);
        a = (byte) (a / b);
        System.out.println("a=" + a + ", b=" +  b);

        // Задача 8
        c = 475;
        byte reminder100 = (byte) (c % 100); // Находим остаток от деления на 100
        b = (byte) (reminder100 / 10); // Берем целое число от деления найденного остатка на 10
        System.out.println("b=" + b);


    }
}
