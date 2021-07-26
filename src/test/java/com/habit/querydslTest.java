package com.habit;

import com.habit.domain.Login;
import com.habit.repository.LoginRepository;
import com.habit.repository.LoginRepositorySupport;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class querydslTest {
    @Autowired
    private LoginRepository loginRepository;
    @Autowired
    private LoginRepositorySupport loginRepositorySupport;


    @Test
    public void querydsl_기본_테스트() {
        Login login = new Login();
        login.setLoginId("test");
        login.setPassword("test");
        loginRepositorySupport.findByLoginIdANdPassword(login);
    }

}
