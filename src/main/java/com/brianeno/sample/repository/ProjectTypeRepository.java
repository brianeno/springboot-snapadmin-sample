package com.brianeno.sample.repository;

import com.brianeno.sample.entity.ProjectType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectTypeRepository extends JpaRepository<ProjectType, Long> {

}
