package by.epamtc.array_task.task2;

public class Task2 {
    public int[][] buildMatrix(int matrixOrder) {
        int matrix[][] = new int[matrixOrder][matrixOrder];

        for (int i = 1; i <= matrixOrder; i++) {
            matrix[i - 1][i - 1] = i * (i + 1);
        }

        return matrix;
    }
}
