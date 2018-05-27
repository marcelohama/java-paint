package javapaint;

import java.awt.Color;

public class Caracteristicas {
    
    private Color corLinha;
    private Color corPreenchimento;
    private int tipoFigura;
    private boolean preenche;
    
    public Caracteristicas(Color corLinha, Color corPreenchimento, boolean preenche, int tipoFigura) {
        this.corLinha = corLinha;
        this.corPreenchimento = corPreenchimento;
        this.preenche = preenche;
        this.tipoFigura = tipoFigura;
    }
    
    public void setCorLinha(Color cor) {
        corLinha = cor;
    }
    public void setCorPreenchimento(Color cor) {
        corPreenchimento = cor;
    }
    public void setTipoFigura(int tipo) {
        tipoFigura = tipo;
    }
    public void setPreenche(boolean preenche) {
        this.preenche = preenche;
    }
    
    public Color getCorLinha() {
        return corLinha;
    }
    public Color getCorPreenchimento() {
        return corPreenchimento;
    }
    public int getTipoFigura() {
        return tipoFigura;
    }
    public boolean getPreenche() {
        return preenche;
    }
    
}
