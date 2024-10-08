import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Which exercise do you want to see, 1-18, :");
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
                    case 4:
                        exercise4();
                        break;
                    case 5:
                        exercise5();
                        break;
                    case 6:
                        exercise6();
                        break;
                    case 7:
                        exercise7();
                        break;
                    case 8:
                        exercise8();
                        break;
                    case 9:
                        exercise9();
                        break;
                    case 10:
                        exercise10();
                        break;
                    case 11:
                        exercise11();
                        break;
                    case 12:
                        exercise12();
                        break;
                    case 13:
                        exercise13();
                        break;
                    case 14:
                        exercise14();
                        break;
                    case 15:
                        exercise15();
                        break;
                    case 16:
                        exercise16();
                        break;
                    case 17:
                        exercise17();
                        break;
                    case 18:
                        exercise18();
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
    public static void exercise18(){
        var scan = new Scanner(System.in);
        boolean cons = false;
        System.out.println("Input the first number: ");
        try{
            int num1 = scan.nextInt();
            System.out.println("Second number: ");
            try{
                int num2 = scan.nextInt();
                System.out.println("Third number: ");
                try{
                    int num3 = scan.nextInt();
                    if(Math.abs(num1 - num2) == 1){
                        if(Math.abs(num2 - num3) == 1){
                            cons = true;
                        }
                    }
                    System.out.println("The numbers are consecutive: " + cons);
                }
                catch(Exception e){
                    System.out.println("Bad number");
                    System.exit(0);
                }
            }
            catch(Exception e){
                System.out.println("Bad number");
                System.exit(0);
            }
        }
        catch(Exception e){
            System.out.println("Bad number");
            System.exit(0);
        }
    }

    public static void exercise17(){
        var scan = new Scanner(System.in);
        System.out.println("Enter a number with several integers: ");
        try{
            int num = scan.nextInt();
            String numS = String.valueOf(num);
            int num2 = 0;
            for (int i = 0; i < numS.length(); i++){
                if (numS.charAt(i) == '2'){
                    num2++;
                }
            }
            System.out.println("Amount integer 2's found: " + num2);
        }
        catch (Exception e){
            System.out.println("Bad number");
            System.exit(0);
        }
    }

    public static void exercise16(){
        // Starting with finding all primitive numbers under 100
        var prims = new ArrayList<Integer>();
        for(int i = 2; i < 100; i++){
            boolean isPrimitive = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0) {
                    isPrimitive = false;
                }
            }
            if(isPrimitive){
                prims.add(i);
            }
        }
        for(int element : prims){
            System.out.println(element); // seems ok
        }
        for (int i = 0; i < prims.size(); i++){
            if (i < prims.size() - 1){
                if (prims.get(i + 1) - (prims.get(i)) == 2){
                    System.out.println("(" + prims.get(i) + ", " + prims.get(i + 1) + ")");
                }
            }
        }
    }

    public static void exercise15(){
        var weekD = LocalDate.now().getDayOfWeek();
        String weekDL = weekD.toString().toLowerCase();
        String weekFormatted = weekDL.substring(0,1).toUpperCase() + weekDL.substring(1);
        var month = LocalDate.now().getMonth();
        String monthL = month.toString().toLowerCase();
        String monthFormatted = monthL.substring(0,1).toUpperCase() + monthL.substring(1);
        var date = LocalDate.now().getDayOfMonth();
        var year = LocalDate.now().getYear();
        var timeNow = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        var formattedTime = timeNow.format(formatter);

        System.out.println(weekFormatted + " " + monthFormatted + " " + date + ", " + year + " " + formattedTime);
    }

    public static void exercise14(){
        var scan = new Scanner(System.in);
        System.out.println("Enter length for side of Penatagon: ");
        try{
            double side = scan.nextDouble();
            // Using formula from internet to calculate this
            double area = (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)) * Math.pow(side, 2));
            System.out.println("Area of Pentagon is: " + area);
        }
        catch (Exception e){
            System.out.println("Bad input");
        }
    }

    public static void exercise13(){
        var scan = new Scanner(System.in);
        System.out.println("Enter first side of triangle: ");
        try{
            double s1 = scan.nextDouble();
            System.out.println("Enter second side of triangle: ");
            try{
                double s2 = scan.nextDouble();
                System.out.println("Enter third side of triangle: ");
                try{
                    double s3 = scan.nextDouble();
                    // Herons formula
                    double s = (s1 + s2 + s3) / 2;
                    double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
                    System.out.println("Area of triange: " + area);
                }
                catch (Exception e){
                    System.out.println("Bad input");
                    System.exit(0);
                }
            }
            catch (Exception e){
                System.out.println("Bad input");
                System.exit(0);
            }
        }
        catch (Exception e){
            System.out.println("Bad input");
            System.exit(0);
        }
    }

    public static void exercise12(){
        var scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter n for a random nxn matrix: ");
        try{
            int num = scan.nextInt();
            for (int i = 0; i < num; i++){
                for (int j = 0; j < num; j++){
                    System.out.print(rand.nextInt(2) + " ");
                }
                System.out.println();
            }
        }
        catch (Exception e){
            System.out.println("Not a valid number.");
        }
    }

    public static void exercise11(){
        var scan = new Scanner(System.in);
        System.out.println("Rules for password:");
        System.out.println("Least 8 characters");
        System.out.println("Only letters and digits");
        System.out.println("At least two digits");
        System.out.println("Enter a password:");
        String pass = scan.nextLine().toLowerCase();
        if (pass.length() < 8){
            System.out.println("Too short.");
            System.exit(0);
        }
        char[] arr = new char[pass.length()];
        int nums = 0;
        for(int i = 0; i < pass.length(); i++){
            if (Character.isDigit(pass.charAt(i))){
                nums++;
            }
            if (!Character.isDigit(pass.charAt(i)) && !Character.isAlphabetic(pass.charAt(i))){
                System.out.println("Non aplhabetic and non numeral character found, exiting");
                System.exit(0);
            }
        }
        if (nums >= 2){
            System.out.println("Nice password");
        }
        else{
            System.out.println("Not enough numbers");
        }
    }

    public static void exercise10(){
        var scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        try{
            int year = scan.nextInt();
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("Year " + year + " is a century and a leap year.");
                }
                else{
                    System.out.println("Year " + year + " is a century and Not a leap year.");
                }
            }
            else{
                if (year % 4 == 0){
                    System.out.println("Year " + year + " is a leap year.");
                }
                else{
                    System.out.println("Year " + year + " is Not a leap year.");
                }
            }
        }
        catch (Exception e){
            System.out.println("Bad Input, closing");
            System.exit(0);
        }
    }

    public static void exercise9(){
        var scan = new Scanner(System.in);
        System.out.println("Enter first char: ");
        char firstChar = (scan.next()).toLowerCase().charAt(0);
        System.out.println("Enter second char: ");
        char secondChar = (scan.next()).toLowerCase().charAt(0);
        int char1Num = Character.getNumericValue(firstChar);
        int char2Num = Character.getNumericValue(secondChar);
        if (char2Num - char1Num <= 0){
            System.out.println("Bad input, closing");
            System.exit(0);
        }
        int charsInt = char2Num - char1Num - 1; // number of chars to be printed
        int[] arr = new int[charsInt];
        int counter = char1Num + 1;
        for (int i = 0; i < charsInt; i++){
            arr[i] = char1Num + 1 + i;//counter;
            //counter++;
        }
        for (int i = 0; i < arr.length; i++){
            //System.out.print((char)(arr[i] + '0') + " ");
            System.out.print(Character.forDigit(arr[i], 36) + " ");
            if (i % 20 == 0){
                System.out.println();
            }
        }
    }

    public static void exercise8(){
        var scan = new Scanner(System.in);
        double invested = 0;
        double rate = 0;
        double rateInc = 0;
        int years;
        double saved = 0;
        try{
            System.out.println("Investment amount:");
            invested = scan.nextDouble();
        }
        catch(Exception e){
            System.out.println("Bad number, closing");
            System.exit(0);
        }
        try{
            System.out.println("Interest:");
            rate = scan.nextDouble();
        }
        catch(Exception e){
            System.out.println("Bad number, closing");
            System.exit(0);
        }
        try{
            System.out.println("Number of years:");
            years = scan.nextInt();
            System.out.println(("Years     FutureValue"));
            for(int i = 1; i <= years; i++){
                for(int j = 0; j < 12; j++){
                    rateInc = (invested * rate / 100) / 12;
                    invested = invested + rateInc;
                }
                System.out.println(i + "         " + invested);
            }
        }
        catch(Exception e){
            System.out.println("Bad number, closing");
            System.exit(0);
        }
    }

    public static void exercise7(){
        //From wiki pentagonal number: m(3m -1)/2
        int numM = 1;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                int pent = numM * (3 * numM - 1) / 2;
                System.out.format("%8d", pent);
                numM++;
            }
            System.out.println();
        }
    }

    public static void exercise6(){
        var scan = new Scanner(System.in);
        System.out.println("Enter a integer:");
        try{
            int num = scan.nextInt();
            String numString = Integer.toString(num);
            int sum = 0;
            for(int i = 0; i < numString.length(); i++){
                sum = sum + Integer.parseInt(String.valueOf(numString.charAt(i)));
            }
            System.out.println("Sum is: " + sum);
        }
        catch(Exception e){
            System.out.println("Not valid integer, closing this");
            System.exit(0);
        }
    }

    public static void exercise5(){
        var scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userString = scan.nextLine();
        String textStripped = userString.strip(); //removing whitespace from eventual start and ending
        int spceCount = 0;
        for(int i = 0; i < textStripped.length(); i++){
            if(i > 0 && textStripped.charAt(i - 1) != ' '){
                if(textStripped.charAt(i) == ' '){
                    spceCount++;
                }
            }
        }
        spceCount++; //Assuming empty "" from user counts as 1 string, also needed for rest
        System.out.println("Number of words: " + spceCount);
    }

    public static void exercise4(){
        var scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userString = scan.nextLine();
        userString.toLowerCase();
        int vowelCount = 0;
        for(int i = 0; i < userString.length(); i++){
            if (userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i'  ||
            userString.charAt(i) == 'o' || userString.charAt(i) == 'u' || userString.charAt(i) == 'y'){
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the string: " + vowelCount);
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

