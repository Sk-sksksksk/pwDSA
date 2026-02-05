import java.util.*;
public class nSpiralMatrix{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        int[][] matrix= printSpiralOrder(n);
       //* int count = 1;
        //System.out.println("Enter "+n*n+"elements");
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                matrix[i][j]= count;
//                count++;
//            }
//        }
       // printSpiralOrder(n);
        //System.out.println(matrix);
       // Arrays.toString(matrix);
        printArray(matrix);
    }
   public static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
   }
    static int[][] printSpiralOrder(int n) {
        int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;
      //  int count= 0;
        int count =1;
        int[][] matrix= new int[n][n];
        while(count <= n*n){
            //TOP ROW
            for(int j=leftCol;j<=rightCol && count<=n*n;j++){
               // System.out.print(matrix[topRow][j]+" ");
                matrix[topRow][j]= count++;
              //  totalElements++;
            }
            topRow++;
            //RIGHT COLUMN
            for(int i=topRow;i<=bottomRow && count<=n*n;i++){
                matrix[i][rightCol]= count++;
              //  totalElements++;
            }
            rightCol--;
            //BOTTOM ROW
            for(int j=rightCol;j>=leftCol && count<=n*n;j--){
                matrix[bottomRow][j]= count++;
              //  totalElements++;

            }
            bottomRow--;
            //LEFT COLUMN
            for(int i=bottomRow;i>=topRow && count<=n*n;i--){
                matrix[i][leftCol]= count++;
               // totalElements++;
            }
            leftCol++;
        }
        return matrix;
    }
}


