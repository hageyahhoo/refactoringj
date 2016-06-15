package com.hageyahhoo.refactoringj;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RentalTest {

    @Test
    public void getters() {
        Movie  movie = new Movie("a", 1);
        Rental sut   = new Rental(movie, 2);

        // FIXME equals() を定義していないが、これで大丈夫か？
        assertThat(sut.getMovie(),      is(movie));
        assertThat(sut.getDaysRented(), is(2));
    }
}
