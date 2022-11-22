package com.sparta;

import java.math.BigDecimal;
import java.math.BigInteger;

public enum Planets {
    EARTH("Earth", new BigInteger("93_000_000"), BigDecimal.valueOf(5.9736 * Math.pow(10.0, 24.0)), 1, "Blue"),
    JUPITER("Jupiter", new BigInteger("484_000_000"), BigDecimal.valueOf(1.8986 * Math.pow(10.0, 27.0)), 80, "Brown"),
    SATURN("Saturn", new BigInteger("889_000_000"), BigDecimal.valueOf(5.68466 * Math.pow(10.0, 26.0)), 83, "Golden"),
    MERCURY("Mercury", new BigInteger("35_000_000"), BigDecimal.valueOf(3.3032 * Math.pow(10.0, 23.0)), 0, "Grey"),
    MARS("Mars", new BigInteger("142_000_000"), BigDecimal.valueOf(6.4185 * Math.pow(10.0, 23.0)), 2, "Red"),
    VENUS("Venus", new BigInteger("67_000_000"), BigDecimal.valueOf(4.8685 * Math.pow(10.0, 24.0)), 0, "Brown"),
    URANUS("Uranus", new BigInteger("1790_000_000"), BigDecimal.valueOf(8.6810 * Math.pow(10.0, 25.0)), 27, "Blue"),
    NEPTUNE("Neptune", new BigInteger("2880_000_000"), BigDecimal.valueOf(10.243 * Math.pow(10.0, 25.0)), 14, "Blue"),
    PLUTO("Pluto", new BigInteger("1_300_000"), BigDecimal.valueOf(1.25 * Math.pow(10.0, 22.0)), 4, "Brown");

    private final String name;
    private final BigInteger averageDistanceFromSun;
    private final BigDecimal mass;
    private final int numberOfMoons;
    private final String color;

    Planets(String name, BigInteger averageDistanceFromSun, BigDecimal mass, int numberOfMoons, String color) {
        this.name = name;
        this.averageDistanceFromSun = averageDistanceFromSun;
        this.mass = mass;
        this.numberOfMoons = numberOfMoons;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public BigInteger getAverageDistanceFromSun() {
        return averageDistanceFromSun;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public int getNumberOfMoons() { return numberOfMoons; }

    public String getColor() {return color;}
}
