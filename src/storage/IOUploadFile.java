package storage;

import model.Product;

import java.util.List;

public interface IOUploadFile<E> {

   void writeFile(List list, String pathFile);
   List<E> readFile(String pathFile);

}
