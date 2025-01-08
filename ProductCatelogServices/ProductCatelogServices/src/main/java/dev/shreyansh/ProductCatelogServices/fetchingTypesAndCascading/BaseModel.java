package dev.shreyansh.ProductCatelogServices.fetchingTypesAndCascading;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@MappedSuperclass
public class BaseModel {

    @Id
    @GeneratedValue
    private long id;
    private Date createdDate;
    private Date lastUpdated;
    private Boolean isDeleted;
}
