package br.com.lefranchi.cicd.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DataControllerTests {

    @Autowired
    DataController dataController;

    @Test
    void version() {
        assertEquals("The actual versiona is 1.0.0.0", dataController.version());
    }

    @Test
    void booksLength() {
        Integer booksLength = dataController.getRandomBooks().size();
        assertEquals(10, booksLength);
    }
    
}
