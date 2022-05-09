package misc;

public class Square {

    public int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int area(){
        return sideLength^2;
    }

    public static String formula(){
        return "sideLength^2";
    }
}
