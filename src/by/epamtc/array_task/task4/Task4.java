package by.epamtc.array_task.task4;

public class Task4 {
    public int[][] buildMatrix(int[] arr){
        int [][] matrix = new int[arr.length][arr.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) Math.pow(arr[j], i + 1);
            }
        }

        return matrix;
    }
}
