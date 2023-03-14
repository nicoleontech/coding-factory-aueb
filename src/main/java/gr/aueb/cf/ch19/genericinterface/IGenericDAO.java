package gr.aueb.cf.ch19.genericinterface;

import java.util.List;

public interface IGenericDAO<T> {

    boolean save(T t);
    T update(T oldT, T newT);
    T delete(T t);
    T get(Object id);
    List<T> getAll();

}
