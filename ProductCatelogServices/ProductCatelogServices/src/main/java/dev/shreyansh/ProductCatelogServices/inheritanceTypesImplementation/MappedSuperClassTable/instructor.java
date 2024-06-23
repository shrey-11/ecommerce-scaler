package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.MappedSuperClassTable;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "MSC_Instructor")
public class instructor extends User {
    private String company;
}
