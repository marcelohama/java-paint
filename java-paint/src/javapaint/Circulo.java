package javapaint;

import java.awt.Color;
import java.awt.Graphics;

// classe Circulo
public class Circulo extends Figura {
    
    // centro e raio
    private Ponto centro;
    private int raio;

    public Circulo(Ponto centro, int raio, Color corLinha, Color corPreenchimento, boolean preencher) {
        this.centro = centro;
        this.raio = raio;
        this.corLinha = corLinha;
        this.corPreenchimento = corPreenchimento;
        this.preencher = preencher;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(corPreenchimento);
        if(preencher == true) g.fillOval(centro.getX(), centro.getY(), raio, raio);
        g.setColor(corLinha);
        g.drawOval(centro.getX(), centro.getY(), raio, raio);
    }
    
}
