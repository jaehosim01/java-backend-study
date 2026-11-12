import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSubject = scanner.nextInt();
        int secondSubject = scanner.nextInt();
        int thirdSubject = scanner.nextInt();
        double average = (double) (firstSubject + secondSubject + thirdSubject) / 3;

        System.out.println(average);

        if (average >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}
