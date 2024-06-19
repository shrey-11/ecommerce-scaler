package dev.shreyansh.ProductCatelogServices.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Getter
@Setter
public class Product extends BaseModel {

    private String title;
    private String description;
    private String img;
    private Long price;
    private Category category;
}
