public class ConditionPractice {
    int midterm;
    int finalexam;
    int assignment;
    double attend;

    ConditionPractice() {
    }

    public void setMidterm(int midterm) {
        this.midterm = midterm;
    }

    public int getMidterm() {
        return midterm;
    }

    public void setFinalexam(int finalexam) {
        this.finalexam = finalexam;
    }

    public int getFinalexam() {
        return finalexam;
    }

    public void setAssignment(int assignment) {
        this.assignment = assignment;
    }

    public int getAssignment() {
        return assignment;
    }

    public void setAttend(int attend) {
        this.attend = attend;
    }

    public double getAttend(){
        return attend;
    }

    public void practice9() {
        double score =  (midterm * 0.2) + (finalexam * 0.3) + (assignment * 0.3) + attend;
        System.out.println("===========결과==========");
        System.out.println("중간 고사 점수(20):" + (midterm * 0.2));
        System.out.println("기말 고사 점수(30):" + (finalexam * 0.3));
        System.out.println("과제 점수(20):" + (assignment * 0.3));
        System.out.println("출석 점수(20):" + attend);
        System.out.println("총점:" + score);
        System.out.println((attend / 20));

        if(score >= 70 && (attend / 20) >= 0.7) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
