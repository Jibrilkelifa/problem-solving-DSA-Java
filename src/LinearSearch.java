public class LinearSearch {
    public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6};

    int m = linearS( arr, 6, 1, 5);
        System.out.println(m);

    }

    static int  linearS(int[] arrr, int tar, int start, int end){
        if (arrr.length == 0){
            return -1;
        }
        for ( int i = start; i < end; i ++){
            if (tar == arrr[i]){
                return i;
            }
        }
        return -1;

    }

}
