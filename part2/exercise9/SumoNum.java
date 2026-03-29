package part2.exercise9;
import java.util.Scanner;

public class SumoNum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int dum=0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(Sc.nextLine());
            if (num==0){
                break;
            }
            dum= dum+num;
        }
        System.out.println("Sum of the numbers:"+dum);
        
    }
    
}
