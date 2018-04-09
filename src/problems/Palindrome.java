package problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String pal = "madam";
        int ponitA = 0;
        int pontZ=pal.length()-1;
        boolean isPal=true;
        while(ponitA<pontZ)
        {
            String firstLetter = pal.substring(ponitA,ponitA+1);
            String lastLetter = pal.substring(pontZ,pontZ+1);
            if (firstLetter.equals(lastLetter)==false){
                isPal=false;
                break;
            }
            ponitA++;
            pontZ--;
        }
        if (isPal==true){
            System.out.println(pal+" is palindrom");
        }



    }
}
