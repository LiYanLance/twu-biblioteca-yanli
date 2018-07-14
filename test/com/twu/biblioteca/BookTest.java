package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BookTest {

    private Book book;

    @Before
    public void setUp() throws Exception {
        this.book = new Book("Book1", "Author1", 2015);
    }

    @Test
    public void should_book_have_author_and_published_year(){
        assertThat(true, is("Author1".equals(book.getAuthor())));
        assertThat(true, is(2015 == book.getPublishedYear()));
    }
}
