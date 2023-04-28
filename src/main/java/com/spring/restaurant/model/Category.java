package com.spring.restaurant.model;

import jakarta.persistence.*;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
import java.util.Set;

@Data // generte getter setter
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category extends PublicData {

    @Column(name = "logo")
    private String logo;
    @Column(name = "image")
    private String image;
    @Column(name = "description")
    private String description;
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private Set<Order> orders;

}
