package dev.shreyansh.ProductCatelogServices.fetchingTypesAndCascading;

//import dev.shreyansh.ProductCatelogServices.models.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import dev.shreyansh.ProductCatelogServices.fetchingTypesAndCascading.BaseModel;
@Getter
@Setter
@Entity(name = "FT_category")
public class Category extends BaseModel {
    private String title;
    private String description;
    private String img;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
