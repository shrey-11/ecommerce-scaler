package dev.shreyansh.ProductCatelogServices.controllers;

import dev.shreyansh.ProductCatelogServices.dtos.CategoryDto;
import dev.shreyansh.ProductCatelogServices.dtos.ProductDto;
import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.services.CategoryServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products/category")

public class CategoryController {

    private CategoryServiceImp categoryServiceImp;
    CategoryController(CategoryServiceImp categoryServiceImp){
        this.categoryServiceImp=categoryServiceImp;
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllCategories(){
        List<Category> categoryList= categoryServiceImp.getAllCategories();
        List<String> categories= new ArrayList<>();
        for(Category category: categoryList){
            categories.add(category.getTitle());
        }
        ResponseEntity<List<String>> response= new ResponseEntity<>(categories, HttpStatus.OK);
        return response;
    }

    public ResponseEntity<CategoryDto> getInCategory(int productId){
        return null;
    }

}
