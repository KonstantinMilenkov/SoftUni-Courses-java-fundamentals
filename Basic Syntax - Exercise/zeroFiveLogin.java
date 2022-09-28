import java.util.Scanner;

public class zeroFiveLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";
        int count = 0;

        for (int position = username.length() - 1; position >= 0; position--){
            char symbol = username.charAt(position);
            password += symbol;
        }
        String attempts = scanner.nextLine();
        while (!attempts.equals(password)) {
            String attemptsSome = attempts;
            count++;
            if (count == 4){
                break;
            }
            System.out.println("Incorrect password. Try again.");
            attempts = scanner.nextLine();
        }
        if (attempts.equals(password)) {
            System.out.printf("User %s logged in.", username);
        } else {
            System.out.printf("User %s blocked!", username);
        }
    }
}
