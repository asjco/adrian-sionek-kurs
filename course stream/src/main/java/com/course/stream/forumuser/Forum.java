package com.course.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1, "user1", 'M', 1990, 12, 3, 110));
        userList.add(new ForumUser(2, "user2", 'M', 1995, 4, 11, 10));
        userList.add(new ForumUser(3, "user3", 'F', 2000, 1, 4, 64));
        userList.add(new ForumUser(4, "user4", 'M', 1989, 6, 22, 0));
        userList.add(new ForumUser(5, "user5", 'F', 2003, 2, 12, 2));
        userList.add(new ForumUser(6, "user6", 'F', 1999, 2, 5, 42));
        userList.add(new ForumUser(7, "user7", 'M', 1969, 8, 7, 11));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
