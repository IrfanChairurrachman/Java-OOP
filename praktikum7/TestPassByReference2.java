class Point{
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    double distance(int x, int y){
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    double distance(Point p){
        return distance(p.x, p.y);
    }
}

public class TestPassByReference2 {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        System.out.println("Point p = " + p.x + ", " + p.y);

        change(p);

        System.out.println("Point p = " + p.x + ", " + p.y);
    }

    public static void change(Point point){
        point.x = 4;
        point.y = 5;
    }
}
