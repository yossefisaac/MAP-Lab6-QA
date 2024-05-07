package Entities;

public class Circle {
    // Atributos
    private int raio;

    // Construtor privado para evitar instanciação direta
    private Circle(int raio) {
        this.raio = raio;
    }

    /**
     * Método estático para obter a única instância de Circle.
     * Se já houver uma instância, lança uma exceção.
     * @param raio O raio do círculo a ser criado
     * @return A instância única de Circle
     * @throws ExcecaoInstancia Se já houver uma instância de Circle
     */
    public static Circle getInstance(int raio) throws ExcecaoInstancia {
        if (raio < 1) {
            throw new ExcecaoInstancia("Raio inválido");
        }

        return new Circle(raio);
    }

    // Método para obter o raio do círculo
    public int getRaio() {
        return raio;
    }

    // Método para representação em string do círculo
    @Override
    public String toString() {
        return "Círculo criado de raio: " + raio;
    }
}
