package Lab_report1;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        int color1 = r.nextInt(4) + 1;
        int color2 = r.nextInt(4) + 1;
        int num1 = r.nextInt(10) + 2;
        int num2 = r.nextInt(10) + 2;


        System.out.printf("Card 1: %s %d\n", ColorGenerator(color1), ProcessNum(num1));
        System.out.printf("Card 2: %s %d\n", ColorGenerator(color2), ProcessNum(num2));

        if (num1 > num2){
            System.out.println("Card 1 is bigger");
        } else if(num1 < num2){
            System.out.println("Card 2 is bigger");
        } else if(color1 < color2){
            System.out.println("Card 1 is bigger");
        } else if(color1 > color2){
            System.out.println("Card 2 is bigger");
        } else{
            System.out.println("Both cards are tied");
        }

    }

    public static String ColorGenerator(int color){
        switch (color){
            case 1:
                return "Red";
            case 2:
                return "Blue";
            case 3:
                return "Green";
            case 4:
                return "Yellow";
            default:
                return null;
        }
    }

    public static int ProcessNum(int num){
        if(num % 11 == 0){
            return 1;
        }
        return num;
    }
}
