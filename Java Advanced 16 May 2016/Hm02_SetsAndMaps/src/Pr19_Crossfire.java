import java.util.Arrays;
import java.util.Scanner;

public class Pr19_Crossfire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();
        int[][] matrix = new int[rows][cols];
        int counter = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = counter++;
            }
        }

        while (true) {
            String line = sc.nextLine();
            if ("Nuke it from orbit".equals(line)) {
                break;
            }

            int[] input = Arrays.stream(line.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int row = input[0];
            int col = input[1];
            int radius = input[2];

            int startRowHorizontal = row;
            int startColHorizontal = col - radius;
            int startRowVertical = row - radius;
            int startColVertical = col;

            for (int i = 0; i < 2 * radius + 1; i++) {
                boolean isInHorizontal = startRowHorizontal >= 0 && startRowHorizontal < matrix.length &&
                        startColHorizontal >= 0 && startColHorizontal < matrix[startRowHorizontal].length;
                boolean isInVertical = startRowVertical >= 0 && startRowVertical < matrix.length &&
                        startColVertical >= 0 && startColVertical < matrix[startRowVertical].length;

                if (isInHorizontal) {
                    matrix[startRowHorizontal][startColHorizontal] = 0;
                }
                if (isInVertical) {
                    matrix[startRowVertical][startColVertical] = 0;
                }

                startColHorizontal++;
                startRowVertical++;
            }

            int[] colsNewMatrix = new int[matrix.length];
            for (int rowI = 0; rowI < matrix.length; rowI++) {
                for (int colI = 0; colI < matrix[rowI].length; colI++) {
                    if (matrix[rowI][colI] != 0) {
                        colsNewMatrix[rowI]++;
                    }
                }
            }
            int rowsNewMatrix = 0;
            for (int i = 0; i < colsNewMatrix.length; i++) {
                if (colsNewMatrix[i] != 0) {
                    rowsNewMatrix++;
                }
            }
            int[][] newMatrix = new int[rowsNewMatrix][];
            int zeroRowIndex = 0;
            for (int i = 0; i < newMatrix.length; i++) {
                if (colsNewMatrix[zeroRowIndex] == 0) {
                    zeroRowIndex++;
                }
                newMatrix[i] = new int[colsNewMatrix[zeroRowIndex]];
                zeroRowIndex++;
            }

            int newMatrixRow = 0;
            for (int rowI = 0; rowI < matrix.length; rowI++) {

                boolean isEmptyRow = true;
                for (int colI = 0; colI < matrix[rowI].length; colI++) {
                    if (matrix[rowI][colI] != 0) {
                        isEmptyRow = false;
                    }
                }
                if (isEmptyRow) {
                    continue;
                }

                int newMatrixCol = 0;
                for (int colI = 0; colI < matrix[rowI].length; colI++) {
                    if (matrix[rowI][colI] != 0) {
                        newMatrix[newMatrixRow][newMatrixCol] = matrix[rowI][colI];
                        newMatrixCol++;
                    }
                }
                newMatrixRow++;
            }

            matrix = newMatrix;
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
