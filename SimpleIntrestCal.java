import java.util.Scanner;

public class SimpleIntrestCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount ");
        int p=sc.nextInt();
        System.out.println("Enter Rate Amount ");
        int r = sc.nextInt();
        System.out.println("Enter Time in Year ");
        int t = sc.nextInt();

        int SI=(p*r*t)/100;

        System.out.println("Simple Intrest is = "+ SI);
    }
}