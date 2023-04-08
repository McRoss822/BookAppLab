package ua.lviv.iot.algo.part1.BookApp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lombok.*;

import java.sql.SQLOutput;
import java.util.stream.Collectors;

@ToString
public class BookManager {

    private List<Book> listOfBooks = new ArrayList<>();

    public void addBooks(Book book) {
        this.listOfBooks.add(book);
    }

    public List<Book> findByYear(int year) {
         if(listOfBooks.isEmpty()){
                 return null;
             }
         else return (ArrayList<Book>)listOfBooks.stream().filter(book -> book.getPublishingYear() == year).collect(Collectors.toList());
    }


    public List<Book> findByAuthor(String author) {
        if(listOfBooks.isEmpty()){
            return null;
        }
        else return (ArrayList<Book>)listOfBooks.stream().filter(book -> book.getAuthor() == author).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        BookManager books = new BookManager();
        List<Book> listOfBooks = new LinkedList<>();
        PaperBook mathBook = new PaperBook("Math 6th grade", "Merzlyak", "Ukrainian government","Educational", 2016, 20,40,305 );
        PaperBook calculusBook = new PaperBook("Calculus part1", "Rudavskiy", "LPNU", "Educational",2005, 20,30,2067);
        ElectronicBook englishDictionary = new ElectronicBook("Englis Dictionary for youngsters", "Hehelen", "LNU", "Educational",2023,"PDF");
        ElectronicBook turkishDictionary = new ElectronicBook("Turksih Dictionary for noble ladies", "Ruslana", "KNU","Fiction", 2023,"PDF");
        AudioBook HistoryOfUkraine = new AudioBook("History of Ukraine", "Baranovska ", "LPNU", "Educational", 2010);
        AudioBook WorldWideHistory= new AudioBook( "History of the world", "Baranovska", "LPNU", "Educational", 2010);
        InteractiveBook storyTellers = new InteractiveBook("Storytellers", "Pavlo Antoniuk", "LPNU", "Fiction", 2024, 2004);
        InteractiveBook adventuresOfIndianaJohnes = new InteractiveBook("The Last Adventure of Indiana Jones", "Pavlo Antoniuk","Ababagalamaga","Fiction",2023,3098);

    }
}
