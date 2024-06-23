package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "ST_TA")
@DiscriminatorValue("3")
public class TA extends User {

    private String gradeYear;
}
