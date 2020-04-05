package com.course.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<Book>();
        for(int n=1; n<=booksQuantity; n++){
            Book theBook = new Book("title "+n, "author "+n, 1970+n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void listBooksWithConditionReturnList(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);

        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }
    @Test
    public void listBooksWithConditionMoreThan20(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any Title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }
    @Test
    public void listBooksWithConditionFragmentShorterThan3(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void listBooksInHandsOfAnyBook(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> bookList = new ArrayList<>();

        LibraryUser user1 = new LibraryUser("Name 1", "LastName 1", "pesel 1");

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(bookList);

        //When
        List<Book> theListOfAnyBook = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(0, theListOfAnyBook.size());

    }

    @Test
    public void listBooksInHandsOf1Book(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> bookList = generateListOfNBooks(1);

        LibraryUser user1 = new LibraryUser("Name 1", "LastName 1", "pesel 1");

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(bookList);

        //When
        List<Book> theListOfAnyBook = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(1, theListOfAnyBook.size());

    }

    @Test
    public void listBooksInHandsOf5Books(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> bookList = generateListOfNBooks(5);

        LibraryUser user1 = new LibraryUser("Name 1", "LastName 1", "pesel 1");

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(bookList);

        //When
        List<Book> theListOfAnyBook = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(5, theListOfAnyBook.size());

    }
}
