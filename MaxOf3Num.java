import java.util.Scanner;

public class MaxOf3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Max Number = " + a);
            } else {
                System.out.println("Max Number = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Max Number = " + b);
            } else {
                System.out.println("Max Number = " + c);
            }
        }
    }
}