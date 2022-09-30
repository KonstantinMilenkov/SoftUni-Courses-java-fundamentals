import java.util.Scanner;

public class TenPadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double  lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double  robesPrice = Double.parseDouble(scanner.nextLine());
        double  beltsPrice = Double.parseDouble(scanner.nextLine());

        int freeBelts = studentsCount / 6;
        double sum = lightsabersPrice * Math.ceil(studentsCount + studentsCount * 0.10) + studentsCount * robesPrice + beltsPrice * (studentsCount - freeBelts);

        if (budget >= sum){
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(budget - sum));
        }
    }
}
