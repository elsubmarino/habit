package com.habit.service;

import com.habit.domain.Folder;

import java.util.List;

public interface FolderService {
    Folder create(Folder folder);
    void delete(Folder folder);
    List<Folder> list(Folder folder);
}
