package part4.exercise21;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> Item =new ArrayList<>();
        while(true){
            System.out.println("Name:");
            String name = sc.nextLine();
            if(name ==""){
                break;
            }
            Item.add(new Item(name));

        }
        for(Item item :Item){
            System.out.println(item);
        }
    }
}
