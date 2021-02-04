package by.kotik.shop.entity;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Product {
    private String type;
    private Map<String, String> characteristics;


    public Product() {
        this.type = "";
    }

    public Product(String type) {
        this.type = type;
    }

    public Product(String type, Map<String, String> characteristics) {
        this.type = type;
        this.characteristics = new LinkedHashMap<>();
        this.characteristics.putAll(characteristics);
    }

    public String getType() {
        return type;
    }

    public Map<String, String> getCharacteristics() {
        return characteristics;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCharacteristics(Map<String, String> characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(type, product.type) && Objects.equals(characteristics, product.characteristics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, characteristics);
    }
}
