package controller;

import java.util.List;

public interface ICRUD <E>{

    void add(List<E> arr, E element);
    void edit(int index, List<E> arr, E element);
    void remove(int index, List <E> arr);

}
