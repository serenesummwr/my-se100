import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        final double PI = 3.1428;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();
        double area = radius * radius * PI;
        double volume = area * length;

        System.out.printf("The volume of the cylinder is %.2f cubic units.%n", volume); 
        
        // Necessary to close the scanner
        input.close();
    }
}