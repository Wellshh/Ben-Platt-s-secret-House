import java.util.Scanner;
public class Problem 1, Months with 31 days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        int T = input.nextInt();
        int[] months = new int[T];
        int i = 0;
        for (; i < months.length; i++) {
            months[i] = input.nextInt();
        }
        for (int j = 0; j <i; j++) {
            if(months[j]==1||months[j]==3||months[j]==5||months[j]==7||months[j]==8||months[j]==10||months[j]==12){
            System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}










