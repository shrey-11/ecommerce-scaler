package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.SingleTable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "ST_Mentor")
@DiscriminatorValue("2")
public class Mentor extends User {
    private String rating;
}
