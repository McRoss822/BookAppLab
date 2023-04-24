package ua.lviv.iot.algo.part1.lab1.manager;

import java.util.ArrayList;
import java.util.List;

import lombok.ToString;
import ua.lviv.iot.algo.part1.lab1.modules.Book;

import java.util.stream.Collectors;

@ToString
public class BookManager {

    private List<Book> listOfBooks = new ArrayList<>();

    public List<Book> getListOfBooks() {
        return this.listOfBooks;
    }

    public void addBooks(Book book) {
        this.listOfBooks.add(book);
    }

    public List<Book> findByYear(int year) {
        List<Book> newList = new ArrayList<>();
        newList = (ArrayList<Book>) listOfBooks.stream()
                                                .filter(book -> book.getPublishingYear() == year)
                                                .collect(Collectors.toList());
        if (newList.isEmpty()) {
            throw new IllegalArgumentException("Now matches were found");
        } else {
            return newList;
        }
    }

    public List<Book> findByAuthor(String author) {
        List<Book> newList = new ArrayList<>();
        newList = (ArrayList<Book>) listOfBooks.stream()
                                                .filter(book -> book.getAuthor() == author)
                                                .collect(Collectors.toList());
        if (newList.isEmpty()) {
            throw new IllegalArgumentException("Now matches were found");
        } else {
            return newList;
        }
    }
}
