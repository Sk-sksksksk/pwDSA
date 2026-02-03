import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows and columns");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] matrix= new int[r][c];
        int totalElements = r*c;
        System.out.println("enter"+totalElements+"values");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printArray(matrix);
        System.out.println("Output Matrix");
        int[][] ans= findTranspose(matrix,r,c);
        printArray(ans);
    }
    static void printArray(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] matrix, int r, int c) {
        int[][] transpose= new int[c][r];
        for(int i=0;i<c;i++) {
            for (int j = 0; j < r; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
            }
        }



