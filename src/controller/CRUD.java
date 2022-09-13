package controller;

import java.util.List;

public class CRUD implements ICRUD{

    @Override
    public void add(List arr, Object element) {
        arr.add(element);
    }

    @Override
    public void edit(int index, List arr, Object element) {
        arr.set(index, element);
    }

    @Override
    public void remove(int index, List arr) {
        arr.remove(index);
    }

}
