package com.company;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mmachica on 2/2/16.
 */
public class PrinterTest {

    Printer printer = new Printer();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        printer.printWelcome();
        assertThat("Welcome!\n" , is(outContent.toString()));
    }

    @Test
    public void shouldPrintMenuOptions() throws Exception {
        printer.printMenu();
        assertThat(outContent.toString(), is("Menu Options:\n1) - List Books:\n"));
    }

    @Test
    public void shouldPrintBookList() throws Exception {
        printer.printBookList();
        assertThat("\nBook list:\nTest-Driven Development\n", is(outContent.toString()));
    }
}