package com.habit.repository.specification;

import com.habit.domain.Folder;
import com.habit.domain.Login;
import org.springframework.data.jpa.domain.Specification;

public class FolderSpecification {
    public static Specification<Folder> equalLoginId(Folder folder){
        return (Specification<Folder>)((root, query, builder)->
                builder.equal(root.get("loginId"),folder.getLoginId())
        );
    }
}
