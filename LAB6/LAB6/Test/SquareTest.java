package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Entities.ExcecaoInstancia;
import Entities.Square;
import Entities.SquareFactory;

public class SquareTest {
    private Square square;

    @Before
    public void setUp() throws ExcecaoInstancia {
        square = SquareFactory.createSquare(4);
    }

    @Test
    public void testCreateSquare() {
        assertNotNull(square);
        assertEquals(4, square.getLado());
    }

    @Test
    public void testCreateMultipleSquares() throws ExcecaoInstancia {
        Square anotherSquare = SquareFactory.createSquare(6);
        assertSame(square, anotherSquare); // Verifica se a mesma instância é retornada
        assertEquals(4, square.getLado()); // Verifica se o lado é mantido
    }

    @Test(expected = ExcecaoInstancia.class)
    public void testCreateSquareWithInvalidSide() throws ExcecaoInstancia {
        SquareFactory.createSquare(0); // Deve lançar uma exceção para lado inválido
    }
}
