public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weightInKg = 70;
        float heightInSm = 180;
        float bmi = service.calculate(weightInKg, heightInSm);
        System.out.println(bmi);
    }
}
