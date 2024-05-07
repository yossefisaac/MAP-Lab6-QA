package Entities;

public class Square {
    // Atributo
    private int lado;

    // Construtor privado para evitar instanciação direta
    private Square(int lado) {
        this.lado = lado;
    }

    /**
     * Método estático para obter a única instância de Square.
     * Se já houver uma instância, lança uma exceção.
     * @param lado O comprimento do lado do quadrado a ser criado
     * @return A instância única de Square
     * @throws ExcecaoInstancia Se já houver uma instância de Square
     */
    public static Square getInstance(int lado) throws ExcecaoInstancia {
        if (lado < 1) {
            throw new ExcecaoInstancia("Lado inválido");
        }

        return new Square(lado);
    }

    // Método para obter o comprimento do lado do quadrado
    public int getLado() {
        return lado;
    }

    // Método para representação em string do quadrado
    @Override
    public String toString() {
        return "Quadrado criado de lado: " + lado;
    }
}
