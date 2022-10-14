import java.util.Scanner;

public class P9PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")){
            if (printPalindrome(command)){
                System.out.println("true");
            }else if (!printPalindrome(command)){
                System.out.println("false");
            }
            command = scanner.nextLine();
        }

    }
    public static boolean printPalindrome(String command){
        String reversed = "";
        for (int i = command.length() - 1; i >= 0 ; i--) {
            reversed += command.charAt(i);
        }
        return command.equals(reversed);
    }
}
