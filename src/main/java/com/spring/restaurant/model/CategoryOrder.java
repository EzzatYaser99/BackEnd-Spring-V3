package com.spring.restaurant.model;

import jakarta.persistence.*;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//import javax.persistence.Column;
//import javax.persistence.MappedSuperclass;
import java.util.Date;


@Data // generte getter setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class CategoryOrder extends BaseEntity {

    @Column(name = "date_create")
    @CreationTimestamp
    private Date dateCreate;

    @Column(name = "date_update")
    @UpdateTimestamp
    private Date dateUpdate;
}
