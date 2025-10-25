public class BinarySearch {
    public static void main(String[] args) {

        //to learn binary search

    }

    static int binS(int [] arrr, int tar){
        int s = 0;
        int e = arrr.length-1;

        while (s <= e){
            int mid = s + (e-s)/2;

            if ( arrr[mid] == tar){
                return mid;
            } else if ( arrr[mid] < tar) {
                s =mid +1;
                
            }else {
                e = mid -1;
            }
        }
    return -1;
    }
}
