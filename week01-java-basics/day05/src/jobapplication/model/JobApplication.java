package jobapplication.model;

import jobapplication.exception.InvalidStatusException;

import java.time.LocalDate;
import java.util.Set;

public class JobApplication implements Printable {
    private String companyName;
    private String position;
    private String status;
    private LocalDate applicationDate;

    private static final Set<String> VALID_STATUSES =
            Set.of("Applied", "Interview", "Rejected");

    public JobApplication(String companyName, String position, String status, LocalDate applicationDate) {
        validateNotBlank(companyName, "Company Name");

        validateNotBlank(position, "Position");

        validateStatus(status);

        this.companyName = companyName;
        this.position = position;
        this.status = status;
        this.applicationDate = applicationDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        validateNotBlank(companyName, "Company Name");
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
        validateStatus(newStatus);
        this.status = newStatus;
    }

    @Override
    public String printInformation() {
        return "Company: " + companyName + "\nPosition: " + position + "\nStatus: " + status + "\nApplication Date: " + applicationDate;
    }

    private static void validateStatus(String status) {
        if (status == null || !VALID_STATUSES.contains(status)) {
            throw new InvalidStatusException("Invalid status: " + status);
        }
    }

    private static void validateNotBlank(String value, String fieldName) {
        if(value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + " cannot be empty");
        }
    }
}
