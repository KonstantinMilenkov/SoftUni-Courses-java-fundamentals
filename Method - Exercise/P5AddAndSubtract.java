import java.util.Scanner;

public class P5AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        int addSum = printFirstTwoDigitsSum(numberOne, numberTwo);
        int subtract = printSubtractSum(addSum, numberThree);

        System.out.println(subtract);

    }
    public static int printFirstTwoDigitsSum(int n, int m){
        return n + m;
    }
    public static int printSubtractSum (int n , int m){
        return n - m;
    }
}
