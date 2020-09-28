public class BmiService {
    public double calculate(int weightkg, int heightcm) {

        double bmi = (double) weightkg /  ((heightcm * heightcm) / 100);

        {
            return bmi;
        }
    }
}