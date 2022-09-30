import java.util.Scanner;

public class zeroThreeVacation{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int number = Integer.parseInt(scanner.nextLine());
            String groupType = scanner.nextLine();
            String day = scanner.nextLine();

            double sum = 0;

            if (day.equals("Friday")){
                if (groupType.equals("Students")){
                    sum = number * 8.45;
                    if (number >= 30){
                        sum = sum * 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    if (number >= 100){
                        number = number - 10;
                        sum = number * 10.90;
                    }else {
                        sum = number * 10.90;
                    }

                } else if (groupType.equals("Regular")) {
                    sum = number * 15;
                    if (number >= 10 && number <= 20){
                        sum = sum * 0.95;
                    }
                }
            }else if (day.equals("Saturday")){
                if (groupType.equals("Students")){
                    sum = number * 9.80;
                    if (number >= 30){
                        sum = sum * 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    if (number >= 100){
                        number = number - 10;
                        sum = number * 15.60;
                    }else {
                        sum = number * 15.60;
                    }

                } else if (groupType.equals("Regular")) {
                    sum = number * 20;
                    if (number >= 10 && number <= 20){
                        sum = sum * 0.95;
                    }
                }
            } else if (day.equals("Sunday")) {
                if (groupType.equals("Students")){
                    sum = number * 10.46;
                    if (number >= 30){
                        sum = sum * 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    if (number >= 100){
                        number = number - 10;
                        sum = number * 16;
                    }else {
                        sum = number * 16;
                    }

                } else if (groupType.equals("Regular")) {
                    sum = number * 22.50;
                    if (number >= 10 && number <= 20){
                        sum = sum * 0.95;
                    }
                }
            }
            System.out.printf("Total price: %.2f", sum);
        }
}
