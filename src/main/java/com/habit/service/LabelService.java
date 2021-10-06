package com.habit.service;

import com.habit.domain.Label;
import com.habit.domain.Login;

import java.util.List;

public interface LabelService {
    Label add(Label label);
    List<Label> listAll(Login login);
}
