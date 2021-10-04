package com.habit.repository.specification;

import com.habit.domain.Habit;
import com.habit.domain.Label;
import com.habit.domain.Login;
import org.springframework.data.jpa.domain.Specification;

public class LabelSpecification {
    public static Specification<Label> equalLoginId(Habit habit){
        return (Specification<Label>)((root,query,builder)->(
                    builder.equal(root.get("login"),habit.getLogin())
                ));
    }
}
