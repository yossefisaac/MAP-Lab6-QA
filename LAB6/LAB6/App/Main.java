import Entities.CircleFactory;
import Entities.ExcecaoInstancia;
import Entities.SquareFactory;
import Entities.TriangleFactory;

public class Main {
    public static void main(String[] args) throws ExcecaoInstancia {

        System.out.println(CircleFactory.createCircle(5));
        System.out.println(SquareFactory.createSquare(4));
        System.out.println(SquareFactory.createSquare(3));

        System.out.println(TriangleFactory.createEquilateralTriangle());
        System.out.println(TriangleFactory.createIsoscelesTriangle());
        System.out.println(TriangleFactory.createRectangleTriangle());
    }
}
