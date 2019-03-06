package com.mitrais.carrot.services;

import com.mitrais.carrot.model.Staff;

import java.util.List;

public interface StaffServices {
    public List<Staff> findAll();

    public void create(int basketId,Staff staff);

    public void update(int staffId, Staff carrot);

    public void delete(int staffId);
}
