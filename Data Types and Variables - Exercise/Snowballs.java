import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballsMade = Integer.parseInt(scanner.nextLine());
        int snowballBiggest = 0;
        int snowballBestTime = 0;
        int snowballBestQuality = 0;

        double snowballValue = 0;

        double max = Double.MIN_VALUE;
        for(int i = 1; i <= snowballsMade; i++){

            int snowballsSnow = Integer.parseInt(scanner.nextLine());
            int snowballsTime = Integer.parseInt(scanner.nextLine());
            int snowballsQuality = Integer.parseInt(scanner.nextLine());

            int snowballDivide = snowballsSnow / snowballsTime;
            snowballValue = Math.pow(snowballDivide, snowballsQuality);

            if (snowballValue > max){
                max = snowballValue;
                snowballBiggest = snowballsSnow;
                snowballBestTime = snowballsTime;
                snowballBestQuality = snowballsQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballBiggest, snowballBestTime, max, snowballBestQuality);
    }
}
