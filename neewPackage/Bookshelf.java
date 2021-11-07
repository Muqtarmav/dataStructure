package neewPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bookshelf {

    private final List <String > books = new ArrayList<>();

    public List<String> books() {
        return books;
    }

    public void add(String bookToAdd) {
        books.add(bookToAdd);
    }

    public void remove(String bookToRemove){
        books.remove(bookToRemove);

    }
    
    public List<String> arrange(){
        return  null;
    }

    public void add(String the_phoenix, String wolf_of_wall_street, String billonnaire_mindset) {
    }
//    public void arrange(String bookToArrange) {
//        books.arrange(bookToArrange);
//    }
}