package by.epamtc.array_task.task6;


public class Task6 {
    int[][] magicSquare;
    int matrixDimension;


    public int[][] getMagicSquare(int matrixDimension){
        this.matrixDimension = matrixDimension;
        int[] arr = new int[matrixDimension * matrixDimension];
        magicSquare = new int[matrixDimension][matrixDimension];

        for (int i = 0; i < (matrixDimension * matrixDimension); i++) {
            arr[i] = i + 1;
        }

        searchCombination(arr, 0);

        return magicSquare;
    }

    private void searchCombination(int[] arr, int index){
        if (index == (arr.length-1)){
            checkCombination(arr);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            searchCombination(arr, index + 1);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    private void checkCombination(int[] arr){
        boolean isCombinationRight = true;
        int sum = 0;
        int rowAmount;
        int columnAmount;
        int firstDiagonalAmount;
        int secondDiagonalAmount;

        for (int i = 0; i < matrixDimension; i++)
            sum += arr[i];

        for (int i = 0; i < (matrixDimension * matrixDimension); i += matrixDimension) {
            rowAmount = 0;
            for (int j = 0; j < matrixDimension; j++) {
                rowAmount += arr[i + j];
            }

            if (rowAmount != sum){
                isCombinationRight = false;
                break;
            }
        }

        if (isCombinationRight == true) {

            for (int i = 0; i < matrixDimension; i++) {
                columnAmount = 0;
                for (int j = 0; j < (matrixDimension * matrixDimension); j += matrixDimension) {
                    columnAmount += arr[i + j];
                }

                if (columnAmount != sum){
                    isCombinationRight = false;
                    break;
                }
            }
        }

        if (isCombinationRight == true) {
            firstDiagonalAmount = 0;
            int flag = 0;
            for (int i = 0; i < (matrixDimension * matrixDimension); i += matrixDimension) {
                firstDiagonalAmount += arr[i + flag];
                flag++;
            }

            if (firstDiagonalAmount != sum)
                isCombinationRight = false;
        }

        if (isCombinationRight == true) {
            secondDiagonalAmount = 0;
            int flag = 0;
            for (int i = matrixDimension - 1; i < (matrixDimension * matrixDimension); i += matrixDimension) {
                secondDiagonalAmount += arr[i - flag];
                flag++;
            }
            if (secondDiagonalAmount != sum)
                isCombinationRight = false;
        }

        if (isCombinationRight == true) {
            int index = 0;

            for (int i = 0; i < matrixDimension; i++) {
                for (int j = 0; j < matrixDimension; j++) {
                    magicSquare[i][j] = arr[index];
                    index++;
                }
            }

            for (int i = 0; i < magicSquare.length; i++) {
                for (int j = 0; j < magicSquare[0].length; j++) {
                    System.out.print(magicSquare[i][j] + " ");
                }
                System.out.println("");
            }

            System.out.println();
        }
    }

}
