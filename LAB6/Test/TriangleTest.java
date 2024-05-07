package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Entities.ExcecaoInstancia;
import Entities.Triangle;

public class TriangleTest {
    // Testa a criação de um triângulo equilátero
    @Test
    public void testCriarTrianguloEquilatero() throws ExcecaoInstancia {
        Triangle triangle = Triangle.getInstance(Triangle.Tipo.EQUILATERO);
        assertEquals(Triangle.Tipo.EQUILATERO, triangle.getTipo());
    }

    // Testa a criação de um triângulo isósceles
    @Test
    public void testCriarTrianguloIsosceles() throws ExcecaoInstancia {
        Triangle triangle = Triangle.getInstance(Triangle.Tipo.ISOSCELES);
        assertEquals(Triangle.Tipo.ISOSCELES, triangle.getTipo());
    }

    // Testa a criação de um triângulo retângulo
    @Test
    public void testCriarTrianguloRetangulo() throws ExcecaoInstancia {
        Triangle triangle = Triangle.getInstance(Triangle.Tipo.RETANGULO);
        assertEquals(Triangle.Tipo.RETANGULO, triangle.getTipo());
    }

    // Testa se uma exceção é lançada ao tentar criar dois triângulos equiláteros
    @Test
    public void testCriarDoisTriangulosEquilateros() throws ExcecaoInstancia {
        Triangle.getInstance(Triangle.Tipo.EQUILATERO);
        assertThrows(ExcecaoInstancia.class, () -> Triangle.getInstance(Triangle.Tipo.EQUILATERO));
    }

    // Testa se uma exceção é lançada ao tentar criar dois triângulos isósceles
    @Test
    public void testCriarDoisTriangulosIsosceles() throws ExcecaoInstancia {
        Triangle.getInstance(Triangle.Tipo.ISOSCELES);
        assertThrows(ExcecaoInstancia.class, () -> Triangle.getInstance(Triangle.Tipo.ISOSCELES));
    }

    // Testa se uma exceção é lançada ao tentar criar dois triângulos retângulos
    @Test
    public void testCriarDoisTriangulosRetangulos() throws ExcecaoInstancia {
        Triangle.getInstance(Triangle.Tipo.RETANGULO);
        assertThrows(ExcecaoInstancia.class, () -> Triangle.getInstance(Triangle.Tipo.RETANGULO));
    }
}
