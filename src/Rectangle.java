public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(){
        super();
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(String shapeName,double width, double lenght){
        super(shapeName);
        this.width = width;
        this.height = lenght;
    }


    @Override
    public double calculateArea(){
        return  width*height;
    }

    public void displayShapeDetails(){
        super.displayShapeDetails();
        System.out.println("Height:"+height);
        System.out.println("Width:"+width);
        System.out.println("Area: " + calculateArea());

    }
}
