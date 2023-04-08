package ua.lviv.iot.algo.part1.BookApp;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTest {

@Test
    void shouldContainListOfAddedBooks() {
        BookManager books = new BookManager();
        List<Book> listOfBooks = new LinkedList<>();
        PaperBook mathBook = new PaperBook("Math 6th grade", "Merzlyak", "Ukrainian government", "Educational", 2016, 20, 40, 305);
        AudioBook HistoryOfUkraine = new AudioBook("History of Ukraine", "Baranovska ", "LPNU", "Educational", 2010);
        books.addBooks(HistoryOfUkraine);
        books.addBooks(mathBook);
        assertNotNull(books);
    }
    @Test
    public void findByYearshouldReturnTwoEqualLists(){
            BookManager books=new BookManager();
            List<Book> listOfBooks=new ArrayList<>();
            ElectronicBook englishDictionary = new ElectronicBook("Englis Dictionary for youngsters", "Hehelen", "LNU", "Educational",2023,"PDF");
            ElectronicBook turkishDictionary = new ElectronicBook("Turksih Dictionary for noble ladies", "Ruslana", "KNU","Fiction", 2023,"PDF");
            listOfBooks.add(englishDictionary);
            listOfBooks.add(turkishDictionary);
            books.addBooks(englishDictionary);
            books.addBooks(turkishDictionary);
            assertEquals(listOfBooks,books.findByYear(2023));
        }
    @Test
    public void findByAuthorShouldReturnTwoEqualLists(){
        BookManager books=new BookManager();
        List<Book> listOfBooks=new ArrayList<>();
        InteractiveBook storyTellers = new InteractiveBook("Storytellers", "Pavlo ", "LPNU", "Fiction", 2024, 2004);
        InteractiveBook adventuresOfIndianaJohnes = new InteractiveBook("The Last Adventure of Indiana Jones", "Pavlo ","Ababagalamaga","Fiction",2023,3098);
        listOfBooks.add(storyTellers);
        listOfBooks.add(adventuresOfIndianaJohnes);
        books.addBooks(storyTellers);
        books.addBooks(adventuresOfIndianaJohnes);
        assertEquals(listOfBooks,books.findByAuthor("Pavlo "));
    }

    @Test
    public void findByAuthorShouldReturnOnlyInteractiveBooks(){
        BookManager books=new BookManager();
        List<Book> listOfBooks=new ArrayList<>();
        InteractiveBook storyTellers = new InteractiveBook("Storytellers", "Pavlo ", "LPNU", "Fiction", 2024, 2004);
        InteractiveBook adventuresOfIndianaJohnes = new InteractiveBook("The Last Adventure of Indiana Jones", "Pavlo ","Ababagalamaga","Fiction",2023,3098);
        AudioBook worldWideHistory= new AudioBook( "History of the world", "Baranovska", "LPNU", "Educational", 2010);
        listOfBooks.add(storyTellers);
        listOfBooks.add(adventuresOfIndianaJohnes);
        books.addBooks(storyTellers);
        books.addBooks(adventuresOfIndianaJohnes);
        books.addBooks(worldWideHistory);
        assertEquals(listOfBooks,books.findByAuthor("Pavlo "));
    }

    @Test
    public void findByYearShouldReturnNull(){
        BookManager books=new BookManager();
        List<Book> listOfBooks=new ArrayList<>();
        assertNull(books.findByYear(2000));
    }
    @Test
    public void findByAuthorsShouldReturnNull(){
        BookManager books=new BookManager();
        List<Book> listOfBooks=new ArrayList<>();
        assertNull(books.findByAuthor("Willem Dafoe"));
    }


}