package dev.shreyansh.ProductCatelogServices.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category extends BaseModel {
    private String title;
    private String description;
    private String img;
    private List<Product> products;
}
