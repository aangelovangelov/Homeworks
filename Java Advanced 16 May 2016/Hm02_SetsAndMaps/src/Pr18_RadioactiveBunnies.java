import java.util.LinkedList;
import java.util.Scanner;

public class Pr18_RadioactiveBunnies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String line = sc.nextLine();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = line.charAt(col);
            }
        }

        int rowP = 0;
        int colP = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == 'P') {
                    rowP = row;
                    colP = col;
                    break;
                }
            }
        }
        matrix[rowP][colP] = '.';

        boolean isWon = false;
        boolean isDead = false;
        String comands = sc.nextLine();
        for (int i = 0; i < comands.length(); i++) {
            LinkedList<Integer> rowsB = new LinkedList<>();
            LinkedList<Integer> colsB = new LinkedList<>();
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (matrix[row][col] == 'B') {
                        rowsB.add(row);
                        colsB.add(col);
                    }
                }
            }

            for (int j = 0; j < rowsB.size(); j++) {
                int rowBunny = rowsB.get(j);
                int colBunny = colsB.get(j);

                if (colBunny < cols - 1) {//put on right
                    matrix[rowBunny][colBunny + 1] = 'B';
                }
                if (colBunny > 0) {//put on left
                    matrix[rowBunny][colBunny - 1] = 'B';
                }
                if (rowBunny > 0) {//put on up
                    matrix[rowBunny - 1][colBunny] = 'B';
                }
                if (rowBunny < rows - 1) {//put on down
                    matrix[rowBunny + 1][colBunny] = 'B';
                }
            }

            char comand = comands.charAt(i);
            if (comand == 'R') {
                colP++;
                if (colP > cols - 1) {
                    isWon = true;
                    break;
                }
                if (matrix[rowP][colP] == 'B') {
                    isDead = true;
                    break;
                }
            } else if (comand == 'L') {
                colP--;
                if (colP < 0) {
                    isWon = true;
                    break;
                }
                if (matrix[rowP][colP] == 'B') {
                    isDead = true;
                    break;
                }
            } else if (comand == 'U') {
                rowP--;
                if (rowP < 0) {
                    isWon = true;
                    break;
                }
                if (matrix[rowP][colP] == 'B') {
                    isDead = true;
                    break;
                }
            } else {//(comand == 'D')
                rowP++;
                if (rowP > rows - 1) {
                    isWon = true;
                    break;
                }
                if (matrix[rowP][colP] == 'B') {
                    isDead = true;
                    break;
                }
            }
        }


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
        if (isDead) {
            System.out.printf("dead: %d %d", rowP, colP);
        }
        if (isWon) {
            if (rowP < 0 || rowP > rows - 1) {
                rowP = Math.abs(rowP) - 1;
            }
            if (colP < 0 || colP > cols - 1) {
                colP = Math.abs(colP) - 1;
            }
            System.out.printf("won: %d %d", rowP, colP);
        }
    }
}
