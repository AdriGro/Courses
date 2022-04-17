package com.company.Training;

public class Triangle extends Figure{

    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;
    protected double halfperimeter;
    protected double radiusOfRound;

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public void setRadiusOfRound(double radiusOfRound) {
        this.radiusOfRound = radiusOfRound;
    }

    Triangle () {
    }

    @Override
    public double getSquare() {
        halfperimeter = (firstSide + secondSide + thirdSide)/2;
        return radiusOfRound * halfperimeter;
    }
}
