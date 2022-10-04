import java.util.Scanner;

public class App {
    static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt) {
        System.out.println(prompt);
        return inputScanner.next();
    }

    private static Double getDouble(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }

    public static void main(String[] args) {
        String input1 = "yes";
        while (input1 == "yes") {
            System.out.println(" ");
            String smallAsk = "What would you like to do?\n" + "  add\n" + "  subtract\n" + "  multiply\n"
                    + "  divide\n" + "  exit\n";
            String calculation = getString(smallAsk);

            Calculator calc = new Calculator();
            if (calculation.equals("add")) {
                System.out.println(" ");
                Double num1 = getDouble("Pick your 1st number");
                Double num2 = getDouble("Pick your 2nd number");
                System.out.println(" ");
                System.out.println("The numbers added together equal " + calc.add(num1, num2));
                inputScanner.nextLine();
            }
            if (calculation.equals("subtract")) {
                System.out.println(" ");
                Double num1 = getDouble("Pick your 1st number");
                Double num2 = getDouble("Pick your 2nd number");
                System.out.println(" ");
                System.out.println("The numbers subracted from each other equal " + calc.subtract(num1, num2));
                inputScanner.nextLine();
            }
            if (calculation.equals("multiply")) {
                System.out.println(" ");
                Double num1 = getDouble("Pick your 1st number");
                Double num2 = getDouble("Pick your 2nd number");
                System.out.println(" ");
                System.out.println("The numbers multiplied equal " + calc.multiply(num1, num2));
                inputScanner.nextLine();
            }
            if (calculation.equals("divide")) {
                System.out.println(" ");
                Double num1 = getDouble("Pick your 1st number");
                Double num2 = getDouble("Pick your 2nd number");
                if (num2 == 0) {
                    System.out.println("You can't divide a number by zero");
                } else {
                    System.out.println(" ");
                    System.out.println("The numbers divided equal " + calc.divide(num1, num2));
                    inputScanner.nextLine();
                }

            }
            if (calculation.equals("exit")) {
                input1 = "no";
                break;
            }

            //removed below as could not continue the loop if yes entered, but also removed per challenge two instructuins;


            // System.out.println(" ");
            //  input1 = getString("Do you want to continue yes/no?");

            // if (input1 == "yes") {
            //     input1 = "yes";
                
            // }
            // if (input1 == "no") {
            //     input1 = "no";
            //     break;
            // }

        }
        System.out.println("Goodbye!");
    }
}
