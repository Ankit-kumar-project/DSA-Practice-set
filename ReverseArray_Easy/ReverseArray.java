package ReverseArray_Easy;
import java.util.Scanner;
public class ReverseArray {
    private static Scanner sc = new Scanner(System.in);

    //Function to reverse an array
    public static void reverseArray(int num[],int size){
        for(int i=0; i<size/2; i++){
            int temp = num[i];
            num[i] = num[size-i-1];
            num[size-i-1] = temp;
        }
    }

    //Function to insert into Array
     public static void insertArray(int num[]){
        System.out.print("Enter element of array : ");
        for(int i=0 ; i<num.length ;i++){
            num[i]=sc.nextInt();
        }
    }

    //Function to print Array
     public static void printArray(int num[]){
        System.out.print("Array: ");
        for(int i=0 ; i<num.length ;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //Declare array
        int size;
        System.out.print("Enter size of Array: ");
        size = sc.nextInt();
        int num[] = new int[size];

        //Insert user defined data
        insertArray(num);
        System.out.println("Original Array: ");
        printArray(num);

        //reverse array
        System.out.println("Reverse Array");
        reverseArray(num,size);
        printArray(num);

    }

}
