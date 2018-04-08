package math;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int prev=0;
        int next=1;
        int counter =40;
        for (int n=0;n<counter; n++){
            System.out.println(prev+" ");
            prev=prev+next;
            next=prev-next;
        }

    }
}
