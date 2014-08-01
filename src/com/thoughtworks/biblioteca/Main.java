package com.thoughtworks.biblioteca;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream printStream = System.out;
        Console console = new Console(bufferedReader, printStream);

        new Application(library(), printStream, console).start();
    }

    private static Library library() {
        List<Book> listOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Book 1", "Author 1", "2001");
        Book book2 = new Book("Book 2", "Author 2", "2002");
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        return new Library(listOfBooks, System.out);
    }
}
