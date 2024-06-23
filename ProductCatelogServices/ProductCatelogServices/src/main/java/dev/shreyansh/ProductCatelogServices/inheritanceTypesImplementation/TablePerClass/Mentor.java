package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.TablePerClass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "TPC_Mentor")
public class Mentor extends User {
    private String rating;
}
