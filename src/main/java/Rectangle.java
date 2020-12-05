public class Rectangle extends GeometricObject {
    private double width;
    private double height;
    // constructor 
    public Rectangle(){}

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);// inheritance 
        setFilled(filled);// inheritance 
        // super(color, filled)
    }

    // getters and setters 
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setFilled(int n){
        if (n>0) super.setFilled(true);//??
        else super.setFilled(false);//??
    }

    void changeColor(String color){
        super.setColor(color);
    }
    public String toString(){
        return "created on "+ getDateCreated() + "color is " + this.getColor() + "and filled " + this.isFilled();
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return 0;
    }
}

