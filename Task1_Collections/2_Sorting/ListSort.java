package SpringBootTraining.Task1;

import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(); //create a ArrayList of type Integer
        System.out.print("Enter number of elements in list: " );
        int totalElements = scanner.nextInt();
        System.out.println("Enter the values in list: ");
        for(int i = 0; i < totalElements; i++) {
            list.add(scanner.nextInt());       //adding the values in list manually
        }
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList()); //sort a List with stream.sorted()
        System.out.print("Sorted List: "+sortedList);
        /*
        Collections.sort(list);  //sorting using Collections Sort method()
        System.out.println("Sorted List: "+list);
         */
    }
}