package designpatterns.builder;

public class Client {

    public static void main(String[] args) {
        // Sandwich sandwich = Sandwich.getBuilder()
        //                              .setNoOfBreads(2)
        //                              .setNoOfOnions(3)
        //                              .setNoOfPickles(5)
        //                              .build();

        Sandwich sandwich = Sandwich.getBuilder()
                .setNoOfPickles(2)
                .setNoOfBreads(3)
                .setNoOfOnions(5)
                .build();

        // Sandwich.Builder
    }
}

// Advantages:
// - many attributes OR
// - immutability OR
// - need to validate an object before creating the object
