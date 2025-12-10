package part4.exercise18;

public class PersonalInformation {
    private String Firstname;
    private String Secondname;
    private String Identification_number;

    public PersonalInformation(String Firstname,String Secondname,String Identification_number){
        this.Firstname = Firstname;
        this.Secondname = Secondname;
        this.Identification_number = Identification_number;

    }
    public String getIN(){
        return this.Identification_number;
    }
    public String getFirstName(){
        return this.Firstname;

    }
    public String getSecondName(){
        return this.Secondname;
    }
    
}
    


