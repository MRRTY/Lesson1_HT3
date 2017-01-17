/**
 * Created by Greg on 17.01.2017.
 */
public class Main {
    public static void main(String args[]){
        Vector3d v1 = new Vector3d(1,2,3);
        Vector3d v2 = new Vector3d(2,1,-2);
        Vector3d v3 = v1.vMultiply(v2);
        v3.info();
        System.out.println(v1.sMultiply(v2));
        Vector3d v4 = v1.add(v2);
        v4.info();

    }
}
