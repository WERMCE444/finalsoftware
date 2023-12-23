package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReviewsAndRating {
    private static List<Review> reviews = new ArrayList<>();

    public static void leaveReviewsAndRatings(String customer, String comment) {
        Review review = new Review(customer, comment);
        reviews.add(review);
    }

    public static void viewMultiReview() {
        System.out.println("Product Reviews:");

        for (Review review : reviews) {
            System.out.println("Customer: " + review.getCustomer());
            System.out.println("Comment: " + review.getComment());
            System.out.println();
        }
    }
}

class Review {
    private String customer;
    private String comment;

    public Review(String customer, String comment) {
        this.customer = customer;
        this.comment = comment;
    }

    public String getCustomer() {
        return customer;
    }

    public String getComment() {
        return comment;
    }
}


