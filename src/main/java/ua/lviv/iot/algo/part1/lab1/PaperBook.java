package ua.lviv.iot.algo.part1.BookApp;
import  lombok.*;

public class PaperBook extends Book {
    public PaperBook(String title, String author,String publisher,String genre, int year,
                     double width, double length, int pagesCount){
        super(title,author,publisher,genre,year);
        this.width=width;
        this.length=length;
        this.pagesCount=pagesCount;
    }
    @Override
    public int getLength(){
        return this.pagesCount;
    }

    private double width;
    private double length;
    private int pagesCount;
}
