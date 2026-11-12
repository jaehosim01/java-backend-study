public class TemperatureConverter {
    public static void main(String[] args) {
        double celsiusT = 9.8;
        double fahrenheitT = celsiusT * 9 / 5 + 32;
        int result = (int) fahrenheitT;

        System.out.println(fahrenheitT);
        System.out.println(result);
    }
}
