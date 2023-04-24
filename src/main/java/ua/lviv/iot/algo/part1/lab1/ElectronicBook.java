package ua.lviv.iot.algo.part1.BookApp;
import lombok.*;

public class ElectronicBook extends Book{
    public ElectronicBook(String title, String author,String publisher,String genre, int year,String format ){
        super(title, author, publisher, genre,year );
        this.format=format;


    }
    @Override
    public int getLength() {
        return (int) (fileSizeInBytes/BYTES_PER_PAGE_COUNT);
    }

    private String format;
    private long fileSizeInBytes;


}
