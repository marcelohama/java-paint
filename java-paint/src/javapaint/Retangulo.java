package javapaint;

// classe Retangulo

import java.awt.Color;
import java.awt.Graphics;

public class Retangulo extends Figura {
    
    private Ponto p1;
    private Ponto p2;
        
    public Retangulo(Ponto p1, Ponto p2, Color cor, Color corPreenchimento, boolean preencher) {
        this.p1 = p1;
        this.p2 = p2;
        this.corLinha = cor;
        this.corPreenchimento = corPreenchimento;
        this.preencher = preencher;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(corPreenchimento);
        if(preencher == true) g.fillRect(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        g.setColor(corLinha);
        g.drawRect(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
    
}
