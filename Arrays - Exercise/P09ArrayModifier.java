import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.contains("swap")){
                int swappingNumberOne = Integer.parseInt(command.split(" ")[1]);
                int swappingNumberTwo = Integer.parseInt(command.split(" ")[2]);

                int firstElement = numbers[swappingNumberOne];
                int secondElement = numbers[swappingNumberTwo];

                numbers[swappingNumberOne] = secondElement;
                numbers[swappingNumberTwo] = firstElement;
            } else if (command.contains("multiply")) {
                int multiplyNumberOne = Integer.parseInt(command.split(" ")[1]);
                int multiplyNumberTwo = Integer.parseInt(command.split(" ")[2]);

                numbers [multiplyNumberOne] = numbers[multiplyNumberOne] * numbers[multiplyNumberTwo];

            } else if (command.equals("decrease")) {
                for (int index = 0; index <= numbers.length - 1; index++){
                    numbers[index] = numbers[index] - 1;
                }
            }
            command = scanner.nextLine();
        }
        for (int number = 0;number <= numbers.length - 1; number++) {
            int currentNumber = numbers[number];
            if (number < numbers.length - 1) {
                System.out.print(currentNumber + ", ");
            }else if (number == numbers.length -1){
                System.out.print(currentNumber);
            }
        }
    }
}
