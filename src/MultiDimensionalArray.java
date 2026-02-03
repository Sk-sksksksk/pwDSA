import java.util.Scanner;

public class MultiDimensionalArray {
    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if(r1 != r2 || c1 != c2) {
            System.out.println("Wrong input - Addition not possible");
            return;

        }
        int [][] sum = new int [r1][c1];
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
            printArray(sum);
        }
       // return sum;
    }
    static void printArray(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //int[][] arr= new int[2][3];
        //  int [][] arr2 = { {1, 5, 6}, {2, 4, 7},{11, 458, 436}    };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows  of matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter no. of columns of matrix 1");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.print("Enter" + r1 * c1 + "elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter no. of rows  of matrix 2");
        int r2 = sc.nextInt();
        System.out.println("Enter no. of columns of matrix 2");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.print("Enter" + r2 * c2 + "elements");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        add(arr1, r1, c1, arr2, r2, c2);

        //printArray();
    }


    }



