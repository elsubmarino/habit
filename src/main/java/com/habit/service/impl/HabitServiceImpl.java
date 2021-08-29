package com.habit.service.impl;

import com.habit.domain.Habit;
import com.habit.repository.HabitRepository;
import com.habit.repository.specification.HabitSpecification;
import com.habit.service.HabitService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("habitService")
public class HabitServiceImpl implements HabitService {
    @Resource(name="habitRepository")
    HabitRepository habitRepository;

    @Override
    public List<Habit> getList(Habit habit) {
        Specification<Habit> specLogin = HabitSpecification.equalLoginId(habit.getLogin());
        return habitRepository.findAll(specLogin);
    }
}
