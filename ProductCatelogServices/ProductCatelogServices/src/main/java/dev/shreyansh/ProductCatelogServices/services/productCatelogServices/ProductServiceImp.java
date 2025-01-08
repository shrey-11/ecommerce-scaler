package dev.shreyansh.ProductCatelogServices.services.productCatelogServices;

import dev.shreyansh.ProductCatelogServices.models.Product;
import dev.shreyansh.ProductCatelogServices.repositories.CategoryRepository;
import dev.shreyansh.ProductCatelogServices.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService{

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    public ProductServiceImp(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository= productRepository;
        this.categoryRepository= categoryRepository;
    }

    public Product getProduct(long productId){
        return productRepository.findById(productId);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product addProduct(Product product){
        categoryRepository.save(product.getCategory());
        return productRepository.save(product);
    }

    public Product updateProduct(long productId, Product product){
        categoryRepository.save(product.getCategory());
        return productRepository.save(product);
    }

    public Product deleteProduct(long productId){
        Product product= productRepository.findById(productId);
        product.setIsDeleted(true);
        return productRepository.save(product);
    }
}
