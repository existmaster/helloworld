package com.kosta.helloworld;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id @GeneratedValue
    private long id;
    private String name;
    private int price;

    @OneToMany(mappedBy = "product")
    private List<OrderInformation> orders;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<OrderInformation> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderInformation> orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
