package com.company.figures;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] xy = {x,y};
        return xy;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public double distance(int x,int y){
        return Math.sqrt(Math.pow((this.x - x),2)+Math.pow((this.y - y),2));
    }

    public double distance(MyPoint another){
        return distance(another.getX(),another.getY());
    }

    public double distance(){
        return distance(0,0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return x == myPoint.x &&
                y == myPoint.y;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + x;
        result = 31*result + y;

        return result;
    }
}
