package com.Overriding.A;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        Trapezium trapezium = new Trapezium();
        Triangle triangle = new Triangle();

        System.out.println("Uchburchak a-tomonini kiriting :");
        double a1 = scanner.nextDouble();
        System.out.println("Uchburchak b-tomonini kiriting :");
        double b1 = scanner.nextDouble();
        System.out.println("Uchburchak c-tomonini kiriting :");
        double c1 = scanner.nextDouble();

        triangle.setA(a1);
        triangle.setB(b1);
        triangle.setC(c1);

        System.out.println();
        System.out.println("Uchburchak natijalari :");

        triangle.area();
        triangle.perimeter();

        System.out.println();
        System.out.println("Trapetsiya a-tomonini kiriting :");
        double a2 = scanner.nextDouble();
        System.out.println("Trapetsiya b-tomonini kiriting :");
        double b2 = scanner.nextDouble();
        System.out.println("Trapetsiya h-balandligini kiriting :");
        double h = scanner.nextDouble();

        trapezium.setA(a2);
        trapezium.setB(b2);
        trapezium.setH(h);

        System.out.println();
        System.out.println("Trapetsiya natijalari :");

        trapezium.area();
        trapezium.perimeter();

        System.out.println();
        System.out.println("To'g'ri tortburchak a-tomonini kiriting :");
        double a3 = scanner.nextDouble();
        System.out.println("To'g'ri tortburchak b-tomonini kiriting :");
        double b3 = scanner.nextDouble();

        rectangle.setA(a3);
        rectangle.setB(b3);

        System.out.println();
        System.out.println("To'g'ri tortburchak natijalari :");

        rectangle.area();
        rectangle.perimeter();
    }
}
