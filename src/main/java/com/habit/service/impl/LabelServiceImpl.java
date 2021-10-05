package com.habit.service.impl;

import com.habit.domain.Label;
import com.habit.repository.LabelRepository;
import com.habit.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("labelService")
public class LabelServiceImpl implements LabelService {
    @Resource(name="labelRepository")
    LabelRepository labelRepository;

    @Override
    public Label add(Label label) {
        return labelRepository.save(label);
    }
}
