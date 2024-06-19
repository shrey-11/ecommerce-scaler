package dev.shreyansh.ProductCatelogServices.services;

import dev.shreyansh.ProductCatelogServices.dtos.ProductDto;
import dev.shreyansh.ProductCatelogServices.models.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    public Product getProduct(long productId);

    public List<Product> getAllProducts();

    public Product addProduct(Product product);

    public Product updateProduct(long productId, Product product);

    public ResponseEntity<Product> deleteProduct(int productId);
}
