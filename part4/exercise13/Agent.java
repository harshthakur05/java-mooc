package part4.exercise13;

public class Agent {
    private String firstname;
    private String lastname;

    public Agent(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public void print(){
        System.out.println("My name is "+ this.firstname+ ","+this.lastname);
    }
}
