package com.karome.homework13.model;

public class Car {
    private String carName;
    private String releaseYear;
    private String maxSpeed;
    private int carPicture;

    public Car(String carName, String releaseYear, String maxSpeed, int carPicture) {
        this.carName = carName;
        this.releaseYear = releaseYear;
        this.maxSpeed = maxSpeed;
        this.carPicture = carPicture;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCarPicture() {
        return carPicture;
    }

    public void setCarPicture(int carPicture) {
        this.carPicture = carPicture;
    }
}
