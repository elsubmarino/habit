package com.habit.repository;

import com.habit.domain.Folder;
import com.habit.domain.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository  extends JpaRepository<Folder, Long>, JpaSpecificationExecutor<Folder> {

}
