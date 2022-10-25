package Tema13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

import static Tema13.Author.*;

public class Main {
    public static void main(String[] args) throws IOException {

        readFisier();
        readAuthor();
        readAllQuotes();

        Author author=new Author();

        System.out.println(author.getQuotesForAuthor("Albert Einstein"));

    }

}