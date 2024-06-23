package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "TPC_TA")
public class TA extends User {

    private String gradeYear;
}
