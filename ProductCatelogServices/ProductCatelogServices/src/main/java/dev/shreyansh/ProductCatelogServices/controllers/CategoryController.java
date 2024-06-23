package dev.shreyansh.ProductCatelogServices.controllers;

import dev.shreyansh.ProductCatelogServices.dtos.CategoryDto;
import dev.shreyansh.ProductCatelogServices.dtos.ProductDto;
import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;
import dev.shreyansh.ProductCatelogServices.services.CategoryServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    private ProductDto productToProductDto(Product product){
        ProductDto productDto=new ProductDto();
        productDto.setId(product.getId());
        productDto.setTitle(product.getTitle());
        productDto.setPrice(product.getPrice());
        productDto.setImage(product.getImg());
        productDto.setDescription(product.getDescription());
        productDto.setCategory(product.getCategory().getTitle());

        return productDto;
    }

    @GetMapping()
    public ResponseEntity<List<String>> getAllCategories(){
        List<Category> categoryList= categoryServiceImp.getAllCategories();
        List<String> categories= new ArrayList<>();
        for(Category category: categoryList){
            categories.add(category.getTitle());
        }
        ResponseEntity<List<String>> response= new ResponseEntity<>(categories, HttpStatus.OK);
        return response;
    }

    @GetMapping("/{categoryName}")
    public ResponseEntity<List<ProductDto>> getInCategory(@PathVariable String categoryName) {
        List<Product> productList= categoryServiceImp.getInCategory(categoryName);
        List<ProductDto> productDtoList= new ArrayList<>();
        for(Product product: productList){
            ProductDto productDto= productToProductDto(product);
            productDtoList.add(productDto);
        }
        return new ResponseEntity<>(productDtoList, HttpStatus.OK);
    }

}
