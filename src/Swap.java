import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        System.out.println("write java program to check weather the input number is prime or not prime");



        int n = 7;
        String F= prime(n);
        System.out.println(F);

    }

     static String prime(int n) {
        int c = 2;
        String m;
        if ( n <= 1){
            m= "is not prime";
            return m;
        }
        while ( c*c <= n){
            if ( n%c ==0){
                m= "is not prime ";
                return  m;
            }
             c++;
        }
        m= "Prime";

        return  m;


    }




}
