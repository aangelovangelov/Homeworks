import java.util.Scanner;

public class Pr16_TargetPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();
        String snake = sc.nextLine();

        boolean isEvenRows = rows % 2 == 0;

        int snakeIndex = 0;
        char[][] matrix = new char[rows][cols];
        for (int row = rows - 1; row >= 0; row--) {

            boolean isEvenRowIndex = row % 2 == 0;
            if (isEvenRows) {
                if (isEvenRowIndex) {
                    isEvenRowIndex = false;
                } else {
                    isEvenRowIndex = true;
                }
            }

            if (isEvenRowIndex) {
                for (int col = cols - 1; col >= 0; col--) {
                    matrix[row][col] = snake.charAt(snakeIndex % snake.length());
                    snakeIndex++;
                }
            } else {
                for (int col = 0; col < cols; col++) {
                    matrix[row][col] = snake.charAt(snakeIndex % snake.length());
                    snakeIndex++;
                }
            }

        }

        int rowIndex = sc.nextInt();
        int colIndex = sc.nextInt();
        int radius = sc.nextInt();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int x = Math.abs(colIndex - col);
                int y = Math.abs(rowIndex - row);
                double distance = Math.sqrt(x * x + y * y);
                if (distance <= radius) {
                    matrix[row][col] = ' ';
                }
            }
        }

        int[] colCounter = new int[cols];
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                if (matrix[row][col] != ' ') {
                    colCounter[col]++;
                }
            }
        }

        char[][] newMatrix = new char[cols][];
        for (int row = 0; row < newMatrix.length; row++) {
            newMatrix[row] = new char[colCounter[row]];
        }

        for (int row = 0; row < cols; row++) {
            int colIndexNewMatrix = 0;
            for (int col = rows - 1; col >= 0; col--) {
                if (matrix[col][row] != ' ') {
                    newMatrix[row][colIndexNewMatrix] = matrix[col][row];
                    colIndexNewMatrix++;
                }
            }
        }

        for (int row = rows - 1; row >= 0; row--) {
            for (int col = 0; col < cols; col++) {
                if (newMatrix[col].length > 0 && row < newMatrix[col].length) {
                    System.out.print(newMatrix[col][row]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
