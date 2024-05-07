package Entities;

public class Circle {
    private int raio;

    // Construtor privado para evitar instanciar diretamente
    Circle(int raio) {
        this.raio = raio;
    }

    // Método estático para criar uma instância de círculo
    public static Circle getInstance(int raio) throws ExcecaoInstancia {
        // Verifica se o raio é válido
        if (raio < 1) {
            throw new ExcecaoInstancia("Raio inválido");
        }
        // Cria e retorna uma nova instância de círculo
        return new Circle(raio);
    }

    // Getter para obter o raio do círculo
    public int getRaio() {
        return raio;
    }

    // Sobrescrita do método toString para representação textual do círculo
    @Override
    public String toString() {
        return "Círculo criado de raio: " + raio;
    }
}
