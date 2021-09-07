package com.Maktab;

public class Person {
    Trip trip = new Trip();
    private double price;
    public Person(int city1, int city2, int machine, int weather) {
        trip.setOrigin(city1);
        trip.setDestination(city2);
        price=getPrice(machine, weather);
    }

    private double getPrice(int machine, int weather) {
        return trip.tripMethod(weather-1, machine-1) * trip.getTripPrice()[trip.getOrigin().getCityNumber()][trip.getDestination().getCityNumber()];
    }

    public double getPrice() {
        return price;
    }
}
