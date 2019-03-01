package com.mitrais.carrot.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "basket")
    private List<Carrot> carrot;

    public List<Carrot> getCarrot() {
        return carrot;
    }

    public void setCarrot(List<Carrot> carrot) {
        this.carrot = carrot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
