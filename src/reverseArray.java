import java.util.*;
public class reverseArray {
//class Solution {

    public static void reversArray(int arr[]) {
        int count=0;
        // code here
        int n= arr.length;
        int[] arr2= new int[n];
        for (int i=n-1;i>=0;i--){
            arr2 [count]= arr[i];
            count++;


        }
        // printArray(arr2);
        System.out.println(Arrays.toString(arr2));
        //System.out.println(arr2)
    }
    //
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //System.out.println("Enter the no. of elements");
        int n= sc.nextInt();
        int[] ar= new int[n];
        for (int i=0;i<n;i++){
            ar[i]= sc.nextInt();
        }
        reversArray(ar);
        // printArray(arr2);
        //System.out.println("Original array"+printArray(ar));
        //System.out.println("Reversed array"+reverseArray(ar));
        //reverseArray(ar);

    }
}

