import java.util.Scanner;

public class zeroSevenVendingMashine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0;
        while (!command.equals("Start")) {
            double number = Double.parseDouble(command);
            if (number == 0.1) {
                sum += 0.1;
            } else if (number == 0.2) {
                sum += 0.2;
            } else if (number == 0.5) {
                sum += 0.5;
            } else if (number == 1) {
                sum += 1;
            } else if (number == 2) {
                sum += 2;
            } else {
                System.out.printf("Cannot accept %.2f%n", number);
            }
            command = scanner.nextLine();
        }
        String command1 = scanner.nextLine();
        while (!command1.equals("End")) {
            String food = command1;
            switch (food) {
                case "Nuts":
                    double nuts = 2;
                    if (sum < nuts) {
                        System.out.println("Sorry, not enough money");
                        break;
                    } else {
                        System.out.println("Purchased Nuts");
                    }
                    sum -= nuts;
                    break;
                case "Water":
                    double water = 0.7;
                    if (sum < water) {
                        System.out.println("Sorry, not enough money");
                        break;
                    } else {
                        System.out.println("Purchased Water");
                    }
                    sum -= water;
                    break;
                case "Crisps":
                    double crisps = 1.5;
                    if (sum < crisps) {
                        System.out.println("Sorry, not enough money");
                        break;
                    } else {
                        System.out.println("Purchased Crisps");
                    }
                    sum -= crisps;
                    break;
                case "Soda":
                    double soda = 0.8;
                    if (sum < soda) {
                        System.out.println("Sorry, not enough money");
                        break;
                    } else {
                        System.out.println("Purchased Soda");
                    }
                    sum -= soda;
                    break;
                case "Coke":
                    double coke = 1;
                    if (sum < coke) {
                        System.out.println("Sorry, not enough money");
                        break;
                    } else {
                        System.out.println("Purchased Coke");
                    }
                    sum -= coke;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            command1 = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}