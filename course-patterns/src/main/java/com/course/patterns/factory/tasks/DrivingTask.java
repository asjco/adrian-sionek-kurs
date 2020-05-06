package com.course.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }


    @Override
    public String executeTask() {
        return "Task: " + taskName + ", drive to " + where + " by using " + using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (taskName != null && where != null && using != null) {
            return true;
        } else {
            return false;
        }
    }
}
