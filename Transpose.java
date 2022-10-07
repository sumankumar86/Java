public class Transpose {
  public static void main(String args[]) {

    int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 7, 9 } };
    int transpose[][] = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        transpose[j][i] = arr1[i][j];
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(transpose[i][j] + " ");

        if (j == 2) {
          System.out.println();
        }

      }

    }
  }
}
