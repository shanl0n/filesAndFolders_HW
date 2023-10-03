package com.codebase.filesandfoldersService.repositories;

import com.codebase.filesandfoldersService.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}