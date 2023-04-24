
package ua.lviv.iot.algo.part1.BookApp;
import lombok.*;
@AllArgsConstructor

public abstract class Book {


    public abstract int getLength();
    protected String title;
    protected String author;
    protected String publisher;
    protected String genre;
    protected int year;
    public final int BYTES_PER_PAGE_COUNT=16;

    public int getPublishingYear(){return year;};
    public String getAuthor(){return author;};

}



