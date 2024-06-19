package dev.shreyansh.ProductCatelogServices.services;

import dev.shreyansh.ProductCatelogServices.dtos.CategoryDto;
import dev.shreyansh.ProductCatelogServices.fakeStoreApi.FakeStoreClient;
import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService{


    private FakeStoreClient fakeStoreClient;
    CategoryServiceImp(FakeStoreClient fakeStoreClient){
        this.fakeStoreClient=fakeStoreClient;
    }

    public List<Category> getAllCategories(){
        String fakeStoreCategoryList[]= fakeStoreClient.getAllCategories();
        List<Category> categoryList= new ArrayList<>();
        for (String category: fakeStoreCategoryList){
            Category category1= new Category();
            category1.setTitle(category);
            categoryList.add(category1);
        }
        return categoryList;
    }

    public List<Product> getInCategory(Category category){
        return null;
    }
}
