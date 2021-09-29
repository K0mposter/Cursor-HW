package HW3;

import java.util.Scanner;

public class Circle {
    static Scanner Rad = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter radius");
        double radius = Rad.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Area =" + area);

    }
}