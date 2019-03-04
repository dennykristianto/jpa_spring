package com.mitrais.carrot.services;

import com.mitrais.carrot.interfaces.StaffRepository;
import com.mitrais.carrot.model.Basket;
import com.mitrais.carrot.model.Carrot;
import com.mitrais.carrot.model.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServices {
    private StaffRepository staffRepository;

    public List<Staff> findAll(){
        return staffRepository.findAll();
    }

    public StaffServices(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public void create(int basketId,Staff staff){
        Basket basket=new Basket();
        basket.setId(basketId);
        staff.setBasket(basket);
        this.staffRepository.save(staff);
    }

    public void update(int staffId, Staff carrot){
        Staff item= this.staffRepository.getOne(staffId);
//        item.setFrozen(carrot.isFrozen());
        this.staffRepository.save(item);
    }

    public void delete(int staffId){
        this.staffRepository.deleteById(staffId);
    }
}
