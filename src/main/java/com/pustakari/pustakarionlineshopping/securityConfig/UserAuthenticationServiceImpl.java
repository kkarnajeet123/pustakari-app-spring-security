
package com.pustakari.pustakarionlineshopping.securityConfig;


import com.pustakari.pustakarionlineshopping.model.UserInfo.Authentication;
import com.pustakari.pustakarionlineshopping.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UserAuthenticationServiceImpl implements UserDetailsService {

    @Autowired
    private AuthenticationRepository authenticationRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Authentication authentication = authenticationRepository.findByusername(username);

      return new User(authentication.getUsername(), authentication.getPassword(), new ArrayList<>());
    }
}


