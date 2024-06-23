package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.TablePerClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "TPC_User")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String Name;
    private String email;
    private  String password;
}
