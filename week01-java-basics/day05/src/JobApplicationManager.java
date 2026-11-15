import jobapplication.exception.ApplicationNotFoundException;
import jobapplication.model.JapaneseJobApplication;
import jobapplication.model.JobApplication;
import jobapplication.model.KoreanJobApplication;

import java.time.LocalDate;
import java.util.*;
import java.util.Set;

public class JobApplicationManager {
    public static void main(String[] args) {
        List<JobApplication> applications = new ArrayList<>();

        applications.add(
                new JapaneseJobApplication(
                        "Tokyo Tech",
                        "Backend Developer",
                        "Applied",
                        LocalDate.of(2026, 11, 13),
                        "N2")
        );

        applications.add(
                new KoreanJobApplication(
                        "Seoul Tech",
                        "Java Developer",
                        "Interview",
                        LocalDate.of(2026, 11, 13),
                        "TOPIK 5"
                )
        );

        applications.add(
                new JapaneseJobApplication(
                        "Rakuten",
                        "Back Developer",
                        "Applied",
                        LocalDate.of(2026, 11, 14),
                        "N1"
                )
        );

        try {
            deleteApplication(applications, 99);
        } catch (ApplicationNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteApplication(
            List<JobApplication> applications,
            int applicationNumber
    ) {
        if(applicationNumber < 1 || applicationNumber > applications.size()) {
            throw new ApplicationNotFoundException("Application not found: " + applicationNumber);
        }

        applications.remove(applicationNumber - 1);
    }
}

