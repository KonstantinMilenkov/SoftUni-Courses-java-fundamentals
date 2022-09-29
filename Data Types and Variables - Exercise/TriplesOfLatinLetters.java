import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++){
            for (int o = 0; o < number; o++){
                for (int p = 0; p < number; p++){
                    char firstCharacter = (char) ('a' + i);
                    char secondCharacter = (char) ('a' + o);
                    char thirdCharacter = (char) ('a' + p);
                    System.out.printf("%c%c%c%n", firstCharacter, secondCharacter, thirdCharacter);
                }
            }
        }
    }
}
