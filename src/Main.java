import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Which exercise do you want to see, 1-23, :");
            try {
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        exercise1();
                        break;
                    case 2:
                        exercise2();
                        break;
                    case 3:
                        exercise3();
                        break;
                    default:
                        System.out.println("There is no such exercise");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Closing program");
                System.exit(0);
            }
        }
    }
    public static void exercise3(){
        var scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userString = scan.nextLine();
        char middle;
        char middleIfEven;
        int firstCharIndex;
        int secondCharIndex;
        if (userString.length() % 2 == 0){
            firstCharIndex = (userString.length() - 1) / 2;
            secondCharIndex = firstCharIndex + 1;
            middle = userString.charAt(firstCharIndex);
            middleIfEven = userString.charAt(secondCharIndex);
            System.out.println("The first middle character is: " + middle + ", second: " + middleIfEven);
        }
        else{
            firstCharIndex = userString.length() / 2;
            middle = userString.charAt(firstCharIndex);
            System.out.println("The middle character in the string: " + middle);
        }

    }

    public static void exercise2(){
        var scan = new Scanner(System.in);
        ArrayList<Double> nums = new ArrayList<Double>();
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter a number: ");
                nums.add(scan.nextDouble());
            }
            double average = nums.stream().mapToDouble(val -> val).average().orElse(0);
            System.out.println("The average value is " + average);
        } catch (Exception e) {
            System.out.println("Not a valid number, program closing");
            System.exit(0);
        }
    }

    public static void exercise1() {
        var scan = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double temp;
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter a number: ");
                temp = scan.nextDouble();
                if (temp < min) {
                    min = temp;
                }
            }
        } catch (Exception e) {
            System.out.println("Not a valid number, program closing");
            System.exit(0);
        }
        System.out.println("The smallest number is " + min);
    }
}

