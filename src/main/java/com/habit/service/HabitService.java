package com.habit.service;

import com.habit.domain.Habit;

import java.util.List;

public interface HabitService {
    List<Habit> getList(Habit habit);
}
