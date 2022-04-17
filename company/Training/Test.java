package com.company.Training;

public class Test {
    public static void main(String[] args) {

        Square sqr1 = new Square();
        sqr1.setSquareSide(4);
        double square = sqr1.getSquare();
        System.out.println(square);

        Circle circ = new Circle();
        circ.setRadiusOfCircle(5.61);
        double square1 = circ.getSquare();
        System.out.println(square1);

        Triangle tr = new Triangle();
        tr.setFirstSide(5.3);
        tr.setSecondSide(6.7);
        tr.setThirdSide(4);
        tr.setRadiusOfRound(2);
        double square3 = tr.getSquare();
        System.out.println(square3);



    }
}
