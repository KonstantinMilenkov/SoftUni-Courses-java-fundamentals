import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            if (canBeDivided(i) && hasOddDigit(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean canBeDivided (int n ){
       int sumDigits = 0;
       while(n > 0){
           sumDigits += n % 10 ;

           n = n / 10;
       }
       return sumDigits % 8 == 0;
    }
    public static boolean hasOddDigit(int n){
        while (n > 0){
           int newNumber = n % 10;
           if (newNumber % 2 != 0){
               return true;
           }else {
               n = n / 10;
           }
        }
        return false;
    }
}
