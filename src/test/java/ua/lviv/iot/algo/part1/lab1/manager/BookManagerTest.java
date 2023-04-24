package ua.lviv.iot.algo.part1.lab1.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.manager.BookManager;
import ua.lviv.iot.algo.part1.lab1.modules.*;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTest {
    BookManager books;
    List<Book> listOfBooks;

    @BeforeEach
    void initialization() {
        books = new BookManager();
        listOfBooks = new ArrayList<>();
    }

    @Test
    void shouldContainListOfAddedBooks() {

        PaperBook mathBook = new PaperBook(
                "Math 6th grade", "Merzlyak",
                "Ukrainian government",
                "Educational", 2016, 20);
        AudioBook HistoryOfUkraine = new AudioBook(
                "History of Ukraine", "Baranovska " ,
                "LPNU", "Educational", 2010);
        books.addBooks(HistoryOfUkraine);
        books.addBooks(mathBook);
        assertEquals(2, books.getListOfBooks().size());
    }

    @Test
    public void findByYearShouldReturnTwoEqualLists() {

        ElectronicBook englishDictionary = new ElectronicBook("Englis Dictionary for youngsters", "Hehelen",
                "LNU", "Educational", 2023, 2048);
        PaperBook calculusBook = new PaperBook("Calculus part1", "Rudavskiy",
                "LPNU", "Educational", 2023, 20);
        listOfBooks.add(englishDictionary);
        listOfBooks.add(calculusBook);
        books.addBooks(englishDictionary);
        books.addBooks(calculusBook);
        assertEquals(listOfBooks, books.findByYear(2023));
    }

    @Test
    public void findByAuthorShouldReturnTwoEqualLists() {

        InteractiveBook storyTellers = new InteractiveBook("Storytellers", "Pavlo ", "LPNU",
                "Fiction", 2024, 2004);
        InteractiveBook adventuresOfIndianaJohnes = new InteractiveBook("The Last Adventure of Indiana Jones",
                "Pavlo ", "Ababagalamaga", "Fiction", 2023, 3098);
        listOfBooks.add(storyTellers);
        listOfBooks.add(adventuresOfIndianaJohnes);
        books.addBooks(storyTellers);
        books.addBooks(adventuresOfIndianaJohnes);
        assertEquals(listOfBooks, books.findByAuthor("Pavlo "));
    }

    @Test
    public void findByAuthorShouldReturnOnlyInteractiveBooks() {

        InteractiveBook storyTellers = new InteractiveBook(
                "Storytellers", "Pavlo ", "LPNU",
                "Fiction", 2024, 2004);
        InteractiveBook adventuresOfIndianaJhones = new InteractiveBook(
                "The Last Adventure of Indiana Jhones",
                "Pavlo ", "Ababagalamaga", "Fiction", 2023, 3098);
        AudioBook worldWideHistory = new AudioBook(
                "History of the world", "Baranovska",
                "LPNU", "Educational", 2010);
        listOfBooks.add(storyTellers);
        listOfBooks.add(adventuresOfIndianaJhones);
        books.addBooks(storyTellers);
        books.addBooks(adventuresOfIndianaJhones);
        books.addBooks(worldWideHistory);
        assertEquals(listOfBooks, books.findByAuthor("Pavlo "));
    }

    @Test
    public void findByYearShouldReturnException() {
        BookManager books = new BookManager();
        List<Book> listOfBooks = new LinkedList<>();
        ElectronicBook englishDictionary = new ElectronicBook(
                "English Dictionary for youngsters", "Hehelen",
                "LNU", "Educational", 2017, 2048);
        books.addBooks(englishDictionary);
        assertThrows(IllegalArgumentException.class, () -> {
            books.findByYear(2000);
        });
    }

    @Test
    public void findByAuthorsShouldReturnException() {
        BookManager books = new BookManager();
        List<Book> listOfBooks = new LinkedList<>();
        ElectronicBook englishDictionary = new ElectronicBook(
                "English Dictionary for youngsters", "Hehelen",
                "LNU", "Educational", 2017, 2048);
        books.addBooks(englishDictionary);
        assertThrows(IllegalArgumentException.class, () -> {
            books.findByAuthor("Willem Dafoe");
        });
    }
}
