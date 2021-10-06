package com.habit.service;

import com.habit.domain.Habit;
import com.habit.domain.Label;

import java.util.List;

public interface LabelService {
    Label add(Label label);
    List<Label> listAll(Habit habit);
}
