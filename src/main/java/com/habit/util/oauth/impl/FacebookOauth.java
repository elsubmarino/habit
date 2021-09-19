package com.habit.util.oauth.impl;

import com.habit.util.oauth.SocialOauth;
import org.springframework.stereotype.Component;

@Component
public class FacebookOauth implements SocialOauth {
    @Override
    public String getOauthRedirectURL() {
        return null;
    }

    @Override
    public String requestAccessToken(String code) {
        return null;
    }
}
