package part4.exercise15;
import java.util.Scanner;


public class Main {
    public static void Main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();
        System.out.println("Enter numbers:");
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            stats.addNumber(number);

        }
        System.out.println("Sum"+ stats.sum());

    }
}
