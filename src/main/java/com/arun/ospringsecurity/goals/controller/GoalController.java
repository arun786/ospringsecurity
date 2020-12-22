package com.arun.ospringsecurity.goals.controller;

import com.arun.ospringsecurity.goals.entity.Goal;
import com.arun.ospringsecurity.goals.service.GoalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arun on 11/20/20
 */

@RestController
public class GoalController {
    private GoalService goalService;

    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @GetMapping("/goals/read")
    public Iterable<Goal> read() {
        //just to check if everything is working fine
        return goalService.read();
    }
}
