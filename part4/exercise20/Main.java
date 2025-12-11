package part4.exercise20;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Book> book = new ArrayList<>();
        
        while(true) {
            System.out.println("Title:");
            String Title = sc.nextLine();
            if(Title.equals("")){
                break;
            }
            System.out.println("Pages:");
            int Pages = Integer.valueOf(sc.nextLine());

            System.out.println("Publication year:");
            int Pyear = Integer.valueOf(sc.nextLine());

            book.add(new Book(Title, Pages,Pyear));
        }
    }

    
    
}
