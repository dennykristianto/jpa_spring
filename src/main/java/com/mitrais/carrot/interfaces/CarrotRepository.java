package com.mitrais.carrot.interfaces;

import com.mitrais.carrot.model.Carrot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrotRepository extends JpaRepository<Carrot,Integer> {

}
