package com.sda.onlineshop.CoursesShop.repository;

import com.sda.onlineshop.CoursesShop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
