package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.JoinedTable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;

@Getter
@Setter

@Entity(name = "JT_User")
@Inheritance(strategy = InheritanceType.JOINED)

public class User {

    @Id
    @GeneratedValue
    private long Id;
    private String Name;
    private String email;
    private  String password;
}
