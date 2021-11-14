package Lab_report1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quadratic equation: ");
        String eq = sc.nextLine();
        int first_x = eq.indexOf("x");
        int second_x = eq.indexOf("x", first_x + 1);
        int a, b = 0, c = 0;
        String aString = eq.substring(0, first_x),
                bString = "",
                cString = "";

        //Check the validity of the quadratic equation
        while (!eq.startsWith("x2", first_x)) {
            System.out.println("Invalid quadratic equation");
            System.out.print("Enter quadratic equation: ");
            eq = sc.nextLine();
            first_x = eq.indexOf("x");
        }

        //Find the String for b and c parts of the quadratic equation
        if (second_x > 0) { // Only run when b exist
            bString = eq.substring(first_x + 2, second_x);
            cString = eq.substring(second_x + 1);
        } else { //run if b does not exist but c does
            cString = eq.substring(first_x + 2);
        }

        //Process a String
        if (first_x == 0) {
            a = 1;
        } else {
            if (aString.equals("-")) {
                a = -1;
            } else {
                a = Integer.parseInt(aString);
            }
        }
        //Process bString if b exist
        if (!bString.equals("")) {
            if (bString.length() == 1) {
                if (bString.charAt(0) == '+') {
                    b = 1;
                } else {
                    b = -1;
                }
            }
            else {
                b = Integer.parseInt(bString);
        }
            //Process cString if c exist
            if (!cString.equals("")) {
                c = Integer.parseInt(cString);
            }
            if (Math.pow(b, 2) - 4 * a * c < 0) {
                System.out.println("The quadratic equation has 0 roots");
                System.out.println("No solution");
            } else if (Math.pow(b, 2) - 4 * a * c > 0) {
                System.out.println("The quadratic equation has 2 roots");
                double root1 = (Math.sqrt(Math.pow(b, 2) - (4 * a * c)) - b) / (2 * a);
                double root2 = (-Math.sqrt(Math.pow(b, 2) - (4 * a * c)) - b) / (2 * a);
                System.out.println("x = " + root1);
                System.out.println("x = " + root2);
            } else {
                System.out.println("The quadratic equation has 1 root");
                double root = (Math.sqrt(Math.pow(b, 2) - 4 * a * c) - b) / (2 * a);
                System.out.println("x = " + root);
            }

        }
    }
}