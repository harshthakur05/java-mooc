package part2.exercise19;
import java.util.Scanner;


public class Repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int num = Integer.parseInt(sc.nextLine());

            if (num == -1) {
                break;
            }

            sum += num;
            count++;

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Average: " + avg);
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        sc.close();
    }
}

