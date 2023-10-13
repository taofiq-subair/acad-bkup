package com.interswitch.springapp.service;

import com.interswitch.springapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public
class ProductService {
    static Map<String, Product> productRepo = new HashMap<>();

    static {
        Product honey = new Product();
        honey.setId("1");
        honey.setName("Honey");
        productRepo.put(honey.getId(), honey);

        Product almond = new Product();
        honey.setId("2");
        honey.setName("Almond");
        productRepo.put(almond.getId(), almond);
    }

    public void addProduct(Product product) {
        productRepo.put(product.getId(), product);
    }

    public void deleteProduct(String id) {
        if (productRepo.containsKey(id)) {
            productRepo.remove(id);
        }
    }

    public void updateProduct(String id, Product product) {
        if (productRepo.containsKey(id)) {
            productRepo.replace(id, product);
        }
    }


    public Product getProduct(String id) {
        return productRepo.get(id);
    }

    public Collection<Product> getProducts() {
        return productRepo.values();
    }
}
