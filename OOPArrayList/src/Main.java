import list.MyLinkedList;
import list.MyArrayList;
import list.MyList;

public class Main {
    public static void main(String[] args) {

//        MyList<Double> list = new MyArrayList<>();
//        list.add(12d);
//        list.add(132d);
//        list.add(121d);
//       // list.delete(1);
//        list.delete(12d);
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.size());
MyList <Double> linList =new MyLinkedList<>();
linList.addLast(11d);
        linList.addLast(1121d);
        linList.addLast(151d);
        linList.addLast(15d);
        linList.addLast(1d);
       System.out.println(linList);
        System.out.println(linList.size());
        System.out.println(linList.get(1)+"\n");
        linList.addFirst(111121d);
        linList.addFirst(0d);
        System.out.println(linList);
        System.out.println(linList.size());
        System.out.println(linList.get(1));
    }
}