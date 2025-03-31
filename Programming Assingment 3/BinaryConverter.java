import java.util.Scanner;

class BinaryFormatException extends NumberFormatException {
    public BinaryFormatException(String message) {
        super(message);
    }
}

public class BinaryConverter {
    
    //Convert binary string to dec
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        //Make sure it's only 1's and 0's
        for (char ch : binaryString.toCharArray()) {
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Not a binary number");
            }
        }
        
        return Integer.parseInt(binaryString, 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //get user input
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
    
        try {
            int decimal = bin2Dec(binaryString);
            System.out.println("Decimal equivalent: " + decimal);
        } catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
