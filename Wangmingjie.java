import java.util.Scanner;

public class Wangmingjie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        float[] num = new float[5 * T];
        int i = 0;
        for (; i < 5 * T; i++) {
            num[i] = input.nextFloat();
        }
        float a, b, c;
        for (int j = 0; j < i; j += 5) {
            a = (num[j + 3] - num[j + 1]) / (num[j + 2] - num[j]);
            b = num[j + 1] - a * num[j];
            c = a * num[j + 4] + b;
            System.out.printf("%.1f\n", c);
        }
        input.close();
    }
}