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
//  Fibonacci using recursion
// public class Fibonacci {
//
//    static int fib(int n) {
//        if (n <= 1)
//            return n;
//        return fib(n - 1) + fib(n - 2);
//    }
//
//    public static void main(String[] args) {
//        int n = 10;
//        System.out.print("Fibonacci Series: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fib(i) + " ");
//        }
//    }
//}
