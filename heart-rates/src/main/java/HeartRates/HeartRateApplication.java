package HeartRates;

import java.util.Scanner;

public class HeartRateApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type your name");
        String userName = input.next().trim();

        System.out.println("Type your last name");
        String userLastName = input.next().trim();

        System.out.println(" ");
        System.out.println("What's your birth date?");

        System.out.println("Day:");
        int birthDay;
        do {
            birthDay = input.nextInt();

            if (birthDay > 31){
                System.out.println("Invalid date! Type again...");
            }
        } while (birthDay > 31);

        System.out.println("Month:");
        int birthMonth;
        do {
            birthMonth = input.nextInt();

            if (birthMonth > 12) {
                System.out.println("Invalid date! Type again...");
            }
        } while (birthMonth > 12);

        System.out.println("Year:");
        int birthYear;
        do {
            birthYear = input.nextInt();

            if (birthYear > 2025) {
                System.out.println("Invalid date! Type again...");
            }
        } while (birthYear > 2025);

        HeartRate newUser = new HeartRate(userName, userLastName, birthDay, birthMonth, birthYear);

        System.out.println(" ");

        System.out.println("Full name: " + newUser.getUserName(userName, userLastName));
        System.out.println("Birth date: " + newUser.getBirthDate());
        System.out.println("Age: " + newUser.getUserAge());
        System.out.println("Maximum Heart Rate: " + newUser.getHeartRate() + " bpm");
        System.out.println("Target Heart Rate: " + newUser.getTargetHeartRate() + " bpm");
    }
}