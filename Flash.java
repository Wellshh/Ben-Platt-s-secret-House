import java.util.Scanner;

public class Flash {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[] grade = new int[T];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < T; i++) {
            grade[i] = input.nextInt();
            if (grade[i] <= 100 && grade[i] >= 90) {
                a += 1;
            } else if (grade[i] < 90 && grade[i] >= 80) {
                b += 1;
            }
            else if (grade[i] < 80&& grade[i]>=70){
                c += 1;
            }
            else if (grade[i] < 70&& grade[i]>=60){
                d +=1;
            }
            }
        System.out.printf("A: %d\n",a);
        System.out.printf("B: %d\n",b);
        System.out.printf("C: %d\n",c);
        System.out.printf("D: %d\n",d);




    }
    }

