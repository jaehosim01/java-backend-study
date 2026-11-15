import java.time.LocalDate;

public class ApplicationTest {
    public static void main(String[] args) {
        Printable jpPrintable = new JapaneseJobApplication(
            "Tokyo Tech",
            "Backend Developer",
            "Applied",
            LocalDate.of(2026, 11, 13),
            "N2");

        Printable krPrintable = new KoreanJobApplication(
            "Seoul Tech",
            "Java Developer",
            "Interview",
            LocalDate.of(2026, 11, 13),
            "TOPIK 5");

        System.out.println(jpPrintable.printInformation());
        System.out.println(krPrintable.printInformation());
    }
}
