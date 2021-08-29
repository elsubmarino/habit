package com.habit.service.impl;

import com.habit.domain.Folder;
import com.habit.repository.FolderRepository;
import com.habit.repository.specification.FolderSpecification;
import com.habit.service.FolderService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service("folderService")
public class FolderServiceImpl implements FolderService {
    @Resource(name="folderRepository")
    FolderRepository folderRepository;

    @Override
    public Folder create(Folder folder) {
        folder.setDeleteYn('N');
        folder.setRegistrationDateTime(LocalDateTime.now());
        folder.setModificationDateTime(LocalDateTime.now());
        return folderRepository.save(folder);
    }

    @Override
    public void delete(Folder folder) {
        folderRepository.delete(folder);
    }

    @Override
    public List<Folder> list(Folder folder) {
        Specification<Folder> loginId = FolderSpecification.equalLoginId(folder);
        return folderRepository.findAll(loginId);
    }
}
