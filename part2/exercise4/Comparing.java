package part2.exercise4;
import java.util.Scanner;

public class Comparing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b + ".");
        } else if (a < b) {
            System.out.println(a + " is smaller than " + b + ".");
        } else {
            System.out.println(a + " is equal to " + b + ".");
        }
    }
}