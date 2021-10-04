package com.habit.repository;

import com.habit.domain.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LabelRepository extends JpaRepository<Login, Long>, JpaSpecificationExecutor<Login> {

}
