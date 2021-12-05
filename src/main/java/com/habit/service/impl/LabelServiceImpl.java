package com.habit.service.impl;

import com.habit.domain.Habit;
import com.habit.domain.Label;
import com.habit.domain.Login;
import com.habit.repository.LabelRepository;
import com.habit.repository.specification.LabelSpecification;
import com.habit.service.LabelService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("labelService")
public class LabelServiceImpl implements LabelService {
    @Resource(name="labelRepository")
    LabelRepository labelRepository;

    @Override
    public Label add(Label label) {
        return labelRepository.save(label);
    }

    @Override
    public List<Label> listAll(Habit habit) {
        Specification<Label> specLoginId = LabelSpecification.equalLoginId(habit);
        return labelRepository.findAll(specLoginId);
    }
}
