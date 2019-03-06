package com.mitrais.carrot.model;

import javax.persistence.*;

@Entity
public class Carrot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "basket_id")
    private int basketId;

    @Column(name = "freezer_id")
    private int freezerId;

    public int getFreezerId() {
        return freezerId;
    }

    public void setFreezerId(int freezerId) {
        this.freezerId = freezerId;
    }

    public int getBasketId() {
        return basketId;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    private boolean isFrozen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }
}
