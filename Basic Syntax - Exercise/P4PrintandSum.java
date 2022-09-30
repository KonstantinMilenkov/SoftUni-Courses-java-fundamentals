import java.util.Scanner;

public class zeroFourPrintandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int n1 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i  = n; i <= n1; i++){
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
