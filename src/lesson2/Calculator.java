package lesson2;

import java.util.Scanner;

public class Calculator {
    int speed = 100;
    String name = "Hillel";

    public static void main(String[] args) {
        System.out.println("Введите число?");

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Введите второе число?");
        double b = scanner.nextDouble();
        System.out.println("Напишите(выберете) действие: + - / *");
        String c = scanner.next();
        System.out.println("Результаты вычесления:");
        switch (c) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
                break;



        }
        scanner.close();

    }
}
