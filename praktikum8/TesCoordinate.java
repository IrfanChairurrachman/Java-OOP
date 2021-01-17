class Coordinate2D{
    protected int x, y;

    public Coordinate2D(int inX, int inY){
        x = inX;
        y = inY;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}

class Coordinate3D extends Coordinate2D{
    protected int z;

    public Coordinate3D(int inX, int inY, int inZ){
        super(inX, inY);
        z = inZ;
    }

    public int getZ(){
        return z;
    }
}

public class TesCoordinate {
    public static void main(String[] args) {
        Coordinate2D myCoord = new Coordinate2D(5, 10);
        System.out.println("Nilai x dari myCoord = " + myCoord.getX());
        System.out.println("Nilai y dari myCoord = " + myCoord.getY());
        System.out.println();

        Coordinate3D my3dCoord = new Coordinate3D(5, 10, 15);
        System.out.println("Nilai x dari my3dCoord = " + my3dCoord.getX());
        System.out.println("Nilai y dari my3dCoord = " + my3dCoord.getY());
        System.out.println("Nilai z dari my3dCoord = " + my3dCoord.getZ());
    }
}
