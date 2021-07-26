package com.habit.repository;

import com.habit.domain.Login;
import com.habit.domain.QLogin;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class LoginRepositorySupport {

    private final JPAQueryFactory queryFactory;


    public Login findByLoginIdANdPassword(Login login) {
        return queryFactory.selectFrom(QLogin.login)
                .where(QLogin.login.loginId.eq(login.getLoginId()).and(QLogin.login.password.eq(login.getPassword()))
                )
                .fetchOne();
    }
}
