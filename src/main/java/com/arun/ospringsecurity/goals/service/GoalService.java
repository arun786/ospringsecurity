package com.arun.ospringsecurity.goals.service;

import com.arun.ospringsecurity.goals.entity.Goal;

/**
 * @author arun on 11/20/20
 */

public interface GoalService {

    Iterable<Goal> read();

}
