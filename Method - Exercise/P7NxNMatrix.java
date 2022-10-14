import java.util.Scanner;

public class P7NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printResult(number);
    }
    public static void printResult(int n){
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");
            }
        }
    }
}
