package com.annasladkykh;

//1) Заполнить массив случайными числами. Подсчитать:
//- количество элементов которые больше своего соседа слева
//- количество четных элементов
//- количество элементов которые меньше среднего арифметического

import java.util.Arrays;
import java.util.Random;

public class HW9Task01 {
    public static void main(String[] args) {

        int[] array = arrayIntInit();
        System.out.println(Arrays.toString(array));
        int evenCount = 0;
        int biggerLeftCount = 0;
        int lessAverageCount = 0;

        double average = 0;
        for (int value : array) {
            average += value;
        }
        average = average / array.length;

        for (int i = 0; i < array.length; i++) {
            if (i != 0 && array[i] > array[i - 1]) {
                biggerLeftCount++;
            }
            if (array[i] % 2 == 0) {
                evenCount++;
            }
            if (array[i] < average) {
                lessAverageCount++;
            }
        }
        System.out.printf("There are %s elements bigger than their neighbor on the left in the array\n", biggerLeftCount);
        System.out.printf("There are %s even elements in the array\n", evenCount);
        System.out.printf("There are %s elements less than average (%s) in the array\n", lessAverageCount, average);
    }

    private static int[] arrayIntInit() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }
}