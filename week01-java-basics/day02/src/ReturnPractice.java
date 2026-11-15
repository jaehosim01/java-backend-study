public class ReturnPractice {
    public static void main(String[] args) {
        int largeNumber = findLarger(3, 5);
        System.out.println(largeNumber);
    }

    static int findLarger(int a, int b) {
        if (a >= b) {
            return a;
        } else  {
            return b;
        }
    }
}
