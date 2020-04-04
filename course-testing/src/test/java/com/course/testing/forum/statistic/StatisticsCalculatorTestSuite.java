package com.course.testing.forum.statistic;

import com.course.testing.forum.statistics.Statistics;
import com.course.testing.forum.statistics.StatisticsCalculator;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    @Test
    public void testCalculateAdvStatistics(){

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
        int param4 = statisticsCalculator.getAvPostsPerUser();
        int param5 = statisticsCalculator.getAvCommentsPerUser();
        int param6 = statisticsCalculator.getAvCommentsPerPost();
        
        assertEquals(0, param1);
        assertEquals(0, param2);
        assertEquals(0, param3);
        assertEquals(0, param4);
        assertEquals(0, param5);
        assertEquals(0, param6);

    }

}
