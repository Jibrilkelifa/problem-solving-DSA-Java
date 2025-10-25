import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.io.FileDescriptor.in;


public class Main {
    public static void main(String[] args) {

        int[] ros; //only declaration at Compile time;

        int[] arr = {1,2,3,4,5,6,7,8};

        int[] m = swwap(arr);

        System.out.print(Arrays.toString(m));
        //find the max value of the number from the arrays

    }

    private static int[] swwap(int[] arr) {
        int start = 0;
        int end   = arr.length-1;

        for ( int j = 0 ; j < arr.length; j++){
            int f = arr[start];
            arr[start] = arr[end];
            arr[end]   = f;
            start++;
            end--;
        }
        return arr;
    }

    static int max(int[] arr) {

        if ( arr.length == 0){
            return -1;
        }
        int maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;


    }

}