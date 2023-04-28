package com.spring.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;

//import javax.persistence.*;


@Entity
@Table(name = "users")
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id", nullable = false)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column
    private Long password;
    @Column(name = "full_name")
    private String fullName;

}
