package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString= " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString + " = string and number = " + number);

        // user input start, scanner is the userinput doer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line enter key

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Please enter a valid number");
        }

        scanner.close();

    }
}
