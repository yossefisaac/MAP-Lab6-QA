package Entities;

public class SquareFactory {
    private static Square instance = null;

    // Método estático para criar ou obter uma instância de quadrado
    public static Square createSquare(int lado) throws ExcecaoInstancia {
        // Verifica se já existe uma instância de quadrado
        if (instance == null) {
            // Se não existir, cria uma nova instância
            instance = new Square(lado);
        }
        // Retorna a instância existente
        return instance;
    }
}
