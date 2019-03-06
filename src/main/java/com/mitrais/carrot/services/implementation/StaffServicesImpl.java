package com.mitrais.carrot.services.implementation;

import com.mitrais.carrot.interfaces.StaffRepository;
import com.mitrais.carrot.model.Basket;
import com.mitrais.carrot.model.Staff;
import com.mitrais.carrot.services.StaffServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServicesImpl implements StaffServices {
    private StaffRepository staffRepository;

    public List<Staff> findAll(){
        return staffRepository.findAll();
    }

    public StaffServicesImpl(StaffRepository staffRepository) {
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
