package com.task.springboot.repository;

import com.task.springboot.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,String>{

}
