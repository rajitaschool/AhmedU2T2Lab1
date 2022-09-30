public class Point {

    // instance variables
    private int x;
    private int y;

    // constructor 1: Accepts and sets both instance variables
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //constructor 2: Accepts 1 variable sets it to 2 instances
    public Point (int number) {
        x = number;
        y = number;
    }

    //constructor 3: Sets both instances to default value AKA 0
    public Point () {
        x = 0;
        y= 0;
    }

    // getter 1: Getter method for x
    public int getX() {
        return x;
    }

    //getter 2 : Getter method for y
    public int getY() {
        return y;
    }

    //setter 1: setter method for x
    public void setX(int newX) {
        x = newX;
    }

    //setter 2: setter method for y
    public void setY(int newY) {
        y = newY;
    }

    // method 1: Coordinate, returns string
    public String coordinate() {
        return "(" + x + "," + y + ")";
    }

    //method 2: Quadrant, returns what quadrant its in
    public String quadrant() {
        if (x == 0 && y == 0) {
            return "origin";
        }
        if (x == 0 || y == 0) {
            return "on an axis";
        }

        if (x > 0) {
            if (y > 0) {
                return "I";
            } else {
                return "IV";
            }
        }

        if (x < 0) {
            if (y > 0) {
                return "II";
            } else {
                return "III";
            }
        }
        return null;
    }
}
