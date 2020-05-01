package com.course.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("task1")
    TaskList tasks1;

    @Autowired
    @Qualifier("task2")
    TaskList tasks2;

    @Autowired
    @Qualifier("task3")
    TaskList tasks3;


    @Bean
    public Board getBoard() {
        return new Board(tasks1, tasks2, tasks3);
    }

    @Bean("task1")
    @Scope("prototype")
    public TaskList createToDoList() {
        return new TaskList();
    }

    @Bean("task2")
    @Scope("prototype")
    public TaskList createInProgressList() {
        return new TaskList();
    }

    @Bean("task3")
    @Scope("prototype")
    public TaskList createDoneList() {
        return new TaskList();
    }
}
