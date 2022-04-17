package com.company.Training;

public class Circle extends Figure{

    private double pi = 3.14;
    protected double radiusOfCircle;

    public double getRadiusOfCircle() {
        return radiusOfCircle;
    }

    public void setRadiusOfCircle(double radiusOfCircle) {
        this.radiusOfCircle = radiusOfCircle;
    }

    Circle () {
    }

    @Override
    public double getSquare() {
        return pi * Math.pow(radiusOfCircle, 2);
    }
}
