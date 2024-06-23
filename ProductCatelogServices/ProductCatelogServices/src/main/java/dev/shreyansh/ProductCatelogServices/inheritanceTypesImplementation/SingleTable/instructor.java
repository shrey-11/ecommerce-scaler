package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.SingleTable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "ST_Instructor")
@DiscriminatorValue("1")
public class instructor extends User {
    private String company;

}
