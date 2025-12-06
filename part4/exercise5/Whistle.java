package part4.exercise5;

public class Whistle {
    public String sound;

    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }

    public void sound(){
        System.out.println(this.sound);
    }
}
