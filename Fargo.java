import java.util.Scanner;

public class Fargo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter expressions such as 2.0 + 2. Type -1 to quit.\n");
        double a = input.nextDouble();
        char b = input.next().charAt(0);
        double c = input.nextDouble();
        double d;
        while (a != -1) {
            switch (b) {
                case '+':
                    d = a + c;
                    System.out.printf("Result : %f", d);
                    a = input.nextDouble();
                    b = input.next().charAt(0);
                    c = input.nextDouble();
                    break;
                case '-':
                    d = a - c;
                    System.out.printf("Result : %f", d);
                    a = input.nextDouble();
                    b = input.next().charAt(0);
                    c = input.nextDouble();
                    break;
                case '*':
                    d = a * c;
                    System.out.printf("Result : %f", d);
                    a = input.nextDouble();
                    b = input.next().charAt(0);
                    c = input.nextDouble();
                    break;
                case '/':
                    d = a / c;
                    System.out.printf("Result : %f", d);
                    a = input.nextDouble();
                    b = input.next().charAt(0);
                    c = input.nextDouble();
                    break;
                default:
                    System.out.println("Unknown operator");


            }
        }
        if (a == -1) {
            System.out.println();
        }
    }

}
