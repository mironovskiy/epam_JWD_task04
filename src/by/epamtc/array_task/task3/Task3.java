package by.epamtc.array_task.task3;

public class Task3 {
    public int[][] buildMatrix(int matrixOrder){
        int matrix[][] = new int[matrixOrder][matrixOrder];
        int flag = 0;

        for (int i = 0; i <= matrixOrder / 2; i++) {
            for (int j = flag; j < matrixOrder - flag; j++) {
                matrix[i][j] = 1;
            }
            flag++;
        }

        flag = 0;

        for (int i = matrixOrder - 1; i >= matrixOrder / 2; i--) {
            for (int j = flag; j < matrixOrder - flag; j++) {
                matrix[i][j] = 1;
            }
            flag++;
        }

        return matrix;
    }
}
