package com.walking.intensive.chapter2.task6;

/**
 * Реализуйте представленные ниже методы для расчета
 * НОК (наименьшее общее кратное) и НОД (наибольший общий делитель).
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getLcm(0, 20));
    }

    /**
     * Реализуйте метод, который будет возвращать НОК для чисел, переданных параметрами.
     *
     * <p>Входные параметры - положительные целые числа.
     *
     * <p>Если входные данные некорректны - метод должен возвращать -1.
     */
    static int getLcm(int m, int n) {
        int gcd = getGcdByEuclideanAlgorithm(m, n);
        return gcd > 0 ? m * n / gcd : -1;
    }

    /**
     * Реализуйте метод, который будет возвращать НОД для чисел, переданных параметрами.
     *
     * <p>Входные параметры - положительные целые числа.
     *
     * <p>Если входные данные некорректны - метод должен возвращать -1.
     */
    static int getGcd(int m, int n) {
        if (m <= 0 || n <= 0) {
            return -1;
        }
        while (m > 0 && n > 0) {
            if (m >= n) {
                m -= n;
            } else {
                n -= m;
            }

        }
        return Math.max(m, n);
    }


    /**
     * Реализуйте метод, который будет возвращать НОК для чисел, переданных параметрами.
     * Расчет должен производиться с помощью алгоритма Евклида
     *
     * <p>Входные параметры - положительные целые числа.
     *
     * <p>Если входные данные некорректны - метод должен возвращать -1.
     */
    static int getGcdByEuclideanAlgorithm(int m, int n) {
        if (m <= 0 || n <= 0) {
            return -1;
        }

        while (m > 0 && n > 0) {
            if (m >= n) {
                m %= n;
            } else {
                n %= m;
            }
        }
        return Math.max(m, n);
    }
}
