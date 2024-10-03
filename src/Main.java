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

