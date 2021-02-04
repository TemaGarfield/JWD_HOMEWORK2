package by.kotik.shop.logic;

import by.kotik.shop.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductLogic {
    public static List<Double> findAllPrice(List<Product> products) {
        List<Double> prices = new ArrayList<>();
        for (Product product:products) {
            for (Map.Entry<String, String> characteristic:product.getCharacteristics().entrySet()) {
                if (characteristic.getKey().equals("PRICE")) {
                    prices.add(Double.valueOf(characteristic.getValue()));
                }
            }
        }

        return prices;
    }
    public static Double findMinPrice(List<Product> productList) {

        List<Double> prices = findAllPrice(productList);

        Double min = prices.get(0);
        for (int i = 1; i < prices.size(); i++) {
            if (min > prices.get(i)) {
                min = prices.get(i);
            }
        }

        return min;
    }
}
