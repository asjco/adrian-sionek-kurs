package com.course.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("XoXo");
        User user2 = new YGeneration("BigBen");
        User user3 = new ZGeneration("Andrew");

        //When
        String user1Strategy = user1.sharePost();
        System.out.println("Xoxo default is: " + user1Strategy);
        String user2Strategy = user2.sharePost();
        System.out.println("BigBen default is: " + user2Strategy);
        String user3Strategy = user3.sharePost();
        System.out.println("Andrew default is: " + user3Strategy);

        //Then
        Assert.assertEquals("Snapchat media", user1Strategy);
        Assert.assertEquals("Twitter media", user2Strategy);
        Assert.assertEquals("Facebook media", user3Strategy);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user2 = new YGeneration("BigBen");

        //When
        String user2Strategy = user2.sharePost();
        System.out.println("BigBen default is: " + user2Strategy);
        user2.setIndividualSocialMedia(new SnapchatPublisher());
        user2Strategy = user2.sharePost();
        System.out.println("BigBen new strategy is: " + user2Strategy);

        //Then
        Assert.assertEquals("Snapchat media", user2Strategy);


    }
}
