import java.util.Scanner;

public class P3CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String symbolOne = scanner.nextLine();
        String symbolTwo = scanner.nextLine();

        printChats(symbolOne, symbolTwo);
    }
    public static void printChats(String n1 , String n2){
        char symbolOne = n1.charAt(0);
        char symbolTwo = n2.charAt(0);
        if (symbolOne < symbolTwo) {
            for (int i = symbolOne + 1; i < symbolTwo; i++) {
                System.out.print((char) i + " ");
            }
        }else {
            for (int i = symbolTwo + 1; i < symbolOne; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}