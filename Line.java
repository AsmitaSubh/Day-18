import java.lang.Math;

class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public boolean isGreater(Line other) {
        return this.length() > other.length();
    }

    public boolean isLess(Line other) {
        return this.length() < other.length();
    }

    public boolean isEqual(Line other) {
        return this.length() == other.length();
    }
}

public class LineComparison {
    public static void main(String[] args) {
        Line line1 = new Line(1, 2, 4, 6);
        Line line2 = new Line(3, 4, 7, 9);

        if (line1.isGreater(line2)) {
            System.out.println("Line 1 is longer than Line 2");
        } else if (line1.isLess(line2)) {
            System.out.println("Line 1 is shorter than Line 2");
        } else {
            System.out.println("Line 1 and Line 2 have the same length");
        }
    }
}
