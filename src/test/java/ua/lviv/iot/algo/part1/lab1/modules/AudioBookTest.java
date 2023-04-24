package ua.lviv.iot.algo.part1.lab1.modules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.modules.AudioBook;

import static org.junit.jupiter.api.Assertions.*;

class AudioBookTest {

    AudioBook worldWideHistory;
    @BeforeEach
    void initialization(){
        worldWideHistory =  new AudioBook("History of the world",
                  "Baranovska",
                "LPNU", "Educational", 2010);
    }
    @Test
    void ShouldReturnFields() {
        assertEquals("title, author, publisher," +
                        " genre, year, lengthInMinutes",
                        worldWideHistory.getHeaders());
    }
}