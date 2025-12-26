package part5.exercise2;

public class Book {

    private String author;
    private String name;
    private int pages;


    public Book(int pages, String name, String author){
        this.pages = pages;
        this.name = name;
    
        this.author = author;

    }
    public String getAuthor(){
        return this.author;

    }
    public String getName(){
        return this.name;
    }
    public int getPages(){
        return this.pages;
    }
    public String toString(){
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}
