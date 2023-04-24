package ua.lviv.iot.algo.part1.lab1.writer;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.algo.part1.lab1.modules.AudioBook;
import ua.lviv.iot.algo.part1.lab1.modules.Book;
import ua.lviv.iot.algo.part1.lab1.modules.ElectronicBook;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BookWriterTest {
    Path expectedFile;
    Path resultFile;
    private final String EXPECTED_PATH = "C:\\Users\\Lenovo\\IdeaProjects\\BookAppLab\\TestFile.csv";
    private final String RESULT_PATH = "C:\\Users\\Lenovo\\IdeaProjects\\BookAppLab\\MyFile.csv";
    BookWriter writer = new BookWriter();
    List<Book> listOfBooks;
    ElectronicBook englishDictionary;
    AudioBook worldWideHistory;

    @BeforeEach
    public void initialization() {
        listOfBooks = new ArrayList<>();
        worldWideHistory = new AudioBook(
                "History of the world", "Baranovska",
                "LPNU", "Educational", 2010);
        englishDictionary = new ElectronicBook("English Dictionary for youngsters",
                "Hehelen",
                "LNU", "Educational", 2023, 2048);
        listOfBooks.add(englishDictionary);
        listOfBooks.add(worldWideHistory);
    }

    @Test
    public void fileShouldExist() {
        resultFile = new File(RESULT_PATH).toPath();
        assertNotNull(resultFile);
    }

    @Test
    public void shouldReturnNull() throws IOException {
        expectedFile = new File(EXPECTED_PATH).toPath();
        resultFile = new File(RESULT_PATH).toPath();
        listOfBooks = null;
        assertNull(writer.writeToFile(listOfBooks, RESULT_PATH));
    }

    @Test
    public void shouldReturnFileWithListOfObjects() throws IOException {
        expectedFile = new File(EXPECTED_PATH).toPath();
        resultFile = new File(RESULT_PATH).toPath();
        writer.writeToFile(listOfBooks, RESULT_PATH);
        assertEquals(-1L, Files.mismatch(resultFile, expectedFile));
    }
}