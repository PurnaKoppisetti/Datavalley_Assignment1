
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();
            
            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();
            
            double result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException ex) {
            System.out.println( ex.getMessage());
        } catch (Exception ex) {
            System.out.println( ex.getMessage());
        } finally {
            sc.close();
        }
    }
    
    public static double divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) numerator / denominator;
    }
}
