package com.company;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

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
        double e1 = v1.distance(v2);
        double e2 = v2.distance(v3);
        double e3 = v3.distance(v1);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        if(e1 == e2 && e1 == e3)
            return "Equilateral";
        if (e1 == e2 || e2 == e3 || e3 == e1)
            return "Isosceles";
        else
            return "Scalene";
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
}
