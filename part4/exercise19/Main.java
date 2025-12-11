package part4.exercise19;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        while(true){
            System.out.println("Name");
            String name = sc.nextLine();
            if(name ==""){
                break;
            }
            System.out.println("Duration");
            int Duration = Integer.valueOf(sc.nextLine());
            programs.add(new TelevisionProgram(name, Duration));

        }
        System.out.println("Program's maximum duration?");
        int t = Integer.valueOf(sc.nextLine());

        for (TelevisionProgram p : programs){
            if (p.getDuration() <= t){
                System.out.println(p);
            }
        }
        
    }
    
}
