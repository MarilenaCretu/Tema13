package Tema13;

public class Autor {
         int id;
         int urmatorul_id;
         String autor;
    String quote;

        public int urmatorul_id_autor() {
            urmatorul_id ++;
            return urmatorul_id;
        }
//        class Autor() {
//            id = Autor:: urmatorul_id ++; //or, id = urmatorul_id_utilizator();
//        }
    //}
    //int Autor :: urmatorul_id = 0;
}