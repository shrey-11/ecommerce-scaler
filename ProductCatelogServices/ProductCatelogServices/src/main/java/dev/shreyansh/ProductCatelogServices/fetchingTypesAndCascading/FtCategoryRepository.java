package dev.shreyansh.ProductCatelogServices.fetchingTypesAndCascading;


import org.springframework.data.jpa.repository.JpaRepository;

public interface FtCategoryRepository extends JpaRepository<Category, Long> {
    Category save(Category category);

}
