package Tema13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        readFileBuffered();
//
    }
//Quote a1=new Q();
//    id = Autor:: urmatorul_id ++;
//
//        for (Author author : autors) {
//            System.out.println("Animal: " + animal.getName() + " merge cu " + animal.getWalk() + ", face " + animal.getTalk() + " si mananca " + animal.getEat());
//        }

    private static void readFileBuffered() throws IOException {
        System.out.println("Buffered read:");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(("Fisiere/quotes.txt")));
        int id;
        String line;
        while ((line = bufferedReader.readLine()) != null) {

            Author author=new Author();
            //Author.urmatorul_id_autor();
            //int urmatorul_id_autor=author.urmatorul_id;
            //System.out.println(line+author.urmatorul_id);
            //System.out.println(author.urmatorul_id+line);
            //int urmatorul_id = 0;
            //author.getUrmatorul_id();

            System.out.println(author.getUrmatorul_id()+" "+line);
            //System.out.println();

            }
        }

}
