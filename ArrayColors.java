package dataStructure;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class ArrayColors {

   // private static Object Collection;

    public static void main(String[] args) {

        String [] colors = {"Red", "Green", "Yellow", "Purple", "Blue", };
        List <String> list = new ArrayList<String>();

        for (String color : colors){
            list.add(color);
        }

        String [] removeColors = {"Red", "White", "Blue"};
        List <String> removeList = new ArrayList<String>();
        for ( String color : removeColors)
            removeList.add(color);

        for (int count = 0; count < list.size(); count++) {
            System.out.println(list.get(count));
        }



       // removeColors(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColors:%n");

        for(String color : list){
            System.out.printf("%s ", color);
        }

//
//        private static void removeColors(Collection<String>collection1, Collection<String> collection2)
//        {
//            Iterator<String> iterator = collection1.iterator();
//
//            while (iterator.hasNext()) {
//                if (collection2.contains(iterator.next()))
//                    iterator.remove();
//                ;
//            }
//        }
    }
}
