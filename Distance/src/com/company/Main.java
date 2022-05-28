package com.company;

public class Distance {
    private Point p1;
    private Point p2;

    public Distance(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
    }

    public double calcDistance(){
        double uzaklik= Math.sqrt(Math.pow((this.p1.getX()-this.p2.getX()),2)+Math.pow((this.p1.getY()-this.p2.getY()),2));

        return uzaklik;
    }
}