import java.util.Scanner;

public class P6MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String something = scanner.nextLine();

        printMiddlePart(something);
    }
    public static void printMiddlePart(String text){

        if (text.length() % 2 != 0){
            int middleNumber = text.length() / 2;
            System.out.println(text.charAt(middleNumber));
        } else {
            int firstNumber = text.length() / 2 - 1;
            int secondNumber = text.length() / 2;

            System.out.println("" + text.charAt(firstNumber) + text.charAt(secondNumber));
        }
    }
}
