public class BmiService {
    public double calculate(int weightkg, float heightcm) {

        double bmi = (double) weightkg /  ((heightcm * heightcm) / 100);

        {
            return bmi;
        }
    }
}