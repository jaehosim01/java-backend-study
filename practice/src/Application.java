import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConditionPractice score = new ConditionPractice();

        System.out.print("중간고사 점수: ");
        int midterm = scanner.nextInt();
        score.setMidterm(midterm);

        System.out.print("기말고사 점수: ");
        int finalexam = scanner.nextInt();
        score.setFinalexam(finalexam);

        System.out.print("과제 점수: ");
        int assignment = scanner.nextInt();
        score.setAssignment(assignment);

        System.out.print("출석 횟수: ");
        int attend = scanner.nextInt();
        score.setAttend(attend);

        score.practice9();
    }
}
