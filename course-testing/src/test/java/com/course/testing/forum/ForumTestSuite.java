package com.course.testing.forum;

import com.course.testing.user.SimpleUser;
import org.junit.*;


public class ForumTestSuite {
   @Before
   public void before(){
      System.out.println("Test Case: begin");
   }
   @After
   public void after(){
      System.out.println("Test Case: end");
   }
   @BeforeClass
   public static void beforeClass(){
      System.out.println("Test Suite: begin");
   }
   @AfterClass
   public static void afterClass(){
      System.out.println("Test Suite: end");
   }

   @Test
   public void testCaseRealName(){
      //given
      SimpleUser simpleUser = new SimpleUser("ziomek", "Andrzej");
      //when
      String result = simpleUser.getRealName();
      System.out.println("Testing"+result);
      //then
      Assert.assertEquals("Andrzej", result);

   }
   @Test
   public void testCaseUsername(){
      //given
      SimpleUser simpleUser = new SimpleUser("ziomek", "Andrzej");
      //when
      String result = simpleUser.getUsername();
      System.out.println("Testing"+result);
      //then
      Assert.assertEquals("ziomek", result);

   }

}
