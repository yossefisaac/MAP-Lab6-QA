package Entities;

public class CircleFactory {
    private static Circle instance = null;

    // Método estático para criar ou obter uma instância de círculo
    public static Circle createCircle(int raio) throws ExcecaoInstancia {
        // Verifica se já existe uma instância de círculo
        if (instance == null) {
            // Se não existir, cria uma nova instância
            instance = new Circle(raio);
        }
        // Retorna a instância existente
        return instance;
    }
}
