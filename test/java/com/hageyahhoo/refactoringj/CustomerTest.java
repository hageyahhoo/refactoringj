package com.hageyahhoo.refactoringj;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void statement_NoRental() {
        Customer sut = new Customer("statement_NoRental");

        String expected =
                "Rental Record for statement_NoRental\n" +
                "Amount owed is 0.0\n"                   +
                "You earned 0 frequent renter points";
        assertThat(sut.statement(), is(expected));
    }


    @Test
    public void statement_Regular() {
        Customer sut = new Customer("statement_Regular");
        sut.addRental(new Rental(new Movie("a", Movie.REGULAR), 2));
        sut.addRental(new Rental(new Movie("b", Movie.REGULAR), 3));

        String expected =
                "Rental Record for statement_Regular\n" +
                "\ta\t2.0\n"                            +
                "\tb\t3.5\n"                            +
                "Amount owed is 5.5\n"                  +
                "You earned 2 frequent renter points";
        assertThat(sut.statement(), is(expected));
    }


    @Test
    public void statement_NewRelease() {
        Customer sut = new Customer("statement_NewRelease");
        sut.addRental(new Rental(new Movie("a", Movie.NEW_RELEASE), 1));
        sut.addRental(new Rental(new Movie("b", Movie.NEW_RELEASE), 2));

        String expected =
                "Rental Record for statement_NewRelease\n" +
                "\ta\t3.0\n"                               +
                "\tb\t6.0\n"                               +
                "Amount owed is 9.0\n"                     +
                "You earned 3 frequent renter points";
        assertThat(sut.statement(), is(expected));
    }


    @Test
    public void statement_Childrens() {
        Customer sut = new Customer("statement_Childrens");
        sut.addRental(new Rental(new Movie("a", Movie.CHILDRENS), 3));
        sut.addRental(new Rental(new Movie("b", Movie.CHILDRENS), 4));

        String expected =
                "Rental Record for statement_Childrens\n" +
                "\ta\t1.5\n"                              +
                "\tb\t3.0\n"                              +
                "Amount owed is 4.5\n"                    +
                "You earned 2 frequent renter points";
        assertThat(sut.statement(), is(expected));
    }
}
