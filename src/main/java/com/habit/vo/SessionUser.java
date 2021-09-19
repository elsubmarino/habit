package com.habit.vo;


import com.habit.domain.Login;
import lombok.Getter;

import java.io.Serializable;

/**
 * 직렬화 기능을 가진 User클래스
 */
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(Login login){
        this.name = login.getName();
        this.email = login.getEmail();
        this.picture = login.getPicture();
    }
}