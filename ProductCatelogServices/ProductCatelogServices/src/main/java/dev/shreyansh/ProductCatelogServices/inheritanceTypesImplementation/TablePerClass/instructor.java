package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.TablePerClass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "TPC_instructor")
public class instructor extends User {
    private String company;

}
