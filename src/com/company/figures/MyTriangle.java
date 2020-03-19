package com.company.figures;

import java.math.BigDecimal;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this(new MyPoint(x1,y1),new MyPoint(x2,y2),new MyPoint(x3,y3));
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }

    public double getPerimeter(){
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType(){
        //Double.compare() or BigDecimal.compareTo() or like as Math.abs(d1-d2) <= 0.000001 ???
        BigDecimal edge1 = new BigDecimal(v1.distance(v2));
        BigDecimal edge2 = new BigDecimal(v2.distance(v3));
        BigDecimal edge3 = new BigDecimal(v3.distance(v1));

        /*if(e1 == e2 && e1 == e3)
            return "Equilateral";
        if (e1 == e2 || e2 == e3 || e3 == e1)
            return "Isosceles";
        else
            return "Scalene";*/

        if(edge1.compareTo(edge2) == 0 && edge1.compareTo(edge3) == 0){
            return TriangleTypes.Equilateral.toString();
        }
        if(edge1.compareTo(edge2) == 0 || edge2.compareTo(edge3) == 0 || edge3.compareTo(edge1) == 0){
            return TriangleTypes.Isosceles.toString();
        } else {
            return TriangleTypes.Scalene.toString();
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTriangle triangle = (MyTriangle) o;
        return v1.equals(triangle.v1) &&
                v2.equals(triangle.v2) &&
                v3.equals(triangle.v3);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + v1.hashCode();
        result = 31 * result + v2.hashCode();
        result = 31 * result + v3.hashCode();

        return result;
    }

    private enum TriangleTypes{
        Equilateral("Equilateral"),Isosceles("Isosceles"),Scalene("Scalene");

        private String name;
        TriangleTypes(String s){
            this.name = s;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
