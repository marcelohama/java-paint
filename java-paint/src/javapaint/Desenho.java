package javapaint;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JInternalFrame;

public class Desenho extends JInternalFrame {
    
    protected List<Figura> figuras = new ArrayList<Figura>();
    protected String autor = "sem autor";
    protected String nome = "sem nome";
    protected Date dataCriacao;
    
    // p1 é a posição primária (p1 das retas/retangulos e centros das elipses/circulos)
    // p2 é auxiliar (p2 das retas/retangulos ou raios da elipse)
    // corLinha é a cor de linha
    // corPreenche é a cor de preenchimento
    // preenche é a flag de preenchimento
    // tipo é o tipo do desenho
    public Desenho() {
        setLocation(0, 0);
        setVisible(true);
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        
        setBackground(Color.WHITE);
    }
    
    public void Desenha(Ponto p1, Ponto p2, Color corLinha, Color corPreenche, boolean preenche, int tipo) {
        if(tipo == 1) {
            Reta r = new Reta(p1, p2, corLinha);
            r.setSize(getWidth(), getHeight());
            r.setLocation(0, 0);
            figuras.add(r);
        }
        else if(tipo == 2) {
            Circulo c = new Circulo(p1,(int) Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY())), corLinha, corPreenche, preenche);
            c.setSize(getWidth(), getHeight());
            c.setLocation(0, 0);
            figuras.add(c);
        }
        else if(tipo == 3) {
            Retangulo r = new Retangulo(p1, p2, corLinha, corPreenche, preenche);
            r.setSize(getWidth(), getHeight());
            r.setLocation(0, 0);
            figuras.add(r);
        }
        else if(tipo == 4) {
            Elipse e = new Elipse(p1, p2.getX(), p2.getY(), corLinha, corPreenche, preenche);
            e.setSize(getWidth(), getHeight());
            e.setLocation(0, 0);
            figuras.add(e);
        }
        else if(tipo == 5) {
            
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i=0; i<figuras.size(); i++) {
            add(figuras.get(figuras.size()-i-1));
        }
    }
    
    public void salvar(Persistencia p) {
        
    }
    
    public void abrir(Persistencia p) {
        
    }
    
    public void createMessage(Persistencia p, String m) {
        
    }
    
}
