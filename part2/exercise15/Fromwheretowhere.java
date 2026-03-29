
import java.util.Scanner;

public class Fromwheretowhere {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Where to?");
        int num= Integer.valueOf(Sc.nextLine());
        int i =0;
        while(i<num){
            System.out.println(i);
            i++;

        }
        System.out.println("Where to?");
        int from = Integer.valueOf(Sc.nextLine());
        
        int j=from;
        while(j<num){
            System.out.println(j);
            j++;

        }
        
        
    }

        
    
}
