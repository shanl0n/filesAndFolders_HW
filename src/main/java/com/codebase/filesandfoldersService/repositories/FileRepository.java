package com.codebase.filesandfoldersService.repositories;

import com.codebase.filesandfoldersService.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}

