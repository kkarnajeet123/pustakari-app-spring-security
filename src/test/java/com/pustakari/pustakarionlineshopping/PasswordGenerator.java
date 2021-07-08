package com.pustakari.pustakarionlineshopping;

import com.pustakari.pustakarionlineshopping.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
public class PasswordGenerator {


    public static void main(String[] args) {
        //   BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String userPassword = "user1";
        //String encodedPassword = bCryptPasswordEncoder.encode(userPassword);

        //System.out.println(encodedPassword);
    }

}