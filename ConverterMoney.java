import java.util.Scanner;

public class ConverterMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double EXCHANGE_RATE = 31.8245;

        System.out.print("Enter the amount in USD: ");
        double usdAmount = scanner.nextDouble();
              
        double convertedAmount = usdAmount * EXCHANGE_RATE;
        
        System.out.println("Converted amount: " + convertedAmount);
        
        scanner.close();
    }
}