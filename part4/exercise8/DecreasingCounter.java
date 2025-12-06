    

   


package part4.exercise8;

public class DecreasingCounter {
    private int value;  
    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value >0){//part2
            this.value = this.value-1;
        }
    }

    public void reset() {//part3
        this.value = 0;
    }
}
