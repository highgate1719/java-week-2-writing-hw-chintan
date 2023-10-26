package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */


public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the Triangle  :");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of the Triangle  :");
        int height = scanner.nextInt();

        scanner.close();
    }
    public static void areaOfTriangle(int length, int height) {
        int area = (length * height) / 2;
        System.out.println("The area of a triangle is :  " + area);
    }
}
