package com.mitrais.carrot.interfaces;

import com.mitrais.carrot.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,Integer> {
}
