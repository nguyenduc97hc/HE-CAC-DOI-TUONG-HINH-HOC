public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        circle.toString();
        circle.getArea();
        circle.getPerimeter();
        System.out.println(circle.toString());
        System.out.println("Diện tích hình tròn  : " +        circle.getArea() + "Chu vi hình tròn : " +circle.getPerimeter());

        Rectangle rectangle = new Rectangle(6,4);
        rectangle.getArea();
        rectangle.getPerimeter();
        System.out.println("Diện tích HCN : " +        rectangle.getArea() + "Chu vi HCN : " +rectangle.getPerimeter());
    }
}
