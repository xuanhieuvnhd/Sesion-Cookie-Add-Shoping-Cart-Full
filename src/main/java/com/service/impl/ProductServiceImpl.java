package com.service.impl;

import com.model.Product;
import com.repositories.ProductRepositoryPagingAndSorting;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public class ProductServiceImpl implements ProductService {
@Autowired
ProductRepositoryPagingAndSorting productRepositoryPagingAndSorting;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepositoryPagingAndSorting.findAll(pageable);
    }

    @Override
    public Page<Product> findAllByNameContaining(String name, Pageable pageable) {
        return productRepositoryPagingAndSorting.findAllByNameContaining(name,pageable);
    }

    @Override
    public Product findById(Long id) {
        return productRepositoryPagingAndSorting.findOne(id);
    }

    @Override
    public void save(Product product) {
        productRepositoryPagingAndSorting.save(product);
    }

    @Override
    public void remove(Long id) {
        productRepositoryPagingAndSorting.delete(id);
    }
}
