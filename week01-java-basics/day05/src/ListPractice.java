import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();

        companies.add("OpenAI");
        companies.add("Naver");
        companies.add("OpenAI");

        System.out.println(companies.size());
        System.out.println(companies.get(1));

        for(String company: companies) {
            System.out.println(company);
        }
    }
}
