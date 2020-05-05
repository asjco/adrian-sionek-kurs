package com.course.patterns.prototype.library;

import com.course.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
   private String name;
   private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String n = "Library name: " + name + "\n";
        for (Book book : books) {
            n = n + book.toString();
        }
        return n;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepLibrary = (Library) super.clone();
        deepLibrary.books = new HashSet<>();
        for (Book book : books) {
            deepLibrary.getBooks().add(book);
        }
        return deepLibrary;
    }
}
