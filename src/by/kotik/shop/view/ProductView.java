package by.kotik.shop.view;

import by.kotik.shop.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductView {
    public static void showProduct(Product product) {
        System.out.println("Type: " + product.getType());
        System.out.println("Description: ");
        for (Map.Entry characteristic:product.getCharacteristics().entrySet()) {
            System.out.println(characteristic.getKey() + ": " + characteristic.getValue());
        }
    }
    public static void showAllProducts(List<Product> products) {
        for (Product product:products) {
            showProduct(product);
        }
    }

    public static void showByType(List<Product> products, String type) {
        for (Product product:products) {
            if (product.getType().equals(type)) {
                showProduct(product);
                System.out.println();
            }

        }
    }
}
