package com.kosta.helloworld;

import javax.persistence.*;

@Entity
public class OrderInformation {
    @Id @GeneratedValue
    private long id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Product product;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
