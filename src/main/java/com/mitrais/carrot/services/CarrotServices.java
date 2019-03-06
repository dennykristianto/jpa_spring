package com.mitrais.carrot.services;

import com.mitrais.carrot.model.Carrot;

public interface CarrotServices {
    public void create(int basketId, Carrot carrot);

    public void update(int carrotId, Carrot carrot);

    public void delete(int carrotId);
}
