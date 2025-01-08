package dev.shreyansh.ProductCatelogServices.services;

import dev.shreyansh.ProductCatelogServices.dtos.ProductDto;
import dev.shreyansh.ProductCatelogServices.fakeStoreApi.FakeStoreClient;
import dev.shreyansh.ProductCatelogServices.fakeStoreApi.FakeStoreProductDto;
import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductServiceImp implements FakeStoreProductService {

    private FakeStoreClient fakeStoreClient;
    FakeStoreProductServiceImp(FakeStoreClient fakeStoreClient){
        this.fakeStoreClient=fakeStoreClient;
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

    private Product fakeStoreProductDtotoProduct(FakeStoreProductDto fakeStoreProductDto){
        Product product=new Product();
        Category category=new Category();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice((long) fakeStoreProductDto.getPrice());
        product.setImg(fakeStoreProductDto.getImage());
        product.setDescription(fakeStoreProductDto.getDescription());
        category.setTitle(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        return product;
    }

    public Product getProduct(long productId){
        FakeStoreProductDto fakeStoreProductDto= fakeStoreClient.getProduct( productId);
        Product product= fakeStoreProductDtotoProduct(fakeStoreProductDto);
        return product;
    }

    public List<Product> getAllProducts(){
        FakeStoreProductDto fakeStoreProductsList[]= fakeStoreClient.getAllProducts();
        List<Product> list= new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto: fakeStoreProductsList){
            Product product = fakeStoreProductDtotoProduct(fakeStoreProductDto);
            list.add(product);
        }
        return list;
    }

    public Product addProduct(Product product){
        ProductDto productDto= productToProductDto(product);
        FakeStoreProductDto fakeStoreProductDto= fakeStoreClient.addProduct(productDto);
        return fakeStoreProductDtotoProduct(fakeStoreProductDto);
    }

    public Product updateProduct(long productId, Product product){
        ProductDto productDto= productToProductDto(product);
        FakeStoreProductDto fakeStoreProductDto= fakeStoreClient.updateProduct(productDto, productId);
        Product product1= fakeStoreProductDtotoProduct(fakeStoreProductDto);
        return product1;
    }

    public ResponseEntity<Product> deleteProduct(int productId){
        return null;
    }
}
