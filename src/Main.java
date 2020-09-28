public class Main {
    public static void main(String[] args) {
BmiService service = new BmiService();
int weightkg = 55;
int heightcm = 164;
double bmi = service.calculate(weightkg, heightcm);
System.out.println (bmi);

    }

}
