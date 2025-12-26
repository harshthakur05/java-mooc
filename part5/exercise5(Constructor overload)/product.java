package part5.exercise5(Constructor overload);

public class product {
    private String name;
    private int weight;
    private String location;

    public product(String name){
        this.name  = name;
        this.weight = 1;
        this.location = "shelf";

    }

    public product(String name,int weight){
        this.name = name;
        this.weight = weight;
        this.location = "shelf";

    }
    public product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }
    @Override
    public String toString(){
       return this.name +"(" +this.weight +" kg)"+"can be found from the "+ this.location;
    }
    
    
}
