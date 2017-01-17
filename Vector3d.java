/**
 * Created by Greg on 17.01.2017.
 */
public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d() {
    }

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double sMultiply(Vector3d v){
        return x*v.getX() + y*v.getY() + z+ v.getZ();
    }

    public Vector3d vMultiply(Vector3d v){

        return new Vector3d(y*v.getZ() - z*v.getY(),z*v.getX() -x*v.getZ(),x*v.getY() - y*v.getX());
    }

    public Vector3d add(Vector3d v){
        return new Vector3d(x+v.getX(),y+v.getY(),z+v.getZ());
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public void info(){
        System.out.println(this.toString());
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
