import java.util.ArrayList;
public class BucketOfObjects {
    private ArrayList<GeometricObject> items = new ArrayList<GeometricObject>(); 
    
    public BucketOfObjects(){
    }
    public void addObject(GeometricObject obj){
        items.add(obj);
    }
    public double getTotalArea(){
        double totArea = 0;
        for (GeometricObject obj : items){
            totArea += obj.getArea();
        }
        return totArea; 
    }
    public double getTotalPerimeter(){
        double totPeri = 0;
        for (GeometricObject obj : items){
            totPeri += obj.getPerimeter();
        }
        return totPeri;
    }
    public String toString(){
        String str = ""; 
        for (GeometricObject obj: items ){
            str += obj.getClass().getSimpleName()+", "; 
        }
        return str = str.substring(0,str.length()-2);
    }
}
