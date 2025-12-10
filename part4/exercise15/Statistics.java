package part4.exercise15;

//answer of all part are included in this as the final part will work for all of them anyways
 
public class Statistics {
    private int count;
    private int sum;


    public Statistics(){
        this.count =0;
        this.sum =0;
    }
    public void addNumber(int number){
        this.count ++;
        this.sum= this.sum +count;

    } 
    public int getcount(){
        return this.count;
    }
    public int sum(){
        return this.sum;  

    } 
    public double average(){
        if(this.sum==0){
            return 0;
        }
        return this.sum/this.count;
    } 
    
    public static void main(String[] args) {
        
    }
}
