import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        double[] scores = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++)
        {
            System.out.println("请输入第" + (i + 1) + "个元素的值");
            scores[i] = sc.nextDouble();
        }
        }
    }
