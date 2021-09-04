package com.habit.service;

import com.habit.domain.Folder;
import com.habit.domain.Habit;
import org.springframework.data.domain.Page;

import java.util.List;

public interface HabitService {
    Habit create(Habit habit);
    void delete(Habit habit);
    Page<Habit> getList(Habit habit,int number);

}
