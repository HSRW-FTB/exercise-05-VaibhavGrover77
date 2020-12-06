import java.util.ArrayList;
public class BucketOfObjects {
    private ArrayList<GeometricObject> items = new ArrayList<GeometricObject>();

    // constructor 
    BucketOfObjects(){}
    public void addObject(GeometricObject obj){
        item.add(obj);
    }
    public double getTotalArea(){
        double a = 0.0;
        for (GeometricObject obj : items){
            a += obj.getArea();
        }
        return a;
    }
    public double getTotalPerimeter(){
        double p = 0;
        for (GeomtericObject obj : items){
            p += obj.getPerimeter;
        }
        return p;
    }
    public String toString(){
        String s = "";
        for (GeometricObject obj : items){
            s += obj.getClass().getSimpleName();
            System.out.println(",");
        }
        return s = s.substring(0,str.length()-2);
    }
}
