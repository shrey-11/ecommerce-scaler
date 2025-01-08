package dev.shreyansh.ProductCatelogServices.services.productCatelogServices;

import dev.shreyansh.ProductCatelogServices.fakeStoreApi.FakeStoreClient;
import dev.shreyansh.ProductCatelogServices.fakeStoreApi.FakeStoreProductDto;
import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;
import dev.shreyansh.ProductCatelogServices.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService {

    private CategoryRepository categoryRepository;
    public CategoryServiceImp(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }

    public List<Category> getAllCategories(){
        List<Category> categories= categoryRepository.findAll();
        return categories;
    }

    public List<Product> getInCategory(String category){
        List<Product> products= categoryRepository.findAllProductsByCategoryTitle(category);
        return products;
    }

}
