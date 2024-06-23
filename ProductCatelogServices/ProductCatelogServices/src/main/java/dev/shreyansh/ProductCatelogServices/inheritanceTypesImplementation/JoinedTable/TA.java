package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.JoinedTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "JT_TA")

public class TA extends User{

    private String gradeYear;
}
