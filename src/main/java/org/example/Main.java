package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк в матрице: ");
        int n = scanner.nextInt();
        System.out.print("Введите количество столбцов в матрице: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] resultVector = new int[n];

        for (int i = 0; i < n; i++) {
            int minAbsoluteValue = Math.abs(matrix[i][0]);
            for (int j = 1; j < m; j++) {
                int absValue = Math.abs(matrix[i][j]);
                if (absValue < minAbsoluteValue) {
                    minAbsoluteValue = absValue;
                }
            }
            resultVector[i] = minAbsoluteValue;
        }

        System.out.println("Полученный вектор:");
        for (int i = 0; i < n; i++) {
            System.out.print(resultVector[i] + " ");
        }
    }
}