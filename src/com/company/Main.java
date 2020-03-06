package com.company;

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println(c.toString());
        System.out.println(c);

        Rectangle r = new Rectangle(10,35);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r);

        Employee Vasya = new Employee(1,"Василий","Иванович",1000);
        System.out.println(Vasya);
        System.out.println(Vasya.raiseSalary(34));
        System.out.println(Vasya);

        Author a1 = new Author("М.Горький","123@123",'m');
        Author a2 = new Author("К.Хорстманн","321@321",'m');
        Author[] a = new Author[2];
        a[0] = a1;
        a[1] = a2;
        Book b = new Book("Kniga",a,100,2);
        System.out.println(b);
        System.out.println(b.getAuthorNames());

        MyPoint p1 = new MyPoint(3,4);
        MyPoint p2 = new MyPoint(21,2);
        System.out.println(p1);
        System.out.println(p1.distance(-31,777));
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());

        MyTriangle triangle = new MyTriangle(-6,1,1,3,3,1);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());



    }
}
