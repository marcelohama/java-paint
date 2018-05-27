package javapaint;

import java.awt.Color;
import javax.swing.JPanel;

// classe abstrata de Figura
public abstract class Figura extends JPanel {
    
    public Figura() {
        setOpaque(false);
        setVisible(true);
    }
    
    // propriedades de cor
    protected Color corLinha;
    protected Color corPreenchimento;
    // flag de preenchimento
    protected boolean preencher;
    
    // salva o desenho
    public void Salva(Persistencia base) {
        
    }
    
}

