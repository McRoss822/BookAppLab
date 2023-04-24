
package ua.lviv.iot.algo.part1.lab1.modules;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

public abstract class Book {


    public abstract int getLength();

    protected String title;
    protected String author;
    protected String publisher;
    protected String genre;
    protected int year;
    public final int bytesPerPageCount = 16;

    public String getHeaders() {
        return "title, " + "author,"
                + " " + "publisher, " + "genre, " + "year";
    }

    public int getPublishingYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String toCSV() {
        return this.title + "," + this.author + ","
                + this.publisher + "," + this.genre + "," + this.year;
    }

    @Override
    public String toString() {
        return title;
    }
}
