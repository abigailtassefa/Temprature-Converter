import java.util.Scanner;

public class convertTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble(); // correct input

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

        // Reverse conversion
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;

        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");

        scanner.close();
    }
}