import java.util.Random;
import static java.lang.Math.round;

public class Les3p1 {
    public static void main(String[] args) {
        int n = 100;
        int zeros = 0;
        double sum = 0;
        double s = 0;
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextDouble() * 200 - 100;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
            if (arr[i] < 0 && round(arr[i]) % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println("Количество нулей: " + zeros);
        System.out.println("Сумма отрицательных нечетных: " + sum);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
