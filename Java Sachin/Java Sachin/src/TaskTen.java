

/*
Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125

 */





import java.util.Scanner;

public class TaskTen {

    public static void main(String[] args) {
        Scanner ope=new Scanner(System.in); // object operation
        System.out.println("Enter First Num");
        int a = ope.nextInt();
        System.out.println("Enter Second Num");
        int b = ope.nextInt();
        System.out.println("Result is : "+  (a*b));

    }

}
