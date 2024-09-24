public class Circle{
    private double radius;
    private String color;
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        this.radius = r;
        this.color = "red";
    }
    public Circle(double r, String newColor){
        this.radius = r;
        this.color = newColor;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double radius2){
        this.radius = radius2;
    }
    public void setColor(String color2){
        this.color = color2;
    }
    public String toString(){
        return "Circle[radius="+ radius + " color=" + color + "]";
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public static void main(String[] args){
        Circle c1= new Circle();
        System.out.println(c1);
    }
}
