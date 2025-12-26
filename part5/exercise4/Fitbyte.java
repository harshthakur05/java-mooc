package part5.exercise4;

public class Fitbyte {
    private int age;
    private int restingHeartRate;
    public Fitbyte(int age,int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    public int MHeartRate (int age){
        return (206 - (0.711*age));
    }

    public double targetHeartRate(double percentageOfmaximum){
        return (MHeartRate -restingHeartRate)*()

    }
}
//idk this one
