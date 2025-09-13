
import java.util.Scanner;

public class MinMax {
    private static Scanner sc = new Scanner(System.in);
    //Function to return min element
    public static int getMin(int num[]){
        int min = num[0];
        for(int i=0; i<num.length ; i++){
            if(min > num[i]){
                min = num[i];
            }
        }
        return min;
    }

    //Function to return max element
    public static int getMax(int num[]){
        int max = num[0];
        for(int i=0 ; i<num.length ;i++){
            if(max < num[i]){
                max = num[i];
            }
        }
        return max;
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
        int size;
        System.out.print("Enter size of Array: ");
        size = sc.nextInt();
        int num[] = new int[size];
        insertArray(num);
        printArray(num);

        System.out.println("Min Element : " + getMin(num));
        System.out.println("Max Element : " + getMax(num));
    }
}