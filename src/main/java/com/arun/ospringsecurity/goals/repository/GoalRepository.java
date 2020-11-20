package com.arun.ospringsecurity.goals.repository;

import com.arun.ospringsecurity.goals.entity.Goal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author arun on 11/19/20
 */

@Repository
public interface GoalRepository extends CrudRepository<Goal, UUID> {
}
