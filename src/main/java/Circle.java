public class Circle extends GeometricObject {
    private double radius;

    // constructor 
    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);// inherited from superclass
        setFilled(filled);// inherited from superclass 
    }

    // getters and setters 
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getDiameter(){
        return 2*radius;
    }

    // implementing the area and perimeter finders
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    // method 

    public void printCircle(){
        System.out.println("the circle is created on "+ getDateCreated() + " radius of the circle is " + getRadius());
    }

    public String toString(){
        return "created on "+ getDateCreated() + "color is " + this.getColor() + "and filled " + this.isFilled()
                + "radius is " + radius;
    }
}
