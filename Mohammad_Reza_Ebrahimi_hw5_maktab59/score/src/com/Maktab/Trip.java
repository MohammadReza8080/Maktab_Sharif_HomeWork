package com.Maktab;

public class Trip {
    City origin = new City();
    City destination = new City();

    private int[][] tripPrice = {{1, 2, 3, 4, 3}, {2, 1, 5, 3, 3}, {2, 4, 1, 3, 2}, {4, 2, 3, 1, 2}, {3, 3, 2, 2, 1}};
    private int[] tripMachine = {5000, 10000, 4000};
    private double[][] tripWeatherPrice = {{1.4, 3, 1.5}, {1.2, 2, 2}, {1.2, 2, 0, 8}};

    public double tripMethod(int weather, int machine) {
        return tripMachine[machine] * tripWeatherPrice[weather][machine];
    }

    public City getOrigin() {
        return origin;
    }

    public void setOrigin(int number) {
        this.origin.setCityNumber(number);
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(int number) {
        this.destination.setCityNumber(number);
    }

    public int[][] getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int[][] tripPrice) {
        this.tripPrice = tripPrice;
    }
}
