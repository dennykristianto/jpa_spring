package com.mitrais.carrot.services;

import com.mitrais.carrot.interfaces.BasketRepository;
import com.mitrais.carrot.model.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServices {
    private BasketRepository basketRepository;

    public BasketServices(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public List<Basket> findAll(){
        return basketRepository.findAll();
    }

    public void create(Basket basket){
        basketRepository.save(basket);
    }
}
