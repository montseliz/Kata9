package kata9;

public class Main {
    public static void main(String[] args) {

       Matrix matrix = new Matrix();

        matrix.createMatrix();
        matrix.printMatrix();

        System.out.println("");

        matrix.showMainDiagonal();
        matrix.showMainDiagonal2();
    }

}