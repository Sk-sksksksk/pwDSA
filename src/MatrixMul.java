import java.util.Scanner;

public class MatrixMul {
    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two matrices");
        printMatrix(mul);
    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows  of matrix 1");
        int row1 = sc.nextInt();
        System.out.println("Enter no. of columns of matrix 1");
        int col1 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        System.out.print("Enter" + row1 * col1 + "elements");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter no. of rows  of matrix 2");
        int row2 = sc.nextInt();
        System.out.println("Enter no. of columns of matrix 2");
        int col2 = sc.nextInt();
        int[][] arr2 = new int[row2][col2];
        System.out.print("Enter" + row2 * col2 + "elements");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }


        }
        multiply(arr1, row1, col1, arr2, row2, col2);
    }
}
