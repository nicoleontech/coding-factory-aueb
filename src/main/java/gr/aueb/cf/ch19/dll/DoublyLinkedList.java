package gr.aueb.cf.ch19.dll;

/**
 * Doubly linked list is a dynamic list implementation.
 * The time complexity is 0(1).
 *
 * @param <T> the generic type
 */

public class DoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    public void insertFront(T t) {
        Node<T> newNode = new Node<>();
        newNode.setValue(t);
        newNode.setPrevious(null);
        newNode.setNext(head);
        head = newNode;
        if (newNode.getNext() == null) {
            tail = newNode;
        } else {
            newNode.getNext().setPrevious(newNode);
        }
    }

    public void insertEnd(T t) {
        Node<T> newNode = new Node<>();
        newNode.setValue(t);
        newNode.setPrevious(tail);
        newNode.setNext(null);
        tail = newNode;
        if (newNode.getPrevious() == null) {
            head = newNode;
        } else {
            newNode.getPrevious().setNext(newNode);
        }
    }

    public void deleteFront() {
        //if list contains zero nodes
        if (isEmpty()) return;

        //if list contains one node
        if (head.getNext() == null) {
            head = tail = null;
        } else {
            head = head.getNext();
            head.setPrevious(null);
        }
    }


    public void deleteEnd() {
        //if list contains zero nodes
        if (isEmpty()) return;

        //if list contains one node
        if (head.getNext() == null) {
            head = tail = null;
        } else {
            tail = tail.getPrevious();
            tail.setNext(null);
        }
    }


    public boolean isEmpty() {
        return head == null && tail == null;
    }

    //While traversing and performing a lookup, at worst case the time complexity is 0(n) -->linear.
    public Node<T> get(T t) {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getValue().equals(t)) {
                return n;
            }
        }
        return null;
    }

    //While traversing time complexity is 0(n) -->linear.
    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n);
        }
    }
}
