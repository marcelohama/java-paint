package javapaint;

import java.awt.Color;
import java.awt.Graphics;

// classe Elipse
public class Elipse extends Figura {

    private int raioV;
    private int raioH;
    private Ponto centro;
    
    // retorna o centro
    public Elipse(Ponto centro, int raioH, int raioV, Color corLinha, Color corPreenchimento, boolean preencher) {
        this.centro = centro;
        this.raioH = raioH;
        this.raioV = raioV;
        this.corLinha = corLinha;
        this.corPreenchimento = corPreenchimento;
        this.preencher = preencher;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(corPreenchimento);
        if(preencher == true) g.fillOval(centro.getX(), centro.getY(), raioH, raioV);
        g.setColor(corLinha);
        g.drawOval(centro.getX(), centro.getY(), raioH, raioV);
    }
    
}
