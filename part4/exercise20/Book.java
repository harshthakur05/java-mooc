package part4.exercise20;




public class Book {
    private String Title;
    private int Pages;
    private int Pyear;


    public Book(String Title, int Pages,int Pyear){
        this.Title = Title;
        this.Pages = Pages;
        this.Pyear = Pyear;

    }
    public int getPages(){
        return this.Pages;

    }
    public int getPyear(){
        return this.Pyear;

     }
    public String getTitle(){
        return this.Title;

    }



    
}
