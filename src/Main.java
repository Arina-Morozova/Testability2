public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 49;
        double heightM = 1.54;
        int bmi = service.calculate(weightKg, heightM);
        System.out.println(bmi);
    }
}
