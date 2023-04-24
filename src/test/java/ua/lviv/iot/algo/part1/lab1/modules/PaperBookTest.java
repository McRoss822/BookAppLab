package ua.lviv.iot.algo.part1.lab1.modules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.modules.PaperBook;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaperBookTest {
    PaperBook mathBook;
    @BeforeEach
    void initialization(){
        mathBook =new PaperBook("Math 6th grade", "Merzlyak",
                "Ukrainian government", "Educational",
                2016, 20);
    }
    @Test
    void shouldReturnFields() {
        assertEquals("title, author, publisher," +
                        " genre, year, pagesCount",
                mathBook.getHeaders());
    }
}
