package dev.shreyansh.ProductCatelogServices.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BaseModel {
    private Boolean isDeleted;
    private long id;
    private Date createdDate;
    private Date lastUpdated;
}
