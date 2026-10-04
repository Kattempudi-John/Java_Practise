package Phase1.Projects;

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        System.out.println("=== Calculator Application ===");
        startCalculator();
    }

    public static int readInt(Scanner input){
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        return number;
    }
    public static double readDouble(Scanner input){
        double number = input.nextDouble();
        return number;
    }

    public static void startCalculator() {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        while (running) {
            showMenu();
            System.out.println("Please select an option from menu");

            int choice = input.nextInt();
            switch (choice) {
                case 1: {

                    int firstNumber = readInt(input);
                    int secondNumber = readInt(input);

                    int result = calculateAddition(firstNumber, secondNumber);
                    System.out.println("Addition Result: " + result);
                    break;
                }

                case 2: {

                    int firstNumber = readInt(input);
                    int secondNumber = readInt(input);

                    int result = calculateSubtraction(firstNumber, secondNumber);
                    System.out.println("Subtraction Result: " + result);
                    break;
                }
                case 3: {
                    int firstNumber = readInt(input);
                    int secondNumber = readInt(input);

                    int result = calculateMultiplication(firstNumber, secondNumber);
                    System.out.println("Multiplication Result: " + result);
                    break;
                }
                case 4: {

                    int firstNumber = readInt(input);
                    int secondNumber = readInt(input);

                    int result = calculateDivision(firstNumber, secondNumber);
                    System.out.println("Division Result: " + result);
                    break;
                }
                case 5: {

                    int firstNumber = readInt(input);
                    int secondNumber = readInt(input);

                    int result = calculateModulus(firstNumber, secondNumber);
                    System.out.println("Modulus Result: " + result);
                    break;
                }
                case 6: {
                    int firstNumber = readInt(input);
                    int secondNumber = readInt(input);
                    int result = calculatePower(firstNumber, secondNumber);
                    System.out.println("Power Result: " + result);
                    break;
                }
                case 7: {

                    System.out.println("Please enter principle amount");
                    double principal = readDouble(input);

                    System.out.println("Please enter rate of interest");
                    double interest = readDouble(input);

                    System.out.println("Please enter time");
                    double time = readDouble(input);

                    double amount = calculateSimpleInterest(principal, interest, time);
                    System.out.println("Interest Result: " + amount);

                    double totalAmount = amount + principal;
                    System.out.println("Total Amount with interest: " + totalAmount);
                    break;
                }
                case 8:{

                    System.out.println("Please enter your marks");
                    double obtainedMarks  = readDouble(input);

                    System.out.println("Please enter total marks");
                    double totalMarks = readDouble(input);

                    double result = calculatePercentage(obtainedMarks, totalMarks);
                    System.out.println("Percentage of marks " + result + "%");
                    break;
                }
                case 9: {
                    running = false;
                    System.out.println("Exit");
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                    break;
                }

            }
        }
    }

    public static void showMenu(){
        System.out.println("===CALCULATOR MENU===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        System.out.println("7. Simple Interest");
        System.out.println("8. Percentage");
        System.out.println("9. Exit");
    }

    public static int calculateAddition(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    public static int calculateSubtraction(int  number1, int number2) {
        int  result = number1 - number2;
        return result;
    }

    public static int calculateMultiplication(int number1, int number2) {
        int  result = number1 * number2;
        return result;
    }

    public static int calculateDivision(int number1, int number2) {
        if(number2 == 0){
            System.out.println("Division by zero");
            return 0;
        }
        int result = number1 / number2;
        return result;

    }

    public static int calculateModulus(int number1, int number2) {
        if(number2 == 0){
            System.out.println("Cannot calculate modulus by zero");
            return 0;
        }
        int result = number1 % number2;
        return result;
    }

    public static int calculatePower(int  number1, int number2) {
        int  result = 1;

        for(int i = 1; i <= number2; i++){
            result = result * number1;
        }
        return result;

    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        return interest;
    }

    public static double calculatePercentage(double obtainedMarks, double totalMarks) {
        double percentage = (obtainedMarks / totalMarks) * 100;
        return percentage;
    }


}
