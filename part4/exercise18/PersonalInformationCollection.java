package part4.exercise18;
import java.util.Scanner;
import java.util.ArrayList;

public class PersonalInformationCollection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<PersonalInformation> list = new ArrayList<>();
    
        while(true){
            System.out.println("First name: ");
            String First= sc.nextLine();
            if (First ==""){
                break;

            }
            System.out.println("Second name");
            String Second = sc.nextLine();
            System.out.println("Identification number");
            String Id = sc.nextLine();

            list.add(new PersonalInformation(First,Second,Id));

        

        }
        System.out.println();
        for (PersonalInformation info :list){
            System.out.println(info.getFirstName() +" "+ info.getSecondName());
        }
    }
    
}
