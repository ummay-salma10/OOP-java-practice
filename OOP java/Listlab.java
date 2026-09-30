import java.util.LinkedList;
import java.util.ListIterator;

class Circle {
    double redius;
    Circle(double r)
    {
        redius = r;
    }
    void calculateArea()
    {
        System.out.println("Area of circle " + (3.1416*redius*redius));
    }
}

class Rectangle {
    double lenght, width;
    Rectangle(double l, double w)
    {
        lenght = l;
        width = w;
    }
    void calculateArea()
    {
        System.out.println("Area of rectangle " + (lenght * width));
    }
}


public class Listlab {
    public static void main(String[] args){

        LinkedList<Object> list = new LinkedList<> ();

        list.add(new Circle(5));
        list.add(new Rectangle(4,5));
        list.add(new Circle(3));
        list.add(new Rectangle(3,4));

       ((Circle) list.get(0)).calculateArea();
       ((Rectangle) list.get(1)).calculateArea();
       ((Circle) list.get(2)).calculateArea();
       ((Rectangle) list.get(3)).calculateArea();
    }
    
}

