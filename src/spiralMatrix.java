import java.util.*;
public class spiralMatrix {
    static void printSpiralOrder(int[][] matrix,int r,int c) {
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalElements= 0;
        while(totalElements < r*c){
            //TOP ROW
            for(int j=leftCol;j<=rightCol && totalElements<r*c;j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            //RIGHT COLUMN
            for(int i=topRow;i<=bottomRow && totalElements<r*c;i++){
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
            //BOTTOM ROW
            for(int j=rightCol;j>=leftCol && totalElements<r*c;j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;

            }
            bottomRow--;
            //LEFT COLUMN
            for(int i=bottomRow;i>=topRow && totalElements<r*c;i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int r= sc.nextInt();
        System.out.println("Enter the no. of columns");
        int c= sc.nextInt();
        int[][] matrix= new int[r][c];

        System.out.println("Enter"+r*c+"elements");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        printArray(matrix);
        System.out.println("Spiral Format");
        printSpiralOrder(matrix,r,c);
    }
}
