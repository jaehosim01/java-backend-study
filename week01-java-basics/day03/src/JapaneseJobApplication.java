import java.time.LocalDate;

public class JapaneseJobApplication extends JobApplication {
    private String japaneseLevel;

    public JapaneseJobApplication(String companyName, String position, String status, LocalDate applicationDate, String japaneseLevel) {
        super(companyName, position, status, applicationDate);
        this.japaneseLevel = japaneseLevel;
    }

    @Override
    public String printInformation() {
        return super.printInformation() + "\nJapanese Level: " + japaneseLevel;
    }
}
