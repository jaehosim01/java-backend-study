import java.time.LocalDate;

public abstract class JobApplication implements Printable {
    private String companyName;
    private String position;
    private String status;
    private LocalDate applicationDate;

    public JobApplication(String companyName, String position, String status, LocalDate applicationDate) {
        this.companyName = companyName;
        this.position = position;
        this.status = status;
        this.applicationDate = applicationDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void changeStatus(String newStatus) {
        this.status = newStatus;
    }

    @Override
    public String printInformation() {
        return "Company: " + companyName + "\nPosition: " + position + "\nStatus: " + status + "\nApplication Date: " + applicationDate;
    }
}
