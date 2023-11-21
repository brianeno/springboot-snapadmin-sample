package com.brianeno.sample.repository;

import com.brianeno.sample.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

  List<Project> findByManagerId(Long id);
}
