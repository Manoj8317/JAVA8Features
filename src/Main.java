//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface shape{
    abstract public void draw();
}
//all the below code is before functional programing
//from after java 8 functional programming came into picture
//class Rectangle implements shape{
//    @Override
//    public void draw() {
//        System.out.println("rectangle drawn");
//    }
//}
//
//class Square implements shape{
//    @Override
//    public void draw() {
//        System.out.println("rectangle drawn");
//    }
//}
//
//class Circle implements shape{
//    @Override
//    public void draw() {
//        System.out.println("Circle drawn");
//    }
//}

public class Main {
    public static void main(String[] args)
    {
//        Circle c=new Circle();
//        c.draw();
        shape circle = () -> System.out.println("Circle drawn");
        shape rectangle = () -> System.out.println("rectangle drawn");
        shape square = () -> System.out.println("Square drawn");
        print(circle);
        print(rectangle);
        print(square);
    }

    private static void print(shape s){
        s.draw();
    }
}