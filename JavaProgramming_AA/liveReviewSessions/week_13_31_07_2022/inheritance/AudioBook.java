package week_13_31_07_2022.inheritance;

public class AudioBook extends Book{
    int lengthOfRecording;
    String narrator;

    public AudioBook(String title, String type, String author, double price, int lengthOfRecording, String narrator) {
        super(title, type, author, price);
        this.lengthOfRecording = lengthOfRecording;
        this.narrator = narrator;
    }
    public void listen(){

    }
}
