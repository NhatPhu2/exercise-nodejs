package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    HashMap<String, List<Product>> map = new HashMap<>();

    public void put(Product product) {
        if (product == null) {
            throw new RuntimeException("Product cannot be null");
        }
        String key = product.getName();
        List<Product> pr;
        if (map.containsKey(product.getName())) {
            pr = map.get(key);
        } else {
            pr = new ArrayList<>();
        }
        pr.add(product);
        map.put(key, pr);
    }

    public List<Product> get(String name) {
        if (name.isEmpty()) {
            return new ArrayList<>();
        }
        return map.get(name);
    }

    public boolean remove(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("key cannot be null");
        }
        map.remove(name);
        return true;
    }

    public double totalPriceOf(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("key cannot be null");
        }
        List<Product> products = map.get(name);
        double totalPrice = 0.0d;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public int countTotal(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("key cannot be null");
        }
        List<Product> products = map.get(name);
        return products.size();
    }

}
