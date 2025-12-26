package part5.exercise3;

public class Cube {
    private int edgeLength;

    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }
    public int volume(){
        return edgeLength*edgeLength*edgeLength;
        
    
    }
    @Override
    public String toString(){
        System.out.println("The length of the edge is "  +edgelength() + "and the volume " + volume());
    }
}
