package storage;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSV implements IOUploadFile{

    @Override
    public void writeFile(List list, String pathFile) {
        try {
            FileOutputStream fos = new FileOutputStream(pathFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List readFile(String pathFile) {
        try {
            FileInputStream fis= new FileInputStream(pathFile);
            ObjectInputStream ois= new ObjectInputStream(fis);
            Object ob= ois.readObject();
            List list= (List) ob;
            fis.close();
            ois.close();
            return list;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        CSV csv= new CSV();
        List<Product> productList= new ArrayList<>();
        productList.add(new Product("1","Gạo",8,9,"ngon"));
        productList.add(new Product("2","Mứt",8,9,"ngon"));
        productList.add(new Product("3","Bánh trung thu",9,9,"ngon"));
        productList.add(new Product("4","Kẹo",8,9,"ngon"));
        productList.add(new Product("5","Bành trưng",7,9,"ngon"));

        csv.writeFile(productList,"E:\\IntelliJ\\FinalExam.Module2\\data\\product.csv");
        List<Product> list=  csv.readFile("E:\\IntelliJ\\FinalExam.Module2\\data\\product.csv");
        System.out.println(list);
    }

}
