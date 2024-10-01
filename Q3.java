import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in centimeters: ");
        double centimeters = scanner.nextDouble();

        double totalInches = centimeters / 2.54;
        int feet = (int) (totalInches / 12);
        int inches = (int) (totalInches % 12);

        System.out.println(centimeters + " cm is equivalent to " + feet + " feet and " + inches + " inches.");

        scanner.close();
    }
}
