public class MenuChoice {
    public static void main(String[] args) {
        int menu = 3;

        switch (menu) {
            case 1 -> System.out.println("Add");
            case 2 -> System.out.println("Subtract");
            case 3 -> System.out.println("Exit");
            default -> System.out.println("Invalid option");
        }
    }
}
