package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Entities.Circle;
import Entities.CircleFactory;
import Entities.ExcecaoInstancia;

public class CircleTest {
    private Circle circle;

    @Before
    public void setUp() throws ExcecaoInstancia {
        circle = CircleFactory.createCircle(5);
    }

    @Test
    public void testCreateCircle() {
        assertNotNull(circle);
        assertEquals(5, circle.getRaio());
    }

    @Test
    public void testCreateMultipleCircles() throws ExcecaoInstancia {
        Circle anotherCircle = CircleFactory.createCircle(10);
        assertSame(circle, anotherCircle); // Verifica se a mesma instância é retornada
        assertEquals(5, circle.getRaio()); // Verifica se o raio é mantido
    }

    @Test(expected = ExcecaoInstancia.class)
    public void testCreateCircleWithInvalidRadius() throws ExcecaoInstancia {
        CircleFactory.createCircle(-1); // Deve lançar uma exceção para raio inválido
    }
}
