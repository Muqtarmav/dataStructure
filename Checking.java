package dataStructure;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Checking {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("dallas");
        cities.add("monaco");
        cities.add("kentucky");
        cities.add("offa");
        cities.remove("kentucky");
        System.out.println(cities.size());
        System.out.println(cities);
    }

//    Collection<String> collection2 = new Collection<String>();
//
//    collection2.add()
  //  Collection<String> collection2 = new Collection<String>();
}

        class djfdj{
            public static void main(String[] args) {
                ArrayList<String> collections = new ArrayList<String>();
                collections.add("new york");
                collections.add("atlanta");
                collections.add("dallas");
                collections.add("nmadison");

                Iterator<String> iterator = collections.iterator();

//                Iterator<String> iterator = collections.iterator();
//
//        while(iterator.hasNext()){
//        System.out.println(iterator.next().toUpperCase() + "");


                while (iterator.hasNext()) {
                    System.out.println(iterator.next().toUpperCase() + "");
                }
                System.out.println();
            }
            }


            class kjdlk{
                public static void main(String[] args) {
                    List<Integer> arraylist = new ArrayList<>();
                    arraylist.add(1);
                    arraylist.add(2);
                    arraylist.add(3);
                    arraylist.add(4);
                    arraylist.add(0, 10);
                    arraylist.add(3,30);

                    System.out.println(arraylist);

                    LinkedList<Object> linkedList = new LinkedList<>(arraylist);
                    linkedList.add(1, "red");
                    linkedList.removeLast();
                    linkedList.addFirst("green");

                    System.out.println("display linked list forward :");
                    ListIterator<Object> listIterator = linkedList.listIterator();
                    while(listIterator.hasNext()){
                        System.out.println(listIterator.next() + "");
                    }
                    System.out.println();
                }
            }
