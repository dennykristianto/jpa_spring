package com.mitrais.carrot.services;

import com.mitrais.carrot.model.Basket;

import java.util.List;

public interface BasketServices {
    public List<Basket> findAll();

    public void create(Basket basket);
}
