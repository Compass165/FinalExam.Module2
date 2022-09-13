package controller;


import model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    public List<Product> productList = new ArrayList<>();



    public int search(String id) {
        int check = -1;
        for (int i = 0; i < productList.size(); i++) {
            if (id.equals(productList.get(i).getId())){
                check = i;
            }
        }
        return check;
    }

    public void display() {
        for (Product x : productList) {
            System.out.println(x.toString());
        }
    }

    public void sortByPriceLowToHigh() {
        productList.sort(Comparator.comparingDouble(Product::getAmount));
    }
}
