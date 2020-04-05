package com.course.testing.forum.statistics;

public class StatisticsCalculator {

     Statistics statistics;
     int usersQuantity;
     int postsQuantity;
     int commentsQuantity;
     double avPostsPerUser;
     double avCommentsPerUser;
     double avCommentsPerPost;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){


        usersQuantity = statistics.usersNames().size();

        postsQuantity = statistics.postsCount();

        commentsQuantity = statistics.commentsCount();

        if(statistics.usersNames().size() > 0) {
            avPostsPerUser = 1.0 * statistics.postsCount() / statistics.usersNames().size();
        }

        if(statistics.usersNames().size() > 0) {
            avCommentsPerUser = 1.0 * statistics.commentsCount() / statistics.usersNames().size();
        }

        if(statistics.postsCount() > 0) {
            avCommentsPerPost = 1.0 * statistics.commentsCount() / statistics.postsCount();
        }

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

    public double getAvPostsPerUser() {
        return avPostsPerUser;
    }

    public double getAvCommentsPerUser() {
        return avCommentsPerUser;
    }

    public double getAvCommentsPerPost() {
        return avCommentsPerPost;
    }



}
