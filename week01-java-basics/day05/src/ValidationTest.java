import jobapplication.exception.InvalidStatusException;
import jobapplication.model.JapaneseJobApplication;

import java.time.LocalDate;

public class ValidationTest {
    public static void main(String[] args) {
        try {
            JapaneseJobApplication jpApplication = new JapaneseJobApplication(
                    "Tokyo Tech",
                    "Backend Developer",
                    "Unknown",
                    LocalDate.of(2026, 11, 24),
                    "N2"
            );
        } catch(InvalidStatusException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation finished");
        }

    }
}
