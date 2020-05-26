package com.course.hibernate.tasklist.dao;

import com.course.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: example";
    private static final String LIST1 = "List #1";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LIST1, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readList.size());

        //CleanUp
        int id = readList.get(0).getId();
        taskListDao.deleteById(id);


    }
}
