package com.sda.onlineshop.CoursesShop.service;

import com.sda.onlineshop.CoursesShop.model.Product;

import java.util.Map;

public interface ShoppingCartService {
    void addProduct(Product product);

    void removeProduct(Product product);

    void clearProducts();

    double totalPrice();

    void checkOut();

    Map<Product, Integer> getAllProducts();
}
