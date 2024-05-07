package Entities;

public class Factory {
    /**
     * Método estático para criar uma instância de círculo com o raio especificado.
     * @param raio O raio do círculo a ser criado
     * @return A instância de círculo criada
     * @throws ExcecaoInstancia Se o raio for inválido
     */
    public static Circle createCircle(int raio) throws ExcecaoInstancia {
        return Circle.getInstance(raio);
    }

    /**
     * Método estático para criar uma instância de quadrado com o lado especificado.
     * @param lado O comprimento do lado do quadrado a ser criado
     * @return A instância de quadrado criada
     * @throws ExcecaoInstancia Se o lado for inválido
     */
    public static Square createSquare(int lado) throws ExcecaoInstancia {
        return Square.getInstance(lado);
    }

    /**
     * Método estático para criar uma instância de triângulo equilátero.
     * @return A instância de triângulo equilátero criada
     * @throws ExcecaoInstancia Se já houver uma instância de triângulo equilátero
     */
    public static Triangle createEquilateralTriangle() throws ExcecaoInstancia {
        return Triangle.getInstance(Triangle.Tipo.EQUILATERO);
    }

    /**
     * Método estático para criar uma instância de triângulo isósceles.
     * @return A instância de triângulo isósceles criada
     * @throws ExcecaoInstancia Se já houver uma instância de triângulo isósceles
     */
    public static Triangle createIsoscelesTriangle() throws ExcecaoInstancia {
        return Triangle.getInstance(Triangle.Tipo.ISOSCELES);
    }

    /**
     * Método estático para criar uma instância de triângulo retângulo.
     * @return A instância de triângulo retângulo criada
     * @throws ExcecaoInstancia Se já houver uma instância de triângulo retângulo
     */
    public static Triangle createRectangleTriangle() throws ExcecaoInstancia {
        return Triangle.getInstance(Triangle.Tipo.RETANGULO);
    }
}
