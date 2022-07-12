package SpringBootTraining.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
    String studentName;
    int studentAge;
    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
    @Override public String toString() {
        return studentName+ " "+ studentAge;
    }

    @Override public int compareTo(Student studentAgeToCompare) {   //using compareTo
        return Integer.compare(this.studentAge, studentAgeToCompare.studentAge); //using compare method from integer class
    }
}

public class CustomSort{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Student> studentList=new ArrayList<>();
        System.out.print("Enter the number of students:");
        int size=scanner.nextInt();
        System.out.println("Enter the name and age of student: ");
        for(int i=0;i<size;i++){        //values are added in Arraylist
            studentList.add(new Student(scanner.next(),scanner.nextInt()));
        }
        Collections.sort(studentList); //sorting the list
        for (Student studentToCompare : studentList) {
            System.out.println(studentToCompare.studentName+" "+studentToCompare.studentAge);
        }
    }
}