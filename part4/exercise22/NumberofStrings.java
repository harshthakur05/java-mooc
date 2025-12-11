package part4.exercise22;
import java.util.Scanner;


public class NumberofStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count =0;
        while (true) { 
            String s = sc.nextLine();
            if(s=="end"){
                break;
            }
            count++;
            
        }
        System.out.println(count);
    }
    
}
