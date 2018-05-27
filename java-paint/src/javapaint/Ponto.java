package javapaint;

// classe Ponto
public class Ponto {
    
    // posicoes x e y
    private int posX;
    private int posY;
    
    // construcao do ponto
    public Ponto(int px, int py) {
        posX = px;
        posY = py;
    }
    
    // retorna a posicao x
    public int getX() {
        return posX;
    }
    
    // retorna a posicao y
    public int getY() {
        return posY;
    }
    
}
