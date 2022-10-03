import java.util.Scanner;
import java.util.Random;


public class Hello {
    public static void main(String[] args) {
        Random random = new Random();
        int magicNum = random.nextInt(10);
        int inputNum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input an Integer in {0,1,2,...,9}:");
        inputNum = sc.nextInt();

        while (inputNum != magicNum) { // to be filled in
            if (inputNum >= magicNum) {// to be filled in
                System.out.println("Too big!Please try again:");
            } else System.out.println("Too small!Please try again:");
            System.out.println("Please input an Integer in {0,1,2,...,9}:");
            inputNum = sc.nextInt();// to be filled in
        }

        System.out.println("Congratulations!");
        sc.close();
    }
}