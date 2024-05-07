package Entities;

public class Triangle {
    public enum Tipo {
        EQUILATERO, ISOSCELES, RETANGULO
    }

    private Tipo tipo;

    // Construtor privado para evitar instanciar diretamente
    Triangle(Tipo tipo) {
        this.tipo = tipo;
    }

    // Método estático para criar uma instância de triângulo
    public static Triangle createTriangle(Tipo tipo) throws ExcecaoInstancia {
        // Verifica se o tipo de triângulo é válido
        if (tipo == null) {
            throw new ExcecaoInstancia("Tipo de triângulo inválido");
        }
        // Cria e retorna uma nova instância de triângulo
        return new Triangle(tipo);
    }

    // Getter para obter o tipo do triângulo
    public Tipo getTipo() {
        return tipo;
    }

    // Sobrescrita do método toString para representação textual do triângulo
    @Override
    public String toString() {
        return "Triângulo do tipo " + tipo + " criado";
    }
}
