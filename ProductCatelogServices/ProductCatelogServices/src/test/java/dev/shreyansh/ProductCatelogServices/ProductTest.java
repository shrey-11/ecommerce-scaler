package dev.shreyansh.ProductCatelogServices;

import dev.shreyansh.ProductCatelogServices.fetchingTypesAndCascading.Category;
import dev.shreyansh.ProductCatelogServices.fetchingTypesAndCascading.FtCategoryRepository;
import dev.shreyansh.ProductCatelogServices.fetchingTypesAndCascading.FtProductRepository;
import dev.shreyansh.ProductCatelogServices.fetchingTypesAndCascading.Product;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductTest {
    @Autowired
    private FtProductRepository ftProductRepository;
    @Autowired
    private FtCategoryRepository ftCategoryRepository;

//    @Test
//    void savingProductsandCategory(){
//
//        Category category = new Category();
//        category.setTitle("Phones");
//        category.setDescription("this is saving in lazy loading");
//        ftCategoryRepository.save(category);
//        Product product = new Product();
//        product.setTitle("Iphone");
//        product.setDescription("this is saving in lazy loading");
//        product.setCategory(category);
//        ftProductRepository.save(product);
//
//    }

//    @Test
//    @Transactional
//    void fetchingProductsandCategory(){
//        Product product = ftProductRepository.findProductById(1L);
//        System.out.println("Fetched Product");
//        product.getCategory();
//    }

    //@Test
    void testingCascading(){

        Category category = new Category();
        category.setTitle("Electronics");
        category.setDescription("this is Cascading");
        //ftCategoryRepository.save(category);
        Product product = new Product();
        product.setTitle("Iphone12");
        product.setPrice(69999L);
        product.setDescription("learning cascading");
        product.setCategory(category);
        ftProductRepository.save(product);
    }

}
