public class TryCatchPractice {
    public static void main(String[] args) {
        String input = "abc";
        try {
            Integer i = Integer.parseInt(input);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } finally {
            System.out.println("Finished");
        }
    }
}
