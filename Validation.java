import java.util.Scanner;

class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class Validation{
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            int inputNumber = sc.nextInt();
            validateNumber(inputNumber);
            System.out.println("Number is valid.");
        } 
        catch (CustomValidationException ex) {
            System.out.println("Validation Error: " + ex.getMessage());
        }
         catch (Exception ex) {
            System.out.println("Input Error: " + ex.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}