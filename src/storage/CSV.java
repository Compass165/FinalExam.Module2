package storage;

import model.Product;

import java.io.*;
import java.util.List;

public class CSV implements IOUploadFile{

    private static CSV instance = null;

    private CSV(){
    }

    public static CSV getInstance() {
        if (instance == null) {
            return instance = new CSV();
        } else return instance;
    }


    @Override
    public void writeData(List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream("E:\\IntelliJ\\FinalExam.Module2\\data\\product.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public List<Product> readData() {
        try {
            FileInputStream fis = new FileInputStream("E:\\IntelliJ\\FinalExam.Module2\\data\\product.csv");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Product> list = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
            return list;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } return null;
    }
}
