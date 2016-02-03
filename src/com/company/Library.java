package com.company;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mmachica on 2/3/16.
 */
public class Library {


    private List<Book> bookList = Arrays.asList(
            new Book("Test-Driven Development")
    );

    public List<Book> getBookList() {
        return bookList;
    }
}
