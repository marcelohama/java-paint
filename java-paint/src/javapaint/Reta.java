package javapaint;

// classe Reta

import java.awt.Color;
import java.awt.Graphics;

public class Reta extends Figura {
    
    private Ponto p1;
    private Ponto p2;
    
    public Reta(Ponto p1, Ponto p2, Color corLinha) {
        this.p1 = p1;
        this.p2 = p2;
        this.corLinha = corLinha;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(corLinha);
        g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
    
}
