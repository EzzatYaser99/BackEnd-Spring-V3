package com.spring.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Client extends PublicData {

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<RequestOrder> requestOrders=new ArrayList<>();


    public void addRequestOrder(RequestOrder requestOrder){
        requestOrders.add(requestOrder);
        requestOrder.setClient(this);
    }


}
