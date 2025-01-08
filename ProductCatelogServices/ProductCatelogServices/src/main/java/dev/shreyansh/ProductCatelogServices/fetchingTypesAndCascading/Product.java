package dev.shreyansh.ProductCatelogServices.fetchingTypesAndCascading;

//import dev.shreyansh.ProductCatelogServices.models.BaseModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import dev.shreyansh.ProductCatelogServices.fetchingTypesAndCascading.BaseModel;
@Getter
@Setter
@Entity(name = "FT_product")
public class Product extends BaseModel {

    private String title;
    private String description;
    private String img;
    private Long price;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    private Category category;
}
