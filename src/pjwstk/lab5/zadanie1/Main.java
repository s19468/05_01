/*
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab5.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1,1);
        MyPoint point2 = new MyPoint(2,2);
        MyPoint point3 = new MyPoint(3,3);
        MyPoint point4 = new MyPoint(4,4);
        MyPoint point5 = new MyPoint(5,5);
        MyPoint point6 = new MyPoint(6,6);
        MyPoint point7 = new MyPoint(7,7);
        MyPoint point8 = new MyPoint(8,8);
        MyPoint point9 = new MyPoint(9,9);
        MyPoint point10 = new MyPoint(10,10);

        List<MyPoint> points = new ArrayList<>();

        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.add(point5);
        points.add(point6);
        points.add(point7);
        points.add(point8);
        points.add(point9);
        points.add(point10);

        for(MyPoint point : points) {
            System.out.println(point.toString());
        }
    }
}
