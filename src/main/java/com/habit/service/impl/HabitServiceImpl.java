package com.habit.service.impl;

import com.habit.domain.Folder;
import com.habit.domain.Habit;
import com.habit.repository.HabitRepository;
import com.habit.repository.specification.HabitSpecification;
import com.habit.service.HabitService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service("habitService")
public class HabitServiceImpl implements HabitService {
    @Resource(name="habitRepository")
    HabitRepository habitRepository;

    @Override
    public Page<Habit> getList(Habit habit) {
        Specification<Habit> specLogin = HabitSpecification.equalLoginId(habit);
        Pageable pageable = PageRequest.of(0,10,Sort.Direction.DESC,"modificationDateTime");
        Page<Habit> pageList = habitRepository.findAll(specLogin,pageable);
        return pageList;
    }

    @Override
    public Habit create(Habit habit) {
        habit.setCompleteYn('N');
        habit.setDeleteYn('N');
        habit.setModificationDateTime(LocalDateTime.now());
        habit.setRegistrationDateTime(LocalDateTime.now());
        return habitRepository.save(habit);
    }

    @Override
    public void delete(Habit habit) {
        habitRepository.delete(habit);
    }
}
