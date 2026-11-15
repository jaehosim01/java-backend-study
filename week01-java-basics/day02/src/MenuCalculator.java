import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            // print menu
            System.out.println("""
                    1. Add
                    2. Subtract
                    3. Multiply
                    4. Divide
                    5. Exit
                    """);
            int menu = sc.nextInt();

            // input numbers
            System.out.print("firstNumber: ");
            double firstNumber = sc.nextDouble();
            System.out.print("secondNumber: ");
            double secondNumber = sc.nextDouble();

            // menu
            switch (menu) {
                case 1:
                    double added = Add(firstNumber, secondNumber);
                    System.out.println(added);
                    break;
                case 2:
                    double subtracted = Subtract(firstNumber, secondNumber);
                    System.out.println(subtracted);
                    break;
                case 3:
                    double multiplied = Multiply(firstNumber, secondNumber);
                    System.out.println(multiplied);
                    break;
                case 4:
                    if(secondNumber == 0) {
                        System.out.println("Cannot divide by zero");
                        break;
                    }
                    double divided = Divide(firstNumber, secondNumber);
                    System.out.println(divided);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            if(menu == 5) break;
        }

        sc.close();
    }

    static double Add(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber);
    }

    static double Subtract(double firstNumber, double secondNumber) {
        return (firstNumber - secondNumber);
    }

    static double Multiply(double firstNumber, double secondNumber) {
        return (firstNumber * secondNumber);
    }

    static double Divide(double firstNumber, double secondNumber) {
        return (firstNumber / secondNumber);
    }
}
