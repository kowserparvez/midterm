package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        perMutation("","ABC");
    }
    public static void perMutation(String a, String b){
        int x = b.length();
        if(x==0){
            System.out.println(a);
        }else {
            for (int i=0;i<x;i++){
                perMutation(a+b.charAt(i),b.substring(0,i)+b.substring(i+1,x));
            }
        }
    }
}
