package demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("do you want to add a student?(y/n)");
        Scanner sc = new Scanner(System.in);
        String y = sc.next();
        if(y.equalsIgnoreCase("y")){
            System.out.println("enter student name: ");
            String name = sc.next();
            System.out.println("enter student GPA");
            double GPA = sc.nextDouble();
            Student s = new Student(name, GPA);
            System.out.println("student created");
            System.out.println(s.toString());
        }
	// write your code here
    }
}
