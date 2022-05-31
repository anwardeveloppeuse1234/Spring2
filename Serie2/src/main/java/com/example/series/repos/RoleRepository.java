package com.example.series.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.series.entities.Role;
public interface RoleRepository extends JpaRepository<Role, Long>  {

}
