package ss12_Map.bai_tap_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Milk", 12000);
        Product product2 = new Product(2,"Tea", 15000);
        Product product3 = new Product(3,"Bread", 20000);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(product);
        products.add(product2);
        products.add(product3);


        for (Product p :products) {
            System.out.println(p);
        }
    }
}
