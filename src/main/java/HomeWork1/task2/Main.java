package HomeWork1.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        System.out.println("Задайте размер массива:");
        int a = 0;

        try {
            a = Integer.parseInt(read.nextLine());
        } catch (NumberFormatException g) {
            System.out.println("NumberFormat Exception: invalid input");
            System.exit(1);
        }

        int[] array = new int[a];
        System.out.println("Задайте диапазон для псевдослучайных чисел в массиве:");
        arrayFill(array);
        System.out.println("Сортируем массив ...");
        arraySort(array);
        Thread.sleep(1_000);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }

    public static int[] arrayFill(int[] array) {
        Random random = new Random();
        Scanner read = new Scanner(System.in);
        int a = 0;
        int b = 0;

        try {
            a = read.nextInt();
            b = read.nextInt();

        } catch (NumberFormatException g) {
            System.out.println("NumberFormat Exception: invalid input");
            System.exit(1);
        }
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(a, b);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: invalid input");
            System.exit(1);
        }
        return array;
    }

    public static int[] arraySort(int[] array) {

        int temp;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }


        return array;


    }

}