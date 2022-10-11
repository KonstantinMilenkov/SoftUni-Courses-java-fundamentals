import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] numbersArray = new int[number];

        int sum = 0;

        for (int i = 0; i < number ;i++){
            int numbers = Integer.parseInt(scanner.nextLine());
            numbersArray[i] = numbers;
        }
        for (int numbers : numbersArray){
            sum += numbers;
            System.out.print(numbers + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}