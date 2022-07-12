package SpringBootTraining.Task1;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a element to convert: ");
        int decimalNum = Integer.parseInt(scanner.next());
        long binaryNum=convertDecimalToBinary(decimalNum);  // call method
        System.out.println(decimalNum + " in binary number is: " + binaryNum );
        scanner.close();
        /*
        System.out.print("Enter an elements: ");
        System.out.println(Integer.toBinaryString(scanner.nextInt())); //using toBinaryString method() to convert
         */
    }

    static long convertDecimalToBinary(int decimalNumber) {
        long binaryNumber = 0;
        int remainder, i = 1;
        while (decimalNumber!=0) {
            remainder = decimalNumber % 2;
            decimalNumber /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
}