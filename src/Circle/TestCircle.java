package Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1,"Red");
        Circle circle2 = new Circle(1);
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        circle4.setRadius(3);
        circle4.setColor("Green");
//        System.out.println("C1: Pole: "+circle1.getArea()+" | Promień:"+circle1.getRadius());
//        System.out.println("C2: Pole: "+circle2.getArea()+" | Promień:"+circle2.getRadius());
//        System.out.println("C3: Pole: "+circle3.getArea()+" | Promień:"+circle3.getRadius());
//        System.out.println("C4: Pole: "+circle4.getArea()+" | Promień:"+circle4.getRadius());
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());
        System.out.println(circle4.toString());


    }
}
