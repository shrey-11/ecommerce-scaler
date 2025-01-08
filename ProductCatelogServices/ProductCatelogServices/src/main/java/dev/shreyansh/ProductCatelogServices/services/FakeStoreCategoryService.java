package dev.shreyansh.ProductCatelogServices.services;

import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;

import java.util.List;

public interface FakeStoreCategoryService {

    public List<Category> getAllCategories();

    public List<Product> getInCategory(String category);

}
