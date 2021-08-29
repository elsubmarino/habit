package com.habit.repository;

import com.habit.domain.Habit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HabitRepository extends JpaRepository<Habit,Long>, JpaSpecificationExecutor<Habit> {

}
