package Tema13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Author {
    String author;
    String allQuotes;
    String favourite;
    String QuotesForAuthor;


    public String getAuthor() {
        return author;
    }

    public String getAllQuotes() {
        return allQuotes;
    }

    public void setFavourite() {
        this.favourite = favourite;
    }

    public String getFavourite() {
        return favourite;
    }


    public String getQuotesForAuthor(String cautAuthor) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(("Fisiere/quotes.txt")));
        int id = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            id++;
            String[] tokens = line.split(Pattern.quote("~"));
            if (cautAuthor.equals(tokens[0])) {

                System.out.println(tokens[0] + " " + tokens[1]);
            }
        }
        return QuotesForAuthor;
    }

    public static void readFisier() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(("Fisiere/quotes.txt")));
        int id = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            id++;
            System.out.println(id + " " + line);
        }
    }

    public static void readAuthor() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(("Fisiere/quotes.txt")));
        int id = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            id++;
            String[] tokens = line.split(Pattern.quote("~"));
            System.out.println(tokens[0]);
        }
    }

    public static void readAllQuotes() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(("Fisiere/quotes.txt")));
        int id = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            id++;
            String[] tokens = line.split(Pattern.quote("~"));
            System.out.println(tokens[1]);
        }
    }
}