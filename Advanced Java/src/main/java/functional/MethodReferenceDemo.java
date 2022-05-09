package functional;

import misc.Shapes;
import misc.Square;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        Square square = new Square(4);

        Shapes shape = (Square s)->{return s.area();};

        System.out.println("Area :" + shape.gerArea(square));

        //Using Method reference
        Shapes shape2 = Square::area;

        System.out.println("Area :" + shape2.gerArea(square));

    }
}
