package gr.aueb.cf.ch19.generics;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    private T item;
    private List<? extends T> items = new ArrayList<>();

    public List<? extends T> getItems() {
        return items;
    }

    public void setItems(List<? extends T> items) {
        this.items = items;
    }

    public int getCount(List<? extends T> list) {
        return list.size();
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
