public class FindMinAndMax {
    public static void main(String[] args) {

        int [] arr = { 1,2,3,4,5,6,7,8};

        System.out.println(findMaximum(arr));
     }

    private static int findMaximum(int[] arr) {

        if ( arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for( int i = 0; i < arr.length; i++){

            if ( arr[i] >= max){
                max= arr[i];
            }
        }
        return max;
    }
}
