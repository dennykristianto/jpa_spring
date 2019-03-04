package com.mitrais.carrot.controller;

import com.mitrais.carrot.interfaces.StaffRepository;
import com.mitrais.carrot.model.Staff;
import com.mitrais.carrot.services.StaffServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/staff")
public class StaffController {
    private StaffServices staffServices;

    public StaffController(StaffServices staffServices) {
        this.staffServices = staffServices;
    }

    @GetMapping
    public List<Staff> getAll(){
        return staffServices.findAll();
    }

    @PostMapping
    public void create(@RequestBody Map<String,String> staff){
        Staff staf=new Staff();
        staf.setStaffName(staff.get("staffName"));
        staffServices.create(Integer.valueOf(staff.get("basketId")),staf);
    }
}
