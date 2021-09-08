package com.habit.util.oauth.impl;

import com.habit.util.oauth.SocialOAuth;
import org.springframework.stereotype.Component;

@Component
public class NaverOauth implements SocialOAuth {
    @Override
    public String getOauthRedirectURL() {
        return null;
    }
}
