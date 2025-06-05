public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(){
        super();
        this.base = 0;
        this.height = 0;
    }
    public Triangle(String shapeName,double base, double height){
        super(shapeName);
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea(){
        return base*height/2;
    }

    @Override
    public void displayShapeDetails() {
        super.displayShapeDetails();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
    }
}
