package dataStructure;

public interface    List {
    boolean isEmpty();

    void  add (int element);

    void remove (int element);

    int size();

    void add (int element, int position);

    int getIndexOf(int element);


    void insert(int i, int i1);

    int get(int i);

    int getCapacity();
}
