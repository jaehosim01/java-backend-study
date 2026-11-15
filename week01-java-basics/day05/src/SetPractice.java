import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> companies = new HashSet<>();

        companies.add("OpenAI");
        companies.add("Naver");
        companies.add("OpenAI");

        System.out.println(companies.size());

        for(String company: companies) {
            System.out.println(company);
        }
    }
}
