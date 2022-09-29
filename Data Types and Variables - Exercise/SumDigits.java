import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int newNumber = 0;

        while (number > 0){
            newNumber = number % 10;
            sum += newNumber;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
