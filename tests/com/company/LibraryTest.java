package com.company;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by mmachica on 2/3/16.
 */
public class LibraryTest {

    @Test
    public void libraryShouldNeverBeEmpty() {
        Library library = new Library();
        assertThat(library.getBookList().size(), is(1));
    }
}