public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle("Triangle",10,10);




        rectangle.diplayShapeDetails();
        System.out.println("Factorized Area: " + rectangle.calculateArea(2));
        System.out.println();
        triangle.displayShapeDetails();
        System.out.println("Factorized Area: " + triangle.calculateArea(2));




    }
}