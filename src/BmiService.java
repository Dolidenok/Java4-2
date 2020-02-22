public class BmiService {
    public float calculate(float weight, float height) {
        float bmi = weight / height / height * 100 * 100;
        return bmi;
    }
}
