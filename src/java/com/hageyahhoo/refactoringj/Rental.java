package com.hageyahhoo.refactoringj;

public class Rental {

    private Movie _movie;
    private int   _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie      = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }


    // Extract Method & Introduce Explaining Variable & Move Method
    public double getCharge() {
        double result = 0;

        switch (this.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (this.getDaysRented() > 2) {
                    result += (this.getDaysRented() - 2) * 1.5;
                }
                break;

            case Movie.NEW_RELEASE:
                result += this.getDaysRented() * 3;
                break;

            case Movie.CHILDRENS:
                result += 1.5;
                if (this.getDaysRented() > 3) {
                    result += (this.getDaysRented() - 3) * 1.5;
                }
                break;
        }

        return result;
    }
}
