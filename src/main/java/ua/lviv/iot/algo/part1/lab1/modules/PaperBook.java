package ua.lviv.iot.algo.part1.lab1.modules;

import ua.lviv.iot.algo.part1.lab1.modules.Book;

public class PaperBook extends Book {
    public PaperBook(final String title, final String author,
                     final String publisher, final String genre,
                     final int year, final int pagesCount) {
        super(title, author, publisher, genre, year);
        this.pagesCount = pagesCount;
    }

    @Override
    public int getLength() {
        return this.pagesCount;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + " pagesCount";
    }

    public String toCSV() {
        return super.toCSV() + "," + this.pagesCount;
    }

    private int pagesCount;
}
