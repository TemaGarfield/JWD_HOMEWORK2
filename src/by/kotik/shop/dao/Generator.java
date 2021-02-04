package by.kotik.shop.dao;

import by.kotik.shop.entity.Product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Generator {

    public static String[] generateArrayFromData(String data) {
        String[] array = data.split("\n");

        return array;
    }

    public static List<String[]> generateList(String[] data) {
        List<String[]> nameAndDescription = new ArrayList<>();
        for (String d:data) {
            String[] tmp = d.split(" : ");
            nameAndDescription.add(tmp);
        }

        return nameAndDescription;
    }

    public static List<Product> generateProducts(List<String[]> nameAndDescription) {
        List<Product> products = new ArrayList<>();
        Map<String, String> characteristics = new LinkedHashMap<>();

        for (String[] nAndD:nameAndDescription) {
            String[] parseByComma = nAndD[1].split(", ");

            for (String byComma:parseByComma) {
                String[] parseByEqually = byComma.split("=");
                characteristics.put(parseByEqually[0], parseByEqually[1]);
            }

            products.add(new Product(nAndD[0], characteristics));
            characteristics.clear();
        }

        return products;
    }
}
