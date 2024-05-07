package Entities;

public class Square {
    private int lado;

    // Construtor privado para evitar instanciar diretamente
    Square(int lado) {
        this.lado = lado;
    }

    // Método estático para criar uma instância de quadrado
    public static Square createSquare(int lado) throws ExcecaoInstancia {
        // Verifica se o lado é válido
        if (lado < 1) {
            throw new ExcecaoInstancia("Lado inválido");
        }
        // Cria e retorna uma nova instância de quadrado
        return new Square(lado);
    }

    // Getter para obter o lado do quadrado
    public int getLado() {
        return lado;
    }

    // Sobrescrita do método toString para representação textual do quadrado
    @Override
    public String toString() {
        return "Quadrado criado de lado: " + lado;
    }
}
