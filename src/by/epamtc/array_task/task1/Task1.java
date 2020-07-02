package by.epamtc.array_task.task1;

public class Task1 {
    public int[][] buildMatrix(int matrixOrder){
        int matrix[][] = new int[matrixOrder][matrixOrder];

        for (int i = 1; i <= matrixOrder; i++) {

           if (i % 2 == 0) {
               for (int j = 1; j <= matrixOrder; j++) {
                   matrix[i - 1][j - 1] = matrixOrder - (j - 1);
               }
           }
           else {
               for (int j = 1; j <= matrixOrder; j++) {
                   matrix[i - 1][j - 1] = j;
               }
           }
        }

        return matrix;
    }
}
