package com.pustakari.pustakarionlineshopping.repository;

import com.pustakari.pustakarionlineshopping.model.UserInfo.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends JpaRepository<Authentication, Integer> {

    Authentication findByusername(String username);


}
