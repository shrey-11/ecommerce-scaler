package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.MappedSuperClassTable;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "MSC_Mentor")
public class Mentor extends User {
    private String rating;
}
