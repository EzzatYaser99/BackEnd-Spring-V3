package com.spring.restaurant.model;

import jakarta.persistence.*;
import lombok.*;
//import net.minidev.json.annotate.JsonIgnore;
//
//import javax.persistence.*;
//import java.util.Set;

@Data // generte getter setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends PublicData {
    @Column(name = "price")
    private int price;

    @Column(name = "image")
    private String image;


    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

}
