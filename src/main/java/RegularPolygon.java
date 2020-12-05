public class RegularPolygon extends GeometricObject {
    private int n;
    private double side;
    private double x;
    private double y;
    
    // setters and getters for all parameters !!! setters have retrun type as void 
    public void setN(int n){
        this.n = n;
    }
    public int getN(){
        return n;
    }
    
    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }

    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getY(){
        return y;
    } 

    // no args contstructor
    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    
    // contructor 2 
    RegularPolygon(int n , double side){
        this.n = n;
        this.side = side;
        x=0;
        y=0;
    }

    // constructor 3 t
    RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // methods 
    public double getPerimeter(){
        return n*side;
    }

    public double getArea(){
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }
    // toString method 
    public String toString(){
        return "RegularPolygon: number of sides = " + n + " side length = " + side;
    }

    
}
