package part4.exercise23;
import java.util.Scanner;

public class Cubes {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count =0;
        while (true) { 
            String s = sc.nextLine();
            if(s=="end"){
                break;
            }
            count++;
            int n = Integer.parseInt(s);
            System.out.println(n*n*n);

        }
     }     
        
}
