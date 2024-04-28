/*Смог сделать только когда узнал, что ext - это указатель*/
package list;

import java.util.Iterator;

public class MyLinkedList<E extends Comparable> implements MyList<E> {
    static class Node<E> {
        E value;
        Node<E> next;

        Node(E value) {
            this.value = value;
        }

    }

    Node<E> head;
    int size;


    @Override
    public E get(int index) {
        Node<E> node = head;
        while (index > 0) {
            node = node.next;
            index--;
        }
        return node.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(E element) {
        if (head == null) {
            this.head = new Node<E>(element);
        } else {
            Node<E> current = new Node<E>(element);
            current.next = head;
            head = current;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        if (head == null) {
            this.head = new Node<E>(element);
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<E>(element);
        }
        size++;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public String toString() {
        Node<E> currNode = head;
        StringBuilder linListPrint = new StringBuilder();
        while (currNode != null) {
            linListPrint.append(currNode.value + "\n");
            currNode = currNode.next;
        }
        return linListPrint.toString();
    }


}
