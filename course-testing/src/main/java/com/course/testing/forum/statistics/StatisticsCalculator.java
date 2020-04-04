package com.course.testing.forum.statistics;

public class StatisticsCalculator {

     Statistics statistics;
     int usersQuantity;
     int postsQuantity;
     int commentsQuantity;
     int avPostsPerUser;
     int avCommentsPerUser;
     int avCommentsPerPost;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){

        usersQuantity = statistics.usersNames().size();

        postsQuantity = statistics.postsCount();

        commentsQuantity = statistics.commentsCount();

        avPostsPerUser = statistics.postsCount()/statistics.usersNames().size();

        avCommentsPerUser = statistics.commentsCount()/statistics.usersNames().size();

        avCommentsPerPost = statistics.commentsCount()/statistics.postsCount();
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public int getAvPostsPerUser() {
        return avPostsPerUser;
    }

    public int getAvCommentsPerUser() {
        return avCommentsPerUser;
    }

    public int getAvCommentsPerPost() {
        return avCommentsPerPost;
    }



}
