import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        int courses = 0;
        while (numberOfPeople > 0){
            if (numberOfPeople >= elevatorCapacity){
                numberOfPeople -= elevatorCapacity;
                courses++;
            }else {
                courses++;
                break;
            }
        }
        System.out.println(courses);
    }
}
