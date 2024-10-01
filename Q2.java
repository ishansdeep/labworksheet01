import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (first middle last): ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");

        if (nameParts.length < 3) {
            System.out.println("Please enter your full name in the format: first middle last.");
        } else {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            char middleInitial = middleName.charAt(0);
            String formattedName = lastName + ", " + firstName + " " + middleInitial + ".";

            System.out.println(formattedName);
        }

        scanner.close();
    }
}
