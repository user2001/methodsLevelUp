package com.company;

import java.util.Arrays;
import java.util.Random;

public class Array {
    int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public void fillEvenNumbers() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = i * 2;
        }
        System.out.println("Масив з парних чисел:\n" + Arrays.toString(array) + "\n");
    }

    public void fillRandomNumbers() {
        Random random = new Random();
        for (int j = 0; j < array.length; j++) {
            array[j] = random.nextInt(array.length);
            System.out.print(array[j] + " ");
        }
    }

    public void average() {
        int sum = 0;
        double avg;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        avg = (double) sum / array.length;
        System.out.println();
        System.out.println("3.Вивести середнє значення: " + avg);
    }

    public void devideThree() {
        int sumDev = 0;
        int sumOfEvenIndex = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 3 == 0) {
                sumDev += array[j];
            }
        }
        System.out.println("4.Вивести суму всіх значень кратних 3: " + sumDev);
    }

    public void evenIndex() {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public void sumOfEvenIndex() {
        int sumOfEvenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {
                sumOfEvenIndex += array[i];
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("9.Вивести суму значень всіх парних індексів: " + sumOfEvenIndex);
    }

    public void bubleSort() {
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
    }

    public void minimum() {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println();
        System.out.print("7.Вивести найменше значення в масиві: " + min);
    }

    public void maximum() {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println();
        System.out.println("8.Вивести найбільше значення масиву: " + max);
    }

    public void printSigns() {
        System.out.print("10.Вивести перших 20 символів з таблиці ASCI: ");
        for (char i = 32; i < 52; i++) {
            System.out.print((char) i + " ");
        }
    }
}

