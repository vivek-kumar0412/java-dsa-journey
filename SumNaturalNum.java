import java.util.Scanner;

public class SumNaturalNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int a = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += i;
        }

        System.out.println("Sum of First " + a + " Natural Numbers = " + sum);
    }
}