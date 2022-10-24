package Tema13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        readFileBuffered();

    }

    private static void readFileBuffered() throws IOException {
        System.out.println("Buffered read:");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(("Fisiere/quotes.txt")));
        int id = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            id++;
            System.out.println(id + " " + line);

            String[] tokens = line.split(Pattern.quote("~"));
            //System.out.println(id + " " + tokens[0]);
            //System.out.println(id + " " + tokens[1]);
        }
    }

}