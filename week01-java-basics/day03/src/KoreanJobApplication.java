import java.time.LocalDate;

public class KoreanJobApplication extends JobApplication {
    private String koreanLevel;

    public KoreanJobApplication(String companyName, String position, String status, LocalDate applicationDate, String koreanLevel) {
        super(companyName, position, status, applicationDate);
        this.koreanLevel = koreanLevel;
    }

    @Override
    public String printInformation() {
        return super.printInformation() + "\nKorean Level: " + koreanLevel;
    }
}
