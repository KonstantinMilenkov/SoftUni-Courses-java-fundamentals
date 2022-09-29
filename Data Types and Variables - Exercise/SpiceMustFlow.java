import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spices = Integer.parseInt(scanner.nextLine());

        int daysWorked = 0;
        int totalConsumed = 0;
        int yield = spices;

        while(yield >= 100){
            int source = yield - 26;
            daysWorked++;
            totalConsumed += source;
            yield -= 10;
        }
        System.out.println(daysWorked);
        if (totalConsumed >= 26) {
            System.out.println(totalConsumed - 26);
        }else {
            System.out.println(totalConsumed);
        }
    }
}
