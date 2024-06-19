package dev.shreyansh.ProductCatelogServices.services;

import dev.shreyansh.ProductCatelogServices.dtos.CategoryDto;
import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {

    public List<Category> getAllCategories();

    public List<Product> getInCategory(Category category);

}
