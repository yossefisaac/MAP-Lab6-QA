package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import Entities.Circle;
import Entities.ExcecaoInstancia;

public class CircleTest {
    // Testa a criação de um círculo com raio válido
    @Test
    public void testCriarCirculo() throws ExcecaoInstancia {
        Circle circle = Circle.getInstance(5);
        assertEquals(5, circle.getRaio());
    }

    // Testa a criação de um círculo com raio inválido
    @Test
    public void testCriarCirculoComRaioInvalido() {
        // Espera-se que uma exceção seja lançada ao tentar criar um círculo com raio inválido
        assertThrows(ExcecaoInstancia.class, () -> Circle.getInstance(0));
        assertThrows(ExcecaoInstancia.class, () -> Circle.getInstance(-5));
    }
}
