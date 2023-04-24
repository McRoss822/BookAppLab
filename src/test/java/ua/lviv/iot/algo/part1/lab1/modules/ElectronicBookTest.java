package ua.lviv.iot.algo.part1.lab1.modules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.modules.ElectronicBook;

import static org.junit.jupiter.api.Assertions.*;

class ElectronicBookTest {
    ElectronicBook adventuresOfIndianaJhones;
    @BeforeEach
    void initialization(){
        adventuresOfIndianaJhones= new ElectronicBook(
                "The Last Adventure of Indiana Jhones",
                "Pavlo ", "Ababagalamaga",
                "Fiction", 2023, 2048);
    }
    @Test
    void getLengthShouldReturn128() {
        assertEquals(128,
                adventuresOfIndianaJhones.getLength());
    }
@Test
    void ShoudReturnFields() {
        assertEquals("title, author, publisher," +
                    " genre, year, fileSizeInBytes",
            adventuresOfIndianaJhones.getHeaders());
    }
}
