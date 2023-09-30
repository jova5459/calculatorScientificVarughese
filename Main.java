import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length Conversion:");
        System.out.println("1. Meters");
        System.out.println("2. Centimeters");
        System.out.println("3. Feet");
        System.out.println("4. Inches");
        System.out.println("5. Nanometers");
        System.out.println("6. Microns");
        System.out.println("7. Millimeters");
        System.out.println("8. Kilometers");
        System.out.println("9. Yards");
        System.out.println("10. Miles");
        System.out.println("11. Nautical Miles");


        int sourceUnit;


        do {
            System.out.print("Enter the source length unit (1/2/3/4/5/6/7/8/9/10/11): ");
            sourceUnit = scanner.nextInt();
            if (sourceUnit < 1 || sourceUnit > 11) {
                System.out.println("Invalid input. Please enter a number between 1 and 11.");
            }
        } while (sourceUnit < 1 || sourceUnit > 11);


        System.out.print("Enter the length value: ");
        double length = scanner.nextDouble();


        int targetUnit;


        do {
            System.out.print("Enter the target length unit (1/2/3/4/5/6/7/8/9/10/11): ");
            targetUnit = scanner.nextInt();
            if (targetUnit < 1 || targetUnit > 11) {
                System.out.println("Invalid input. Please enter a number between 1 and 11.");
            }
        } while (targetUnit < 1 || targetUnit > 11);


        System.out.println("Converted length: " + Converter.convertLength(length, sourceUnit, targetUnit));


        scanner.close();
    }
}
