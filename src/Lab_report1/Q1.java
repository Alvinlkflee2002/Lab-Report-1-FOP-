package Lab_report1;
import java.util.Scanner;
//Write a program to check whether a triangle is valid or invalid. If the triangle is valid,
//check whether a triangle is Equilateral, Isosceles or Scalene.
public  class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter length of each side of triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a + b > c && a + c > b && b + c > a && (a == b || b == c || c == a)) {
            System.out.println("Isosceles Triangle");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Scalene Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
