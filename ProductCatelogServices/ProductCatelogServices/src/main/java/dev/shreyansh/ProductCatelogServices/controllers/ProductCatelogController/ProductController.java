package dev.shreyansh.ProductCatelogServices.controllers.ProductCatelogController;

import dev.shreyansh.ProductCatelogServices.dtos.ProductDto;
import dev.shreyansh.ProductCatelogServices.models.Product;
import dev.shreyansh.ProductCatelogServices.services.productCatelogServices.ProductServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/mystore/product")
public class ProductController {


    private ProductServiceImp productServiceImp;
    ProductController(ProductServiceImp productServiceImp){
        this.productServiceImp= productServiceImp;
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

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable("productId") long productId){
        Product product = productServiceImp.getProduct(productId);
        ProductDto productDto= productToProductDto(product);
        return new ResponseEntity<>(productDto, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        List<Product> products = productServiceImp.getAllProducts();
        List<ProductDto> productDtos = new ArrayList<>();
        ProductDto productDto;
        for(Product product: products){
            productDto = productToProductDto(product);
            productDtos.add(productDto);
        }
        return new ResponseEntity<>(productDtos, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDto){
        Product product= Utilities.productDtotoProduct(productDto);
        Product product1 = productServiceImp.addProduct(product);
        return new ResponseEntity<>(productToProductDto(product1), HttpStatus.OK);
    }

    @PatchMapping()
    public ResponseEntity<ProductDto> updateProduct(@RequestBody ProductDto productDto){
        Product product= Utilities.productDtotoProduct(productDto);
        Product product1 = productServiceImp.addProduct(product);
        return new ResponseEntity<>(productToProductDto(product1), HttpStatus.OK);
    }

    @PatchMapping("/{productId}")
    public ResponseEntity<ProductDto> deleteProduct(@PathVariable long productId){
        Product product1 = productServiceImp.deleteProduct(productId);
        ProductDto productDto= productToProductDto(product1);
        return new ResponseEntity<>(productDto, HttpStatus.OK);
    }
}
