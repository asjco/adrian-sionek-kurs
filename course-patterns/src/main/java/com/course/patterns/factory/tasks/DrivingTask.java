package com.course.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean executed = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }


    @Override
    public String executeTask() {
        if (taskName != null && where != null && using != null) {
            executed = true;
        } else {
           executed = false;
        }
        return "Task: " + taskName + ", drive to " + where + " by using " + using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
