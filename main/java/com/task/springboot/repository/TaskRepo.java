package com.task.springboot.repository;

import com.task.springboot.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Long> {

}
