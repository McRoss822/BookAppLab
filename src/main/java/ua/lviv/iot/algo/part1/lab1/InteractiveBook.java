package ua.lviv.iot.algo.part1.BookApp;

public class InteractiveBook extends Book{
    public InteractiveBook(String title, String author,String publisher,String genre, int year, long fileSizeInBytes ){
      super(title,author,publisher,genre,year);
      this.fileSizeInBytes=fileSizeInBytes;
    }
    private long fileSizeInBytes;
    public int getLength() {

        return (int) (fileSizeInBytes/BYTES_PER_PAGE_COUNT);
    }
}
