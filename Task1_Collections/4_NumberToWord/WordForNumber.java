package SpringBootTraining.Task1;

import java.util.Scanner;

public class WordForNumber {
    public static String[] units = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"}; //1 to 20 digits store in an array
    public static String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"}; //tens values in another array

    public static String convertToWord(int n){
        if(n<0 || n>100) {
            return "Enter a number between 0 and 100.";     //check the condition
        }
        else{
            if(n<20){
                return units[n]; //return value between 0 and 20
            }
            if(n<100){
                return tens[n/10] + ((n%10 != 0) ? " " : "") + units[n%10];  //return value between 20 and 100
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to convert into word: ");
        int number = scanner.nextInt();
        System.out.println(number+" = '" + convertToWord(number) + "'");
    }
}
