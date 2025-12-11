package part4.exercise17;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        
        while(true){
            System.out.println("Name");
            String name = sc.nextLine();
            if (name.equals("")){
                break;
            }
            items.add(name);

        }
    }

    
}
