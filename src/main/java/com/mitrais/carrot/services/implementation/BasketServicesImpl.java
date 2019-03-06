package com.mitrais.carrot.services.implementation;

import com.mitrais.carrot.interfaces.BasketRepository;
import com.mitrais.carrot.model.Basket;
import com.mitrais.carrot.services.BasketServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServicesImpl implements BasketServices {
    private BasketRepository basketRepository;

    public BasketServicesImpl(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public List<Basket> findAll(){
        return basketRepository.findAll();
    }

    public void create(Basket basket){
        basketRepository.save(basket);
    }
}
