package part2.exercise13;
import java.util.Scanner;


public class Counting {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        int num=Integer.valueOf(Sc.nextLine());
        int i=num;
        while(i<100){
            System.out.println(i);
            i++;
        }
    }
}
