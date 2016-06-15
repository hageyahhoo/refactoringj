package com.hageyahhoo.refactoringj;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MovieTest {

    @Test
    public void getters() {
        Movie sut = new Movie("a", 1);

        assertThat(sut.getTitle(),     is("a"));
        assertThat(sut.getPriceCode(), is(1));
    }


    @Test
    public void gettersWithSetter() {
        Movie sut = new Movie("a", 1);
        sut.setPriceCode(2);

        assertThat(sut.getTitle(),     is("a"));
        assertThat(sut.getPriceCode(), is(2));
    }
}
