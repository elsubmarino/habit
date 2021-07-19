package com.habit.repository.specification;

import com.habit.domain.Login;
import org.springframework.data.jpa.domain.Specification;

public class LoginSpecification {
    public static Specification<Login> equalLoginId(String loginId){
        return (Specification<Login>)((root, query, builder)->
                builder.equal(root.get("loginId"),loginId)
        );
    }

    public static Specification<Login> equalPassword(String password){
        return (Specification<Login>)((root, query, builder)->
                builder.equal(root.get("password"),password)
        );
    }

    public static Specification<Login> equalUseYn(char useYn){
        return (Specification<Login>)((root, query, builder)->
                builder.equal(root.get("useYn"),useYn)
        );
    }
}
