import java.util.Arrays;
import java.util.Scanner;

public class P4PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (isValidWithLength(password)){
            if (isValidWithNoSymbols(password)){
                if (hasDigits(password)){
                    System.out.println("Password is valid");
                }
            }else {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!hasDigits(password)){
                System.out.println("Password must have at least 2 digits");
            }
        }else {
            System.out.println("Password must be between 6 and 10 characters");
            if (!isValidWithNoSymbols(password)){
                System.out.println("Password must consist only of letters and digits");

            }
            if (!hasDigits(password)){
                System.out.println("Password must have at least 2 digits");
            }
        }
    }
    public static boolean isValidWithLength(String text){
        if (text.length() >= 6 && text.length() <= 10){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isValidWithNoSymbols(String text){
        for (char symbol : text.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }
    public static boolean hasDigits(String text){
        int count = 0;
        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)){
                count++;
            }
        }
        if (count >= 2){
            return true;
        }else {
            return false;
        }
    }
}
