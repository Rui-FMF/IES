package com.example.spring.issues.repositories;

import java.util.List;

import com.example.spring.issues.entities.IssueReport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IssueRepository extends JpaRepository<IssueReport, Long>{

    @Query(value = "SELECT i FROM IssueReport i WHERE markedAsPrivate = false") 
    List<IssueReport> findAllButPrivate();

    List<IssueReport> findAllByEmail(String email);
}