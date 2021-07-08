package com.pustakari.pustakarionlineshopping.repository;

import com.pustakari.pustakarionlineshopping.model.UserInfo.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
