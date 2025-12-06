package part4.exercise8;

public class MainProgram1 {
    public static void main(String[] args) {//part1
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }      
}
