package com.mitrais.carrot.controller;


import com.mitrais.carrot.interfaces.BasketRepository;
import com.mitrais.carrot.interfaces.CarrotRepository;
import com.mitrais.carrot.model.Basket;
import com.mitrais.carrot.model.Carrot;
import com.mitrais.carrot.services.BasketServices;
import com.mitrais.carrot.services.CarrotServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/basket")
public class BasketController {
    private BasketServices basketServices;
    private CarrotServices carrotServices;

    public BasketController(BasketServices basketServices, CarrotServices carrotServices) {
        this.basketServices = basketServices;
        this.carrotServices = carrotServices;
    }

    @GetMapping
    public List<Basket> getBasketById(@RequestParam(required = false) String name){
        if(name!=null){

        }
        return basketServices.findAll();
    }

    @PostMapping
    public void createBasket(@RequestBody Basket basket){
        basketServices.create(basket);
    }

    @PostMapping("{id}/carrot")
    public void addNewCarrot(@RequestBody Carrot carrot,@PathVariable int id){
        carrotServices.create(id,carrot);
    }

    @PutMapping("carrot/{id_carrot}")
    public void editCarrot(@RequestBody Carrot carrot, @PathVariable int id_carrot ){
        carrotServices.update(id_carrot,carrot);
    }

    @DeleteMapping("carrot/{id_carrot}")
    public void deleteCarrot(@PathVariable int id_carrot){
        carrotServices.delete(id_carrot);
    }
}
