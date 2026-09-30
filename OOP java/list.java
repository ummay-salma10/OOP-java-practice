import java.util.LinkedList;
import java.util.ListIterator;

class Rectangle {
    public int length;
    public int width;

    public Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public void Area() {
        System.out.println("Rectangle Area: " + (length * width));
    }

    public void Perimeter() {
        System.out.println("Rectangle Perimeter: " + (2 * (length + width)));
    }
}

class Square {
    public int side;

    public Square(int s) {
        this.side = s;
    }

    public void Area() {
        System.out.println("Square Area: " + (side * side));
    }

    public void Perimeter() {
        System.out.println("Square Perimeter: " + (4 * side));
    }
}

public class list { 
    public static void main(String[] args) {
        // Generics <Object> যোগ করা হয়েছে যেন Unchecked Warning না আসে
        LinkedList<Object> list = new LinkedList<>();

        list.add(new Rectangle(10, 5));
        list.add(new Square(4));
        list.add(new Rectangle(8, 3));

        ListIterator<Object> li = list.listIterator();

        while (li.hasNext()) {
            Object obj = li.next();

            if (obj instanceof Rectangle) {
                
                Rectangle r = (Rectangle) obj;
                r.Area();
                r.Perimeter();
            } else if (obj instanceof Square) {
                Square s = (Square) obj;
                s.Area();
                s.Perimeter();
            }
            System.out.println("-----------------");
        }
    }
}