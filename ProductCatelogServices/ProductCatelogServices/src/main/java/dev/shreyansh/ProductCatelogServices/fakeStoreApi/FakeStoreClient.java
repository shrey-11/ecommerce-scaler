package dev.shreyansh.ProductCatelogServices.fakeStoreApi;

import dev.shreyansh.ProductCatelogServices.dtos.ProductDto;
import dev.shreyansh.ProductCatelogServices.models.Category;
import dev.shreyansh.ProductCatelogServices.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class FakeStoreClient {


    private RestTemplateBuilder restTemplateBuilder;
    FakeStoreClient(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder=restTemplateBuilder;
    }


    public String[] getAllCategories(){
        RestTemplate restTemplate= restTemplateBuilder.build();
        String categoryList[]= restTemplate.getForEntity(
                "https://fakestoreapi.com/products/categories",
                String[].class
        ).getBody();
        return categoryList;
    }

    public ResponseEntity<FakeStoreProductDto> getInCategory(int productId){
        return null;
    }

    public FakeStoreProductDto getProduct(long productId){
        RestTemplate restTemplate= restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> response= restTemplate.getForEntity(
                "https://fakestoreapi.com/products/{id}",
                FakeStoreProductDto.class,
                productId
        );
        return response.getBody();
    }

    public FakeStoreProductDto[] getAllProducts(){
        RestTemplate restTemplate= restTemplateBuilder.build();
        FakeStoreProductDto[] list= restTemplate.getForEntity(
                "https://fakestoreapi.com/products",
                FakeStoreProductDto[].class).getBody();
        return list;
    }

    public FakeStoreProductDto addProduct(ProductDto productDto){
        RestTemplate restTemplate=restTemplateBuilder.build();
        FakeStoreProductDto fakeStoreProductDto= restTemplate.postForEntity(
                "https://fakestoreapi.com/products",
                productDto,
                FakeStoreProductDto.class
        ).getBody();
        return fakeStoreProductDto;
    }


    public FakeStoreProductDto updateProduct(ProductDto productDto, long productId){
        RestTemplate restTemplate= restTemplateBuilder.requestFactory(
                HttpComponentsClientHttpRequestFactory.class).build();
//        FakeStoreProductDto fakeStoreProductDto= restTemplate.patchForObject(
//                "https://fakestoreapi.com/products/{productId}",
//                productDto,
//                FakeStoreProductDto.class,
//                productId
//        );
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<ProductDto> requestEntity = new HttpEntity<>(productDto, headers);

        FakeStoreProductDto fakeStoreProductDto= restTemplate.exchange(
                "https://fakestoreapi.com/products/{Id}",
                HttpMethod.PATCH,
                requestEntity,
                FakeStoreProductDto.class,
                productId
        ).getBody();
        return fakeStoreProductDto;

    }

    public ResponseEntity<Product> deleteProduct(int productId){
        return null;
    }
}
