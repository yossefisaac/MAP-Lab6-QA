package Entities;

public class Triangle {
    // Tipos de triângulos
    public enum Tipo {
        EQUILATERO, ISOSCELES, RETANGULO
    }

    // Atributos
    private Tipo tipo;

    // Construtor privado para evitar instanciação direta
    private Triangle(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * Método estático para obter a única instância de Triangle.
     * Se já houver uma instância, lança uma exceção.
     * @param tipo O tipo do triângulo a ser criado
     * @return A instância única de Triangle
     * @throws ExcecaoInstancia Se já houver uma instância de Triangle
     */
    public static Triangle getInstance(Tipo tipo) throws ExcecaoInstancia {
        switch (tipo) {
            case EQUILATERO:
                if (TriangleFactory.equilatero == null) {
                    TriangleFactory.equilatero = new Triangle(tipo);
                } else {
                    throw new ExcecaoInstancia("Já existe uma instância de Triângulo Equilátero");
                }
                break;
            case ISOSCELES:
                if (TriangleFactory.isosceles == null) {
                    TriangleFactory.isosceles = new Triangle(tipo);
                } else {
                    throw new ExcecaoInstancia("Já existe uma instância de Triângulo Isósceles");
                }
                break;
            case RETANGULO:
                if (TriangleFactory.retangulo == null) {
                    TriangleFactory.retangulo = new Triangle(tipo);
                } else {
                    throw new ExcecaoInstancia("Já existe uma instância de Triângulo Retângulo");
                }
                break;
            default:
                throw new ExcecaoInstancia("Tipo inválido de triângulo");
        }

        return new Triangle(tipo);
    }

    // Método para obter o tipo do triângulo
    public Tipo getTipo() {
        return tipo;
    }

    // Método para representação em string do triângulo
    @Override
    public String toString() {
        return "Triângulo do tipo " + tipo + " criado";
    }
}
