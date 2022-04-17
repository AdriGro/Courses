package com.company.Training;

public class Square extends Figure{

    private double squareSide;

    public void setSquareSide(int squareSide) {
        this.squareSide = squareSide;
    }

    Square () {

    }

    @Override
    public double getSquare() {
        return Math.pow(squareSide, 2);
    }

}
