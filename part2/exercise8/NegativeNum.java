package part2.exercise8;
import java.util.Scanner;


public class NegativeNum {
    public static void main(String[] args) {
        int sum=0;
        Scanner Sc = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int num= Integer.valueOf(Sc.nextLine());
            if(num==0){
                break;
            }
            else if (num<0){
                sum= sum+1;
            }

        }
        System.out.println("Number of negative numbers:"+sum);

    }
    
}
