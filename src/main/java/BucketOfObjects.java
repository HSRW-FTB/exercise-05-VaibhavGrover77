public class BucketOfObjects {
    private GeometricObject[] items;

    // constructor 
    BucketOfObjects(){}
    public void addObject(GeometricObject obj){
        for (int i=0; i< items.length ; i++){
            items[i] = obj;
        }
    }
    public double getTotalArea(){
        double a = 0.0;
        for (int i = 0; i< items.length ; i++){
            a = a+ items[i].getArea();
        }
        return a;
    }
    public double getTotalPerimeter(){
        double p = 0;
        for (int i=0 ; i< items.length ; i++){
            p = p+ items[i].getPerimeter();
        }
        return p;
    }
    public String toString(){
        String s = "";
        for (int i = 0; i< items.length ; i++){
            s += String.valueOf(this.items[i]);
            System.out.println(",");
        }
        return s;
    }
}
