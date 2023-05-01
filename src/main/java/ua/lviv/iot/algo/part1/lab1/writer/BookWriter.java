package ua.lviv.iot.algo.part1.lab1.writer;

import ua.lviv.iot.algo.part1.lab1.modules.Book;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.*;


public class BookWriter {

    FileWriter file;

    public String writeToFile(List<Book> listOfBooks, String path) {
        if (listOfBooks == null || listOfBooks.isEmpty()) {
            return null;
        }
        try {
            file = new FileWriter(path);
            for (Book book : listOfBooks) {
                file.write(book.getHeaders() + "\n");
                file.write(book.toCSV() + "\n");
            }
            file.close();
            return path;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String sortList(List<Book> listOfBooks, String path) {
        if (listOfBooks == null || listOfBooks.isEmpty()) {
            return null;
        }
        try(FileWriter writer=new FileWriter(path)) {
            List<Book> sortedList= Collection.sort(listOfBooks, Comparator.comparing(book->book.getClass().getName()))
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }
}

