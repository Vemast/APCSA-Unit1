package U1T7;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int num) {
        this.x = num;
        this.y = num;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int newX) {
        this.x = newX;
    }
    public void setY(int newY) {
        this.y = newY;
    }
    public String coordinate() {
        return "(" + this.x + "," + this.y + ")";
    }
    public String quadrant() {
        if (x > 0 && y > 0) return "I";
        if (x < 0 && y > 0) return "II";
        if (x < 0 && y < 0) return "III";
        if (x > 0 && y < 0) return "IV";
        if (x == 0 && y == 0) return "origin";
        return "on an axis";
    }
}