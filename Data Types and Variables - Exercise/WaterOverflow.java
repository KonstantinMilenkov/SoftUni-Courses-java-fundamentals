import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int waterTankCapacity = 255;
        int litersIn = 0;
        for (int i = 1; i <= number; i++){

            int litersToPour = Integer.parseInt(scanner.nextLine());
            if (litersToPour <= waterTankCapacity){
                waterTankCapacity -= litersToPour;
                litersIn += litersToPour;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(litersIn);
    }
}
