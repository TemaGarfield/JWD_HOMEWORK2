package by.kotik.shop.main;

import by.kotik.shop.dao.DBConnection;
import by.kotik.shop.dao.Generator;
import by.kotik.shop.entity.Product;
import by.kotik.shop.logic.ProductLogic;
import by.kotik.shop.view.ProductView;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Product> products = new ArrayList<>();
        String data = DBConnection.getData("D:\\Java\\JWD_HOMEWORK2\\src\\appliances_db.txt");
        products.addAll(Generator.generateProducts(Generator.generateList(Generator.generateArrayFromData(data))));

        System.out.println("Min price: " + ProductLogic.findMinPrice(products));
        System.out.println();
        System.out.println("All kettles: ");
        ProductView.showByType(products, "Kettle");
    }
}
