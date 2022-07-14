package SpringBootTraining.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenNumberWithStreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>(); //create a ArrayList of type Integer
        System.out.print("Enter number of elements in list: ");
        int totalElements = scanner.nextInt();
        System.out.println("Enter the values in list: ");
        for (int i = 0; i < totalElements; i++) {
            numberList.add(scanner.nextInt());       //adding the values in list manually
        }
        //List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
        System.out.println("EvenNumber in List: ");
        List<Integer> evenNumbers = numberList.stream().filter(value -> value % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}