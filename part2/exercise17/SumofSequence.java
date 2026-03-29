package part2.exercise17;

import java.util.Scanner;


public class SumofSequence{
    public static void main(String[]args){
        Scanner Sc =new Scanner(System.in);
        System.out.println("Last number");
        int num = Integer.valueOf(Sc.nextLine());
        int i =0;
        int sum=0;
        while (i<= num){
            sum+= i;
            i++;
            
        }
        System.out.println("The sum is "+sum);

    
}
}