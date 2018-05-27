package javapaint;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MDIDesenho extends Desenho {
    
    private Ponto p1;
    private Ponto p2;
    private Caracteristicas config = new Caracteristicas(Color.BLACK, Color.BLACK, false, 1);
    
    public MDIDesenho(int w, int h, String nome, String autor) {
        this.setSize(w, h);
        setTitle("["+nome+"]" + " de " + "["+autor+"]");
        this.nome = nome;
        this.autor = autor;
        
        addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                
            }
            public void mousePressed(MouseEvent e) {
                p1 = new Ponto(getMousePosition().x-5,getMousePosition().y-30);
                repaint();
            }
            public void mouseReleased(MouseEvent e) {
                try {
                    if(config.getTipoFigura() == 1)
                        p2 = new Ponto(getMousePosition().x-5,getMousePosition().y-30);
                    if(config.getTipoFigura() == 2)
                        p2 = new Ponto(getMousePosition().x-5,getMousePosition().y-30);
                    if(config.getTipoFigura() == 3)
                        p2 = new Ponto(getMousePosition().x-5-p1.getX(),getMousePosition().y-30-p1.getY());
                    if(config.getTipoFigura() == 4)
                        p2 = new Ponto(getMousePosition().x-5-p1.getX(),getMousePosition().y-30-p1.getY());
                    if(config.getTipoFigura() == 5)
                        ;
                    Desenha(p1, p2, config.getCorLinha(), config.getCorPreenchimento(), config.getPreenche(), config.getTipoFigura());
                    repaint();
                }
                catch (NullPointerException ex) {
                    
                }
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        });
        
        addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
            }
            public void mouseMoved(MouseEvent e) {
            }
        });
    
    }
    
    public void setConfig(Color corLinha, Color corPreenhe, boolean preenche, int tipo) {
        config = new Caracteristicas(corLinha, corPreenhe, preenche, tipo);
    }
    public Caracteristicas getConfig() {
        return config;
    }
    
}
