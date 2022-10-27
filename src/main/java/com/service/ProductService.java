package com.service;

import com.model.Product;

public interface ProductService extends GeneralService<Product> {
    void save(Product product);
    void remove(Long id);
}
