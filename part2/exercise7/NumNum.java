package part2.exercise7;
import java.util.Scanner;


public class NumNum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int s=0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.parseInt(Sc.nextLine());
            
            s =s+1;
            if (num==0){
                break;

            }
            
        }
        System.out.println("Number of numbers:" +s);

    }
    
}
