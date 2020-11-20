package com.arun.ospringsecurity.goals.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author arun on 11/19/20
 */

@Entity
@Getter
@Setter
public class Goal {
    @Id
    private UUID id;

    @Column
    private String text;

    @Column
    private String owner;

    @Column(nullable = false)
    private Boolean completed = false;
}
