package dev.shreyansh.ProductCatelogServices.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Getter
@Setter
@Entity
public class Product extends BaseModel {

    private String title;
    private String description;
    private String img;
    private Long price;
    @ManyToOne
    private Category category;
}
