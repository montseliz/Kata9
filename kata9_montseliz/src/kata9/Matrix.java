package kata9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Matrix {

    private int[][] matrix;

    public Matrix() {
        matrix = new int[4][4];
    }

    public void createMatrix(){

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public void printMatrix() {

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public void showMainDiagonal() {
        List<Integer> diagonalNumbers = new ArrayList<>();
        int total= 0;

        for (int i = 0; i < matrix.length; i++) {
            diagonalNumbers.add(matrix[i][i]);
        }

        for (Integer integer :diagonalNumbers) {
            total += integer;
        }
        System.out.println("The total sum of the main diagonal is: " + total);
    }

    public void showMainDiagonal2() {
        int total = IntStream.range(0, matrix.length)
                             .map(i -> matrix[i][i])
                             .sum();
        System.out.println("The total sum of the main diagonal is: " + total);
    }

}
