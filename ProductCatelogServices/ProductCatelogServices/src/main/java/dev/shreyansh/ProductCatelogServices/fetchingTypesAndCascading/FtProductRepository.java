package dev.shreyansh.ProductCatelogServices.fetchingTypesAndCascading;


import org.springframework.data.jpa.repository.JpaRepository;

public interface FtProductRepository extends JpaRepository<Product, Long> {


}
