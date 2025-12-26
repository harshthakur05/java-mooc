package part5.exercise1;

public class Timer {
    private ClockHand hundredth;
    private ClockHand seconds;

    public Timer(){
        this.hundredth = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    public void advance(){
        this.hundredth.advance();

        if (this.hundredth.value() ==0){
            
                this.seconds.advance();
            
        }
    }
    public String toString(){
        return hundredth + ":" + seconds;
    }

    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
