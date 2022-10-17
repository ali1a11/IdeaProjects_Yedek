package day_40_Protected_Access_Modifier_Final;


import day_38_Inheritance_Cont.CarTask.Task.Square;
import day_39_Encapsulation_Inheritance_Recap.shapeTask.Circle;

public class EncapsulationReview {
    private Circle circle;
    private Square square;


    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Square getSquare(){
        return square;
    }

    public void setSquare(Square square){
        this.square = square;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5);
        System.out.println("circle1.perimeter() = " + circle1.perimeter());
    }

}
