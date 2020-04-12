package com.course.stream;

import com.course.stream.forumuser.Forum;
import com.course.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args){


        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostsQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        resultMap.entrySet().stream()
                .map(entry -> entry.getKey() +": "+ entry.getValue())
                .forEach(System.out::println);


    }



}
