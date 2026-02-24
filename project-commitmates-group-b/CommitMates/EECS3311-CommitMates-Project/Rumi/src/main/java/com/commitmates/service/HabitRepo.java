package com.commitmates.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.commitmates.model.Habit;

public interface HabitRepo extends JpaRepository<Habit, Long> {
}