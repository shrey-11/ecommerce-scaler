package dev.shreyansh.ProductCatelogServices.services.productCatelogServices;

import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();

    public List<Product> getInCategory(String category);
}
