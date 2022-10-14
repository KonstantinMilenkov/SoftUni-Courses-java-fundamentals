import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class P2VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        printResult(word.toLowerCase());
    }
    public static void printResult(String text){

        int vowelsCount = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'){
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }
}
