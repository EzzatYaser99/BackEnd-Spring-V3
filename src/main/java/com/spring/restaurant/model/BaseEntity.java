package com.spring.restaurant.model;


import jakarta.persistence.*;

import lombok.*;

//import javax.persistence.*;

@Data // generate getter & setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
}
