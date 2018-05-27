package javapaint;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

// classe Elipse
public class Poligono extends Figura {

    private List<Ponto> pontos = new ArrayList<Ponto>();
    
    public Poligono(List<Ponto> pontos, Color cor) {
        this.pontos = pontos;
        this.corLinha = cor;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(corLinha);
        for(int i=0; i<pontos.size()-1 && pontos.size() > 1; i++) {
            g.drawLine(pontos.get(i).getX(), pontos.get(i).getY(), pontos.get(i+1).getX(), pontos.get(i+1).getY());
        }
    }
    
}
