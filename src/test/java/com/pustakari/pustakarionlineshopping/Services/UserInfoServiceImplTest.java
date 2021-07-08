package com.pustakari.pustakarionlineshopping.Services;

import com.pustakari.pustakarionlineshopping.repository.UserRepository;
import com.pustakari.pustakarionlineshopping.service.UserInfoServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserInfoServiceImplTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserInfoServiceImpl userInfoService;


    @Test
    public void testSaveUserInfo(){

    }


}
