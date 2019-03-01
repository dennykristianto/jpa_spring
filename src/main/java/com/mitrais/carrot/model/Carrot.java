package com.mitrais.carrot.model;

import javax.persistence.*;

@Entity
public class Carrot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Basket basket;

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    private boolean isFroozen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isFroozen() {
        return isFroozen;
    }

    public void setFroozen(boolean froozen) {
        isFroozen = froozen;
    }
}
