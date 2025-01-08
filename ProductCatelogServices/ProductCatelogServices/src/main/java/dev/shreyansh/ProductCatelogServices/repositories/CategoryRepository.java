package dev.shreyansh.ProductCatelogServices.repositories;

import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAll();

    @Query("SELECT p FROM Product p JOIN p.category c WHERE c.title = :categoryTitle")
    List<Product> findAllProductsByCategoryTitle(@Param("categoryTitle") String categoryTitle);
}

