package dev.shreyansh.ProductCatelogServices.controllers;

import dev.shreyansh.ProductCatelogServices.dtos.ProductDto;
import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;
import dev.shreyansh.ProductCatelogServices.services.FakeStoreProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class FakeStoreProductController {

    private FakeStoreProductService productService;

    private Product productDtotoProduct(ProductDto productDto){
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

    public FakeStoreProductController(FakeStoreProductService productService){
        this.productService= productService;
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable("productId") long productId){
        ResponseEntity<ProductDto> response= new ResponseEntity<>(productToProductDto(productService.getProduct(productId)), HttpStatus.OK);
        return response;
    }

    @GetMapping()
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        List<Product> productList= productService.getAllProducts();
        List<ProductDto> productDtoList= new ArrayList<>();
        for (Product product:productList){
            ProductDto productDto= productToProductDto(product);
            productDtoList.add(productDto);
        }
        return new ResponseEntity<>(productDtoList, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDto){
        Product product= productDtotoProduct(productDto);
        Product product1= productService.addProduct(product);
        ProductDto productDto1= productToProductDto(product1);
        return new ResponseEntity<>(productDto1, HttpStatus.OK);
    }

    @PatchMapping("/{productId}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable long productId, @RequestBody ProductDto productDto){
        Product product= productDtotoProduct(productDto);
        Product product1= productService.updateProduct(productId, product);
        return new ResponseEntity<>(productToProductDto(product1), HttpStatus.OK);
    }

    public ResponseEntity<ProductDto> deleteProduct(int productId){
        return null;
    }
}
