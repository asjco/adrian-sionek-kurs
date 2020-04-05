package com.course.testing.forum.statistic;

import com.course.testing.forum.statistics.Statistics;
import com.course.testing.forum.statistics.StatisticsCalculator;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is the beginning of tests. ");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("All tests are finished. ");
    }

    @Before
    public void beforeTest(){
        testCounter++;
        System.out.println("Test numer # "+testCounter);
    }


    @Test //0 users, 0 posts, 0 comments
    public void testCalculateAdvStatistics1(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);


        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //then
        int param1 = statisticsCalculator.getUsersQuantity();
        int param2 = statisticsCalculator.getPostsQuantity();
        int param3 = statisticsCalculator.getCommentsQuantity();
        double param4 = statisticsCalculator.getAvPostsPerUser();
        double param5 = statisticsCalculator.getAvCommentsPerUser();
        double param6 = statisticsCalculator.getAvCommentsPerPost();

        assertEquals(0, param1);
        assertEquals(0, param2);
        assertEquals(0, param3);
        assertEquals(0, param4, 0);
        assertEquals(0, param5, 0);
        assertEquals(0, param6, 0);

    }

    @Test //100 users, 0 posts, 0 comments
    public void testCalculateAdvStatistics2(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> list = new ArrayList<String>();
        for(int i=0; i<100; i++){
            list.add(""+i);
        }

        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);


        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //then
        int param1 = statisticsCalculator.getUsersQuantity();
        int param2 = statisticsCalculator.getPostsQuantity();
        int param3 = statisticsCalculator.getCommentsQuantity();
        double param4 = statisticsCalculator.getAvPostsPerUser();
        double param5 = statisticsCalculator.getAvCommentsPerUser();
        double param6 = statisticsCalculator.getAvCommentsPerPost();

        assertEquals(100, param1);
        assertEquals(0, param2);
        assertEquals(0, param3);
        assertEquals(0, param4, 0);
        assertEquals(0, param5, 0);
        assertEquals(0, param6, 0);

    }

    @Test //100 users, 1000 posts, 0 comments
    public void testCalculateAdvStatistics3(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> list = new ArrayList<String>();
        for(int i=0; i<100; i++){
            list.add(""+i);
        }

        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);


        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //then
        int param1 = statisticsCalculator.getUsersQuantity();
        int param2 = statisticsCalculator.getPostsQuantity();
        int param3 = statisticsCalculator.getCommentsQuantity();
        double param4 = statisticsCalculator.getAvPostsPerUser();
        double param5 = statisticsCalculator.getAvCommentsPerUser();
        double param6 = statisticsCalculator.getAvCommentsPerPost();

        assertEquals(100, param1);
        assertEquals(1000, param2);
        assertEquals(0, param3);
        assertEquals(10, param4, 0);
        assertEquals(0, param5, 0);
        assertEquals(0, param6, 0);

    }

    @Test //100 users, 1000 posts, 200 comments
    public void testCalculateAdvStatistics4(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> list = new ArrayList<String>();
        for(int i=0; i<100; i++){
            list.add(""+i);
        }

        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(200);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);


        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //then
        int param1 = statisticsCalculator.getUsersQuantity();
        int param2 = statisticsCalculator.getPostsQuantity();
        int param3 = statisticsCalculator.getCommentsQuantity();
        double param4 = statisticsCalculator.getAvPostsPerUser();
        double param5 = statisticsCalculator.getAvCommentsPerUser();
        double param6 = statisticsCalculator.getAvCommentsPerPost();

        assertEquals(100, param1);
        assertEquals(1000, param2);
        assertEquals(200, param3);
        assertEquals(10, param4, 0);
        assertEquals(2, param5, 0);
        assertEquals(0.2, param6, 0);

    }

    @Test //100 users, 1000 posts, 1200 comments
    public void testCalculateAdvStatistics5(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> list = new ArrayList<String>();
        for(int i=0; i<100; i++){
            list.add(""+i);
        }

        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1200);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);


        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //then
        int param1 = statisticsCalculator.getUsersQuantity();
        int param2 = statisticsCalculator.getPostsQuantity();
        int param3 = statisticsCalculator.getCommentsQuantity();
        double param4 = statisticsCalculator.getAvPostsPerUser();
        double param5 = statisticsCalculator.getAvCommentsPerUser();
        double param6 = statisticsCalculator.getAvCommentsPerPost();

        assertEquals(100, param1);
        assertEquals(1000, param2);
        assertEquals(1200, param3);
        assertEquals(10, param4, 0);
        assertEquals(12, param5, 0);
        assertEquals(1.2, param6, 0);

    }

    @Test //0 users, 1000 posts, 0 comments
    public void testCalculateAdvStatistics6(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);


        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //then
        int param1 = statisticsCalculator.getUsersQuantity();
        int param2 = statisticsCalculator.getPostsQuantity();
        int param3 = statisticsCalculator.getCommentsQuantity();
        double param4 = statisticsCalculator.getAvPostsPerUser();
        double param5 = statisticsCalculator.getAvCommentsPerUser();
        double param6 = statisticsCalculator.getAvCommentsPerPost();

        assertEquals(0, param1);
        assertEquals(1000, param2);
        assertEquals(0, param3);
        assertEquals(0, param4, 0);
        assertEquals(0, param5, 0);
        assertEquals(0, param6, 0);

    }

    @Test //0 users, 1000 posts, 200 comments
    public void testCalculateAdvStatistics7(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(200);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);


        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //then
        int param1 = statisticsCalculator.getUsersQuantity();
        int param2 = statisticsCalculator.getPostsQuantity();
        int param3 = statisticsCalculator.getCommentsQuantity();
        double param4 = statisticsCalculator.getAvPostsPerUser();
        double param5 = statisticsCalculator.getAvCommentsPerUser();
        double param6 = statisticsCalculator.getAvCommentsPerPost();

        assertEquals(0, param1);
        assertEquals(1000, param2);
        assertEquals(200, param3);
        assertEquals(0, param4, 0);
        assertEquals(0, param5, 0);
        assertEquals(0.2, param6, 0);

    }

    @Test //0 users, 1000 posts, 1200 comments
    public void testCalculateAdvStatistics8(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1200);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);


        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //then
        int param1 = statisticsCalculator.getUsersQuantity();
        int param2 = statisticsCalculator.getPostsQuantity();
        int param3 = statisticsCalculator.getCommentsQuantity();
        double param4 = statisticsCalculator.getAvPostsPerUser();
        double param5 = statisticsCalculator.getAvCommentsPerUser();
        double param6 = statisticsCalculator.getAvCommentsPerPost();

        assertEquals(0, param1);
        assertEquals(1000, param2);
        assertEquals(1200, param3);
        assertEquals(0, param4, 0);
        assertEquals(0, param5, 0);
        assertEquals(1.2, param6, 0);

    }
}
