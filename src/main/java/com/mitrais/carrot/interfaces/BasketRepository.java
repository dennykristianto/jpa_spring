package com.mitrais.carrot.interfaces;

import com.mitrais.carrot.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasketRepository extends JpaRepository<Basket,Integer> {
}
