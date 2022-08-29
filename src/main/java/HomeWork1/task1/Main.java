package HomeWork1.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Задайте ширину и длину массива:");
        int a = read.nextInt();
        int b = read.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("Введите число больше 0!");
            System.exit(1);
        }

        int[][] twoDArray = new int[a][b];

        arrayRandomFill(twoDArray);
        System.out.println("Двумерный массив заполненный случайными числами:");
        System.out.println(Arrays.deepToString(twoDArray));
        System.out.println("Минимальное число из массива:");
        System.out.println(minOfArray(twoDArray));
        System.out.println("Максимальное число из массива:");
        System.out.println(maxOfArray(twoDArray));
        System.out.println("Среднее число из массива:");
        System.out.println(avgOfArray(twoDArray));


    }

    public static int[][] arrayRandomFill(int[][] twoDArray) {
        Random random = new Random();
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                int randInt = (random.nextInt(0, 100));
                twoDArray[i][j] = randInt;
            }
        }
        return twoDArray;
    }

    public static int minOfArray(int[][] twoDArray) {
        int min = twoDArray[0][0];

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if (twoDArray[i][j] <= min) {
                    min = twoDArray[i][j];
                }
            }
        }
        return min;
    }

    public static int maxOfArray(int[][] twoDArray) {
        int max = 0;

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if (twoDArray[i][j] >= max) {
                    max = twoDArray[i][j];
                }
            }
        }

        return max;
    }

    public static int avgOfArray(int[][] twoDArray) {
        int avg;
        double sum = 0;

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                sum = sum + twoDArray[i][j];

            }
        }
        avg = (int) (sum / twoDArray.length);
        return avg;
    }

}
