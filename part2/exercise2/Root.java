package part2.exercise2;
import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int b = Integer.valueOf(Sc.nextLine());
        int a = Integer.valueOf(Sc.nextLine());

    
        System.out.println(Math.sqrt(a+b));
        Sc.close();
    }
    
}
