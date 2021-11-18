package dataStructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
import java.util.Collections;
public class AddOrRemove {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();


        names.add("segun");
        names.add("tola");
        names.add("dupe");
        System.out.println(names.size());
        System.out.println(names);


        names.remove("tola");
        System.out.println(names);


        Collection<String> arrays = new ArrayList<>();
        arrays.add("london");
        arrays.add("dubai");
        arrays.add("cairo");

        System.out.println("name of cities");
        System.out.println(arrays);

        ArrayList<String> c1 = (ArrayList<String>) (arrays.clone());
        c1.addAll(arrays);

        System.out.println(c1);
    }

}
