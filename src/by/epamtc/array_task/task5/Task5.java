package by.epamtc.array_task.task5;

public class Task5 {
    public int[][] multiplyMatrix(int [][] matrix1, int [][] matrix2){
        int [][] resultMatrix = new int[matrix1.length][matrix2[0].length];

        if (matrix1[0].length == matrix2.length){

            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < resultMatrix[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        else System.out.println("произведение данных матриц невозможно");


        return resultMatrix;
    }
}
