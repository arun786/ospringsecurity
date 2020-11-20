package com.arun.ospringsecurity.goals.bootstrap;

import com.arun.ospringsecurity.goals.entity.Goal;
import com.arun.ospringsecurity.goals.repository.GoalRepository;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author arun on 11/19/20
 */

@Component
public class GoalBootStrap implements SmartInitializingSingleton {

    private GoalRepository goals;

    @Autowired
    public GoalBootStrap(GoalRepository goals) {
        this.goals = goals;
    }

    @Override
    public void afterSingletonsInstantiated() {

        Goal goal = new Goal().setId(UUID.randomUUID()).setText("Read War and Peace").setOwner("user");
        goals.save(goal);
        goal = new Goal().setId(UUID.randomUUID()).setText("Free Solo the Eiffel Tower").setOwner("arun");
        goals.save(goal);
        goal = new Goal().setId(UUID.randomUUID()).setText("Hang Christmas Lights").setOwner("user");
        goals.save(goal);
        goal = new Goal().setId(UUID.randomUUID()).setText("March to the Beat of My Own Drum").setOwner("user");
        goals.save(goal);
    }
}
