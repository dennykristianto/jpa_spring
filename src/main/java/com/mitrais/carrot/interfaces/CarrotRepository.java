package com.mitrais.carrot.interfaces;

import com.mitrais.carrot.model.Carrot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CarrotRepository extends JpaRepository<Carrot,Integer> {

}
