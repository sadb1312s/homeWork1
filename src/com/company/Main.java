package com.company;

import com.company.figures.Circle;
import com.company.figures.MyPoint;
import com.company.figures.MyTriangle;
import com.company.figures.Rectangle;
import com.company.goods.Book;
import com.company.people.Author;
import com.company.people.Employee;

public class Main {

    public static void main(String[] args) {
        System.out.println("Circle test");
        Circle c = new Circle(10);
        System.out.println(c.toString());
        System.out.println(c);
        System.out.println();

        System.out.println("Rectangle test");
        Rectangle r = new Rectangle(10,35);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r);
        System.out.println();

        System.out.println("Employee test");
        Employee Vasya = new Employee(1,"Василий","Иванович",1000);
        System.out.println(Vasya);
        System.out.println(Vasya.raiseSalary(10));
        System.out.println(Vasya);
        System.out.println();

        System.out.println("Book test");
        Author a1 = new Author("М.Горький","123@123",'m');
        Author a2 = new Author("К.Хорстманн","321@321",'m');
        Author[] a = new Author[2];
        a[0] = a1;
        a[1] = a2;
        Book b = new Book("Kniga",a,100,2);
        System.out.println(b);
        System.out.println(b.getAuthorNames());

        System.out.println("book equals test");

        Author a3 = new Author("М.Горький","123@123",'m');
        Author a4 = new Author("К.Хорстманн","321@321",'m');
        Author[] aa = new Author[2];
        aa[0] = a4;
        aa[1] = a3;
        Book book2 = new Book("Kniga",aa,100,2);

        System.out.println(b.equals(book2));
        System.out.println();

        System.out.println("MyPoint test");
        MyPoint p1 = new MyPoint(3,4);
        MyPoint p2 = new MyPoint(21,2);
        System.out.println(p1);
        System.out.println(p1.distance(-31,777));
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());

        System.out.println("MyTriangle test");
        MyTriangle triangle = new MyTriangle(0,0,5,5,5,0);
        MyTriangle triangle2 = new MyTriangle(0,0,5,5,5,1);
        System.out.println("hash and equals test");
        System.out.println(triangle.hashCode());
        System.out.println(triangle2.hashCode());
        System.out.println(triangle.equals(triangle2));

        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());



    }
}
