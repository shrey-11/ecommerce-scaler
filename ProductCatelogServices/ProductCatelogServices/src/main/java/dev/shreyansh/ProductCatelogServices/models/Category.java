package dev.shreyansh.ProductCatelogServices.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel {

    private String title;
    private String description;
    private String img;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
