package com.habit.repository;

import com.habit.domain.Label;
import com.habit.domain.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LabelRepository extends JpaRepository<Label, Long>, JpaSpecificationExecutor<Label> {

}
