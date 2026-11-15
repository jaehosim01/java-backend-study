import java.time.LocalDate;

public class JobApplicationTest {
    public static void main(String[] args) {
        JobApplication job = new JobApplication(
                "OpenAI",
                "Backend Developer",
                "Applied",
                LocalDate.of(2026, 11, 13)
        );

        System.out.println(job.printInformation());

        job.changeStatus("Ready to Interview");

        System.out.println(job.printInformation());

    }
}

