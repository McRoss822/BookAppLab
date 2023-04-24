package ua.lviv.iot.algo.part1.BookApp;

public class AudioBook extends Book {
    public AudioBook(String title, String author,String publisher,String genre, int year){
        super(title, author, publisher, genre,year );
    }
    private int lengthInMinutes;

    @Override
    public int getLength() {
        return this.lengthInMinutes;
    }
}