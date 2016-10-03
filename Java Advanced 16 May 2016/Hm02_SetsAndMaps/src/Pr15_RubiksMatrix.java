import java.util.Scanner;

public class Pr15_RubiksMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int counter = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = counter++;
            }
        }

        int lineCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < lineCount; i++) {
            String[] input = sc.nextLine().split(" ");
            String direction = input[1];
            int movingIndex = Integer.parseInt(input[0]);
            int moves = Integer.parseInt(input[2]);

            int iterationRowCount = moves % row;
            int iterationColCount = moves % col;

            if ("up".equals(direction)) {
                for (int j = 0; j < iterationRowCount; j++) {
                    int firstNumber = matrix[0][movingIndex];
                    for (int k = 0; k < row - 1; k++) {
                        matrix[k][movingIndex] = matrix[k + 1][movingIndex];
                    }
                    matrix[row - 1][movingIndex] = firstNumber;
                }
            } else if ("down".equals(direction)) {
                for (int k = 0; k < iterationRowCount; k++) {
                    int lastNumber = matrix[row - 1][movingIndex];
                    for (int j = row - 1; j > 0; j--) {
                        matrix[j][movingIndex] = matrix[j - 1][movingIndex];
                    }
                    matrix[0][movingIndex] = lastNumber;
                }
            } else if ("left".equals(direction)) {
                for (int k = 0; k < iterationColCount; k++) {
                    int firstNumber = matrix[movingIndex][0];
                    for (int j = 0; j < col - 1; j++) {
                        matrix[movingIndex][j] = matrix[movingIndex][j + 1];
                    }
                    matrix[movingIndex][col - 1] = firstNumber;
                }
            } else {
                for (int k = 0; k < iterationColCount; k++) {
                    int lastNumber = matrix[movingIndex][col - 1];
                    for (int j = col - 1; j > 0; j--) {
                        matrix[movingIndex][j] = matrix[movingIndex][j - 1];
                    }
                    matrix[movingIndex][0] = lastNumber;
                }
            }
        }

        int counter1 = 1;
        int[][] newMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newMatrix[i][j] = counter1++;
            }
        }

        for (int rows = 0; rows < row; rows++) {
            for (int cols = 0; cols < col; cols++) {
                if (matrix[rows][cols] != newMatrix[rows][cols]) {

                    int wrongNumber = matrix[rows][cols];
                    int correctNumber = newMatrix[rows][cols];
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (matrix[i][j] == correctNumber) {
                                System.out.printf("Swap (%d, %d) with (%d, %d)%n",
                                        rows, cols, i, j);
                                matrix[i][j] = wrongNumber;
                                matrix[rows][cols] = correctNumber;
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("No swap required");
                }
            }
        }
    }
}
