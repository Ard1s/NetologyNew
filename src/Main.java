import java.util.Random;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        System.out.println("Исходная матрица:");
        printMatrix(colors);

        int[][] rotatedColors = rotate90Clockwise(colors);

        System.out.println("\nПовернутая матрица:");
        printMatrix(rotatedColors);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotate90Clockwise(int[][] source) {
        int[][] rotated = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotated[i][j] = source[SIZE - 1 - j][i];
            }
        }

        return rotated;
    }
}
