package dev.shreyansh.ProductCatelogServices.repositories;

import dev.shreyansh.ProductCatelogServices.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findById(long id);
    List<Product> findAll();
}

