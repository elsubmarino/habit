package com.habit.service.impl;

import com.habit.domain.Login;
import com.habit.repository.LoginRepository;
import com.habit.repository.LoginRepositorySupport;
import com.habit.repository.specification.LoginSpecification;
import com.habit.service.LoginService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Resource(name="loginRepository")
    private LoginRepository loginRepository;

    @Resource(name="loginRepositorySupport")
    private LoginRepositorySupport loginRepositorySupport;

    @Override
    public Login getLoginInformation(Login login) {
        //loginRepositorySupport.findByLoginIdANdPassword(login);

        Specification<Login> specLoginId = LoginSpecification.equalLoginId(login.getLoginId());
        Specification<Login> specPassword = LoginSpecification.equalLoginId(login.getPassword());
        Specification<Login> specUseYn = LoginSpecification.equalUseYn('Y');

        Login returned = loginRepository.findOne(Specification.where(specLoginId).and(specPassword).and(specUseYn)).orElse(null);


        return returned;
    }
}
