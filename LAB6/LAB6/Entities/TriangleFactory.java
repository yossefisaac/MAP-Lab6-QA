package Entities;

public class TriangleFactory {
    private static Triangle isosceles = null;
    private static Triangle equilatero = null;
    private static Triangle retangulo = null;

    // Método estático para criar ou obter uma instância de triângulo isósceles
    public static Triangle createIsoscelesTriangle() throws ExcecaoInstancia {
        // Verifica se já existe uma instância de triângulo isósceles
        if (isosceles == null) {
            // Se não existir, cria uma nova instância
            isosceles = new Triangle(Triangle.Tipo.ISOSCELES);
        }
        // Retorna a instância existente
        return isosceles;
    }

    // Método estático para criar ou obter uma instância de triângulo equilátero
    public static Triangle createEquilateralTriangle() throws ExcecaoInstancia {
        // Verifica se já existe uma instância de triângulo equilátero
        if (equilatero == null) {
            // Se não existir, cria uma nova instância
            equilatero = new Triangle(Triangle.Tipo.EQUILATERO);
        }
        // Retorna a instância existente
        return equilatero;
    }

    // Método estático para criar ou obter uma instância de triângulo retângulo
    public static Triangle createRectangleTriangle() throws ExcecaoInstancia {
        // Verifica se já existe uma instância de triângulo retângulo
        if (retangulo == null) {
            // Se não existir, cria uma nova instância
            retangulo = new Triangle(Triangle.Tipo.RETANGULO);
        }
        // Retorna a instância existente
        return retangulo;
    }
}
