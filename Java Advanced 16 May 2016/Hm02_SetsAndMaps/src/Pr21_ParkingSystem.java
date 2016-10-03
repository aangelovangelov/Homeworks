import java.util.Scanner;

public class Pr21_ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();

        int[][] matrix = new int[rows][];

        while (true) {
            String line = sc.nextLine();
            if ("stop".equals(line)) {
                break;
            }

            String[] input = line.split(" ");
            int entryRow = Integer.parseInt(input[0]) - 1;
            int desiredRow = Integer.parseInt(input[1]);
            int desiredCol = Integer.parseInt(input[2]);
            int distance = Math.abs(desiredRow - entryRow) + desiredCol;

            if (matrix[desiredRow] == null) {
                matrix[desiredRow] = new int[cols];
                matrix[desiredRow][desiredCol] = 1;
                System.out.println(distance);
                continue;
            }

            if (matrix[desiredRow][desiredCol] != 1) {
                matrix[desiredRow][desiredCol] = 1;
                System.out.println(distance);
                continue;
            }

            int leftIndex = desiredCol;
            int rightIndex = desiredCol;


            if (matrix[desiredRow][desiredCol] == 1) {

                int incrementator = 0;
                while (true) {

                    int sum = 0;
                    for (int col = 1; col < matrix[desiredRow].length; col++) {
                        sum += matrix[desiredRow][col];
                    }
                    if (sum == cols - 1) {
                        System.out.printf("Row %d full%n", desiredRow);
                        incrementator++;
                        break;
                    }

                    if (leftIndex < 1 && incrementator % 2 == 0) {
                        incrementator++;
                    }
                    if (rightIndex > cols - 1 && incrementator % 2 != 0) {
                        incrementator++;
                    }

                    if (incrementator % 2 == 0) {

                        leftIndex--;
                        if (leftIndex > 0 && matrix[desiredRow][leftIndex] != 1) {
                            matrix[desiredRow][leftIndex] = 1;
                            distance = Math.abs(desiredRow - entryRow) + leftIndex;
                            System.out.println(distance);
                            incrementator++;
                            break;
                        }

                    } else {

                        rightIndex++;
                        if (rightIndex < cols && matrix[desiredRow][rightIndex] != 1) {
                            matrix[desiredRow][rightIndex] = 1;
                            distance = Math.abs(desiredRow - entryRow) + rightIndex;
                            System.out.println(distance);
                            incrementator++;
                            break;
                        }

                    }

                    incrementator++;
                }
            }
        }
    }
}
