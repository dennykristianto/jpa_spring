package com.mitrais.carrot.services;

import com.mitrais.carrot.interfaces.CarrotRepository;
import com.mitrais.carrot.model.Carrot;
import org.springframework.stereotype.Service;

@Service
public class CarrotServices {
    private CarrotRepository carrotRepository;

    public CarrotServices(CarrotRepository carrotRepository) {
        this.carrotRepository = carrotRepository;
    }

    public void create(int basketId, Carrot carrot){
        carrot.setBasketId(basketId);
        this.carrotRepository.save(carrot);
    }

    public void update(int carrotId, Carrot carrot){
        Carrot item= this.carrotRepository.getOne(carrotId);
        item.setFrozen(carrot.isFrozen());
        this.carrotRepository.save(item);
    }

    public void delete(int carrotId){
        this.carrotRepository.deleteById(carrotId);
    }
}
