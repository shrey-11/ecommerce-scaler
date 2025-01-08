package dev.shreyansh.ProductCatelogServices.controllers.ProductCatelogController;

import dev.shreyansh.ProductCatelogServices.dtos.CategoryDto;
import dev.shreyansh.ProductCatelogServices.dtos.ProductDto;
import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;
import dev.shreyansh.ProductCatelogServices.services.productCatelogServices.CategoryService;
import dev.shreyansh.ProductCatelogServices.services.productCatelogServices.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mystore/category")
public class CategoryController {

    private CategoryServiceImp categoryServiceImp;
    public CategoryController(CategoryServiceImp categoryServiceImp){
        this.categoryServiceImp= categoryServiceImp;
    }



    @GetMapping()
    public ResponseEntity<List<CategoryDto>> getAllCategories(){
        List<Category> categories = categoryServiceImp.getAllCategories();
        List<CategoryDto> categoryDtos = new ArrayList<>();
        CategoryDto categoryDto;
        for(Category category: categories){
            categoryDto = Utilities.categoryToCategoryDto(category);
            categoryDtos.add(categoryDto);
        }
        return new ResponseEntity<>(categoryDtos, HttpStatus.OK);
    }

    @GetMapping("/{categoryName}")
    public ResponseEntity<List<ProductDto>> getInCategory(@PathVariable String categoryName) {
        List<Product> products = categoryServiceImp.getInCategory(categoryName);
        List<ProductDto> productDtos = new ArrayList<>();
        ProductDto productDto;
        for(Product product: products){
            productDto = Utilities.productToProductDto(product);
            productDtos.add(productDto);
        }
        return new ResponseEntity<>(productDtos, HttpStatus.OK);
    }
}
