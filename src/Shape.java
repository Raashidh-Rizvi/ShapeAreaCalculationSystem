public abstract class Shape {
    private String shapeName;

    public Shape(){
        shapeName = "N/A";

    }
    public Shape(String shapeName){
        this.shapeName = shapeName;
    }
    public void displayShapeDetails(){
        System.out.println("Shape Name: " + shapeName);

    }
    public abstract double calculateArea();

    public double calculateArea(double factor){
        return calculateArea() * factor;
    }


}
