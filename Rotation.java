import java.util.*;

public class Rotation {

    public static void main(String args[]) {
        int row, col;

        System.out.println("Enter the number of rows:");
        Scanner obj = new Scanner(System.in);
        row = obj.nextInt();
        System.out.println("Enter the number of columns:");
        col = obj.nextInt();
        System.out.println("Enter the element of matrix:");
        int arr[][] = new int[row][col];
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                arr[i][j] = obj.nextInt();

            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];

            }
        }
System.out.println("Transpose Matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();
        }

    }
}
