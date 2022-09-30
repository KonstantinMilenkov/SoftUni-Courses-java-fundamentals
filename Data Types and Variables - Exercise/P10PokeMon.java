import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int beginningPokePowers = pokePower;

        int pokePokes = 0;

        while (pokePower >= distance){
            pokePower -= distance;
            pokePokes++;
            if (pokePower == beginningPokePowers / 2){
                if (exhaustionFactor != 0) {
                    pokePower = pokePower / exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(pokePokes);
    }
}
