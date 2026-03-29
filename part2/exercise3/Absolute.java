package part2.exercise3;
import java.util.Scanner;


public class Absolute {
    Scanner Sc = new Scanner(System.in);
    int num = Integer.valueOf(Sc.nextLine());
    if (num>=0){
        System.out.println(num);

    }
    else {
        System.out.println(-1*num);

    }
}
