package com.course.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Original library");

        LocalDate actDate = LocalDate.now();
        Book book1 = new Book("title 1", "author 1", actDate.minusYears(5));
        Book book2 = new Book("title 2", "author 2", actDate.minusYears(2));
        Book book3 = new Book("title 3", "author 3", actDate.minusYears(1));
        Book book4 = new Book("title 4", "author 4", actDate.minusYears(4));
        Book book5 = new Book("title 5", "author 5", actDate.minusYears(8));
        Book book6 = new Book("title 6", "author 6", actDate.minusYears(11));
        Book book7 = new Book("title 7", "author 7", actDate.minusYears(5));
        Book book8 = new Book("title 8", "author 8", actDate.minusYears(15));
        Book book9 = new Book("title 9", "author 9", actDate.minusYears(3));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);
        library.getBooks().add(book7);
        library.getBooks().add(book8);
        library.getBooks().add(book9);

        Library shallowCopy = null;
        try {
            shallowCopy = library.shallowCopy();
            shallowCopy.setName("shallow copy of library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopy = null;
        try {
            deepCopy = library.deepCopy();
            deepCopy.setName("deep copy of library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3);
        library.getBooks().remove(book6);

        //Then
        System.out.println(library);
        System.out.println(shallowCopy);
        System.out.println(deepCopy);
        Assert.assertEquals(7, library.getBooks().size());
        Assert.assertEquals(7, shallowCopy.getBooks().size());
        Assert.assertEquals(9, deepCopy.getBooks().size());
        Assert.assertEquals(library.getBooks(), shallowCopy.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepCopy.getBooks());
    }

}
