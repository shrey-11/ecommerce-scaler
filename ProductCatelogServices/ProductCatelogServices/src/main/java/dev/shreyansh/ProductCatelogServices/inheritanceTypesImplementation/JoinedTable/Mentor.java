package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.JoinedTable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "JT_mentor")

public class Mentor extends User{
    private String rating;
}
