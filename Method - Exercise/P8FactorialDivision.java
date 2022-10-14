import java.util.Scanner;

public class P8FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        printFactorial(numberOne, numberTwo);

    }
    public static void printFactorial(int n , int m){
        long factOne = 1;
        long factTwo = 1;
        for (int i = n; i > 0; i--) {
            factOne *= i;
        }
        for (int i = 1; i <= m; i++) {
            factTwo *= i;
        }
        double divide = factOne * 1.0 / factTwo;
        System.out.printf("%.2f", divide);
    }
}
