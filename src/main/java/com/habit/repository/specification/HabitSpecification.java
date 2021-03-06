package com.habit.repository.specification;

import com.habit.domain.Habit;
import org.springframework.data.jpa.domain.Specification;

public class HabitSpecification {
    public static Specification<Habit> equalLoginId(Habit habit){
        return (Specification<Habit>)((root, query, builder)->
            builder.equal(root.get("login"),habit.getLogin())
        );
    }

    public static Specification<Habit> equalFolderId(Habit habit){
        return (Specification<Habit>)((root, query, builder)->
            builder.equal(root.get("folder").get("id"),(habit.getFolder().getId()))
        );
    }
}
