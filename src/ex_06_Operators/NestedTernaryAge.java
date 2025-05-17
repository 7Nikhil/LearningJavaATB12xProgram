package ex_06_Operators;

import java.util.Scanner;

public class NestedTernaryAge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age=scanner.nextInt();
        System.out.println(age>18?(age>65?"I am Senior":"I am adult"):"I am Minor");

    }
}
