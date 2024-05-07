package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Entities.ExcecaoInstancia;
import Entities.Square;

public class SquareTest {
    // Testa a criação de um quadrado com lado válido
    @Test
    public void testCriarQuadrado() throws ExcecaoInstancia {
        Square square = Square.getInstance(4);
        assertEquals(4, square.getLado());
    }

    // Testa a criação de um quadrado com lado inválido
    @Test
    public void testCriarQuadradoComLadoInvalido() {
        // Espera-se que uma exceção seja lançada ao tentar criar um quadrado com lado inválido
        assertThrows(ExcecaoInstancia.class, () -> Square.getInstance(0));
        assertThrows(ExcecaoInstancia.class, () -> Square.getInstance(-4));
    }
}
