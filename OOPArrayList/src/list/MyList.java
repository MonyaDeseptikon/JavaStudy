package list;

public interface MyList<T extends Comparable> extends Iterable<T>{
    default void add(T element){}
    default   void delete(int index){}
    default   void delete(T element){}
    public  abstract  T get(int index);
    public  abstract  int size();
    default void addFirst(T element){    }
    default void addLast(T element){    }
}
