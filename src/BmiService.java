public class BmiService {
    public int calculate(int weightKg, double heightM) {
        int result = (int) (weightKg / (heightM * heightM));
        return result;
    }
}
