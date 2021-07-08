package com.pustakari.pustakarionlineshopping.securityConfig;




import com.pustakari.pustakarionlineshopping.model.UserInfo.Authentication;
import com.pustakari.pustakarionlineshopping.model.UserInfo.Role;
import com.pustakari.pustakarionlineshopping.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.Collections;

public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    AuthenticationRepository authenticationRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Authentication authentication = authenticationRepository.findByusername(username);
        Role role = new Role();
        String roleName=role.getRoleName();

        return new User(authentication.getUsername(),authentication.getPassword(),authorities(roleName));
    }

public Collection<? extends GrantedAuthority> authorities(String roleName){



        return Collections.singletonList(new SimpleGrantedAuthority(roleName));
}

}



