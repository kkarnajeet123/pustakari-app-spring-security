package com.pustakari.pustakarionlineshopping.controller;


import com.pustakari.pustakarionlineshopping.model.UserInfo.AuthResponse;
import com.pustakari.pustakarionlineshopping.model.UserInfo.LoginRequest;

import com.pustakari.pustakarionlineshopping.repository.AuthenticationRepository;
import com.pustakari.pustakarionlineshopping.securityConfig.UserAuthenticationServiceImpl;
import com.pustakari.pustakarionlineshopping.utl.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController

public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserAuthenticationServiceImpl userAuthenticationServiceImpl;

    @Autowired
    private AuthenticationRepository authenticationRepository;

    @GetMapping("/welcome")
    public String welcome(){
        return "This is the welcome page";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@Validated @RequestBody LoginRequest loginRequest) throws Exception{


        try {
            new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword());
        }catch (BadCredentialsException e){
            throw new Exception("Incorrect Username or Password ", e);

        }


        UserDetails userDetails = userAuthenticationServiceImpl.loadUserByUsername(loginRequest.getUsername());

       // String token = jwtUtil.generateToken(userDetails);
         String token = jwtUtil.generateToken(userDetails);

         return ResponseEntity.ok(new AuthResponse(token));

    }



   /* public ResponseEntity<?> registerNewUser(@RequestBody SignupRequest signupRequest){

        if(authenticationRepository.existByusername(signupRequest.getEmail())){

            return ResponseEntity.badRequest().body(new Exception("Error: Email is already registered!!"));
        }else{

        }
        return null;
        }
*/



  /* @PostMapping("/authenticate")
    public String getToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(

                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        } catch (Exception e) {
            throw new Exception("Invalid Username or Password");
        }
        return jwtUtil.generateToken(authRequest.getUsername());
    }*/
}

