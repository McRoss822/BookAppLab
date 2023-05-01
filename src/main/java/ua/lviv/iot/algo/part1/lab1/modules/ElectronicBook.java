package ua.lviv.iot.algo.part1.lab1.modules;

import ua.lviv.iot.algo.part1.lab1.modules.Book;

public class ElectronicBook extends Book {
    public ElectronicBook(final String title, final String author,
                          final String publisher,
                          final String genre, final int year,
                          final long fileSizeInBytes) {
        super(title, author, publisher, genre, year);
        this.fileSizeInBytes = fileSizeInBytes;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + " fileSizeInBytes";
    }

    @Override
    public int getLength() {
        return (int) (fileSizeInBytes / bytesPerPageCount);
    }

    public String toCSV() {
        return super.toCSV() + "," + this.fileSizeInBytes;
    }

    private long fileSizeInBytes;
}
