package dev.shreyansh.ProductCatelogServices.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String Category;
}
