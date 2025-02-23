import java.util.Scanner;

public class Main {
    public static void printCalculator() {
        System.out.println("\n*********************************");
        System.out.println("|  7  |  8  |  9  |  ÷  |");
        System.out.println("|-----------------------|");
        System.out.println("|  4  |  5  |  6  |  ×  |");
        System.out.println("|-----------------------|");
        System.out.println("|  1  |  2  |  3  |  -  |");
        System.out.println("|-----------------------|");
        System.out.println("|  =  |  0  |  .  |  +  |");
        System.out.println("*********************************\n");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---- Calculator ----");
        printCalculator();
        System.out.println("Enter numbers and choose operations (+, -, *, /). OR Enter -1 to stop.");
        double result = 0;
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        while (num != -1) {
            System.out.print("Enter operation (+, -, *, /): ");
            char operation = input.next().charAt(0);
            System.out.print("Enter a number: ");
            num = input.nextDouble();

        }
    }
}