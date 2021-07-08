
package com.pustakari.pustakarionlineshopping.filter;


import com.pustakari.pustakarionlineshopping.securityConfig.UserAuthenticationServiceImpl;
import com.pustakari.pustakarionlineshopping.utl.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserAuthenticationServiceImpl userAuthenticationServiceImpl;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

      // String jwt=null;
        String token=null;
        String username=null;
       String authorizationHeader = request.getHeader("Authorization");

        if(authorizationHeader!= null && authorizationHeader.startsWith("Bearer")){
            token=authorizationHeader.substring(7);
            username=jwtUtil.extractUsername(token);
        }

        if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null){
            UserDetails userDetails = userAuthenticationServiceImpl.loadUserByUsername(username);


        if(jwtUtil.validateToken(token,userDetails)){

            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken= new UsernamePasswordAuthenticationToken(userDetails,null, userDetails.getAuthorities());

            usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
        }
    }
        filterChain.doFilter(request, response);
}
}


