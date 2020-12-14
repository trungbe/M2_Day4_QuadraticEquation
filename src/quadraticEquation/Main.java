package quadraticEquation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a:");
        double a = scanner.nextDouble();
        System.out.print("Enter the b:");
        double b = scanner.nextDouble();
        System.out.print("Enter the c:");
        double c = scanner.nextDouble();

        QuadraticEquation qua1 = new QuadraticEquation(a, b, c);
        double delta = qua1.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm " + qua1.getRoot1() + " và " + qua1.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm " + qua1.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
