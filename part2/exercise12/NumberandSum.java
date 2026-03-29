package part2.exercise12;
import java.util.Scanner;

public class NumberandSum {
    public static void main(String[] args) {
        int dum=0;
        int rum=0;
        Scanner Sc = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int num= Integer.valueOf(Sc.nextLine());
            rum= rum+1;
            if(num==0){

                break;
            }
           
            
            if(num>0){
                dum=dum+num;}

        }
        System.out.println("Average of the numbers:"+(dum/(rum-1)));

    

    
    }
    

    

    
    
}
