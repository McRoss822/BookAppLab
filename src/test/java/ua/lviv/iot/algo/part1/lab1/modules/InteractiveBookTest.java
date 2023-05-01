package ua.lviv.iot.algo.part1.lab1.modules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.modules.InteractiveBook;

import static org.junit.jupiter.api.Assertions.*;

class InteractiveBookTest {

    InteractiveBook adventuresOfIndianaJhones;
    @BeforeEach
    void initialization(){
        adventuresOfIndianaJhones =  new
                InteractiveBook("The Last Adventure of Indiana Jhones",
                "Pavlo ", "Ababagalamaga", "Fiction",
                2023, 3098);
    }
    @Test
    void getLengthShouldReturn193() {
        assertEquals(193,
                adventuresOfIndianaJhones.getLength());
    }
    @Test
    void shouldReturnFields() {
        assertEquals("title, author, publisher," +
                        " genre, year, fileSizeInBytes",
                adventuresOfIndianaJhones.getHeaders());
    }
}
