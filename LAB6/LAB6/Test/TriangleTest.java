package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Entities.ExcecaoInstancia;
import Entities.Triangle;
import Entities.TriangleFactory;

public class TriangleTest {
    private Triangle triangle;

    @Before
    public void setUp() throws ExcecaoInstancia {
        triangle = TriangleFactory.createIsoscelesTriangle();
    }

    @Test
    public void testCreateTriangle() {
        assertNotNull(triangle);
        assertEquals(Triangle.Tipo.ISOSCELES, triangle.getTipo());
    }

    @Test
    public void testCreateMultipleTriangles() throws ExcecaoInstancia {
        Triangle anotherTriangle = TriangleFactory.createRectangleTriangle();
        assertSame(triangle, anotherTriangle); // Verifica se a mesma instância é retornada
        assertEquals(Triangle.Tipo.ISOSCELES, triangle.getTipo()); // Verifica se o tipo é mantido
    }

    @Test(expected = ExcecaoInstancia.class)
    public void testCreateTriangleWithInvalidType() throws ExcecaoInstancia {
        TriangleFactory.createRectangleTriangle(); // Deve lançar uma exceção para tipo inválido
    }
}
