package Arrays;

public class Two {

    int[][] matrix = {{1, 2, 3}, {1, 2, 3}};

    public void printTwo() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Two object = new Two();
        object.printTwo();
    }
}
