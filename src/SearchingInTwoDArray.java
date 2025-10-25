import java.util.Arrays;

public class SearchingInTwoDArray {
    public static void main(String[] args) {

        int arr[][] = {
                { 1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int target = 8;
        int [] ans = findTarget(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(maximum(arr));


    }

    private static int maximum(int[][] arr) {
        if ( arr.length ==0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for ( int i=0; i < arr.length; i++){
            for ( int j =0; j< arr[i].length; j++){
                if ( max < arr[i][j]){
                    max= arr[i][j];
                }
            }
            return max;
        }
        return -1;
    }

    private static int[] findTarget(int[][] arr, int target) {
        for ( int i= 0; i < arr.length; i++){
            for ( int j = 0 ; j < arr[i].length; j++){
                if ( target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
