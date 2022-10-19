import java.util.Scanner;

public class Problem 3，Leap Years {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[] years = new int[T];
        int i = 0;
        int a;
        int b;
        int c;
        int d;
        int e;
        for (; i < T; i++) {
            years[i] = input.nextInt();
        }
        for (int j = 0; j < i; j++) {
            if (years[j] % 400 == 0 || (years[j] % 4 == 0 && years[j] % 100 != 0)) {
                System.out.println("Yes");
                a = (2000 - years[j]) / 4;
                b = 2000-years[j]-a;
                d = (2000-years[j]) / 100 - 1;
                e = (2000-years[j])/400;
                c = 307+366*(a-1)+365*b-(d-e)-1;
                System.out.printf("%d\n",c);
                }
            else {
                System.out.println("No");
            }
        }
    }
}
