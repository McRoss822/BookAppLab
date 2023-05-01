package ua.lviv.iot.algo.part1.lab1.modules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.modules.ElectronicBook;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    ElectronicBook book;
    @BeforeEach
    void initialization(){
       book= new ElectronicBook("fff","aaa",
                "ffff]","wqqwqqw",2344,12333);
    }

    @Test
    void ShoudReturnFields() {
        assertEquals("title, author, publisher," +
                " genre, year, fileSizeInBytes", book.getHeaders());
    }
}