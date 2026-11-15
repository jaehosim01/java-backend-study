import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> jobApplied = new HashMap<>();

        jobApplied.put("Applied", 2);
        jobApplied.put("Interview", 1);
        jobApplied.put("Rejected", 1);

        System.out.println(jobApplied.get("Applied"));

        for(String key: jobApplied.keySet()) {
            Integer value = jobApplied.get(key);
            System.out.println(key + ", " + value);
        }
    }
}
