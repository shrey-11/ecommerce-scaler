package dev.shreyansh.ProductCatelogServices.controllers.ProductCatelogController;

import dev.shreyansh.ProductCatelogServices.dtos.CategoryDto;
import dev.shreyansh.ProductCatelogServices.dtos.ProductDto;
import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;

public class Utilities {

    static CategoryDto categoryToCategoryDto(Category category){
        CategoryDto categoryDto=new CategoryDto();
        categoryDto.setTitle(category.getTitle());
        return categoryDto;
    }

    static ProductDto productToProductDto(Product product){
        ProductDto productDto=new ProductDto();
        productDto.setId(product.getId());
        productDto.setTitle(product.getTitle());
        productDto.setPrice(product.getPrice());
        productDto.setImage(product.getImg());
        productDto.setDescription(product.getDescription());
        productDto.setCategory(product.getCategory().getTitle());
        return productDto;
    }

    static Product productDtotoProduct(ProductDto productDto){
        Product product=new Product();
        Category category=new Category();
        product.setId(productDto.getId());
        product.setTitle(productDto.getTitle());
        product.setPrice((long) productDto.getPrice());
        product.setImg(productDto.getImage());
        product.setDescription(productDto.getDescription());
        category.setTitle(productDto.getCategory());
        product.setCategory(category);
        return product;
    }
}
