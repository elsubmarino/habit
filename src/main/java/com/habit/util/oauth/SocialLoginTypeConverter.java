package com.habit.util.oauth;

import com.habit.constants.SocialLoginType;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class SocialLoginTypeConverter implements Converter<String, SocialLoginType> {
    @Override
    public SocialLoginType convert(String source) {
        return SocialLoginType.valueOf(source.toUpperCase());
        //https://accounts.google.com/o/oauth2/auth?scope=profile&response_type=code&client_id=83075887317-ou0l2nn1k8teq9562osdtj2ablgl5n43.apps.googleusercontent.com&redirect_uri=http://localhost:3000/auth/google/callback
    }
}
