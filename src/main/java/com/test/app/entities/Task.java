package com.test.app.entities;
import com.test.app.enums.TaskStatus;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Task {
    @Id
    private String id;
    private String description;
    private TaskStatus status;
    @ManyToOne
    private User assignedUser;
}
