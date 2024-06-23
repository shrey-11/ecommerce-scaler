package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.MappedSuperClassTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "MSC_TA")
public class TA extends User {

    private String gradeYear;
}
