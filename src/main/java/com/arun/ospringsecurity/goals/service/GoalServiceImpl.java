package com.arun.ospringsecurity.goals.service;

import com.arun.ospringsecurity.goals.entity.Goal;
import com.arun.ospringsecurity.goals.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author arun on 11/20/20
 */

@Service
public class GoalServiceImpl implements GoalService {
    GoalRepository goalRepository;

    @Autowired
    public GoalServiceImpl(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    @Override
    public Iterable<Goal> read() {
        return goalRepository.findAll();
    }
}
