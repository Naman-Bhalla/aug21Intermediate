package designpatterns.builder;

import java.util.List;

public class Sandwich {
    private int noOfBreads;
    private int noOfOnions;
    private int noOfPickles;
    

    private Sandwich() {}

    public int getNoOfBreads() {
        return noOfBreads;
    }

    public int getNoOfOnions() {
        return noOfOnions;
    }

    public int getNoOfPickles() {
        return noOfPickles;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int noOfBreads;
        private int noOfOnions;
        private int noOfPickles;

        public int getNoOfBreads() {
            return noOfBreads;
        }

        public int getNoOfOnions() {
            return noOfOnions;
        }

        public int getNoOfPickles() {
            return noOfPickles;
        }

        public Builder setNoOfBreads(int noOfBreads) {
            this.noOfBreads = noOfBreads;
            return this;
        }

        public Builder setNoOfOnions(int noOfOnions) {
            this.noOfOnions = noOfOnions;
            return this;
        }

        public Builder setNoOfPickles(int noOfPickles) {
            this.noOfPickles = noOfPickles;
            return this;
        }

        public Sandwich build() {
            if (this.noOfBreads < 0) {
                throw new RuntimeException();
            }
            Sandwich sandwich = new Sandwich();
            sandwich.noOfBreads = this.noOfBreads;
            sandwich.noOfOnions = this.noOfOnions;
            sandwich.noOfPickles = this.noOfPickles;
            return sandwich;
        }
    }
}
