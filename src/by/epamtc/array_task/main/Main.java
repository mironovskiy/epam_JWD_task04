package by.epamtc.array_task.main;

import by.epamtc.array_task.task1.Task1;
import by.epamtc.array_task.task2.Task2;
import by.epamtc.array_task.task3.Task3;
import by.epamtc.array_task.task4.Task4;
import by.epamtc.array_task.task5.Task5;
import by.epamtc.array_task.task6.Task6;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        Task1 task1 = new Task1();
        int [][] matrix;

        matrix = task1.buildMatrix(5);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Задание 2");
        matrix = new Task2().buildMatrix(5);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Задание 3");
        matrix = new Task3().buildMatrix(18);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Задание 4");
        int [] arr = {1,2,3,4,5};
        matrix = new Task4().buildMatrix(arr);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Задание 5");
        int [][] matrix1 = {{1,2,3},{4,5,6}};
        int [][] matrix2 = {{1,2,3,6},{4,5,6,7},{7,8,9,7}};
        int [][] multiply = new Task5().multiplyMatrix(matrix1, matrix2);
        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < multiply[0].length; j++) {
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Задание 6");
        int[][] magicSquare;
        magicSquare = new Task6().getMagicSquare(3);
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[0].length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}
