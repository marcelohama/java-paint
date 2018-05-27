package javapaint;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class JanelaPrincipal extends javax.swing.JFrame {

public JanelaPrincipal() {
    initComponents();
    btReta.setSelected(true);
    setSize(837, 600);
    atribuicoes();
    setLocation((getToolkit().getScreenSize().width-getWidth())/2, (getToolkit().getScreenSize().height-getHeight())/2);
    setTitle("Java Paint");
}

@SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RotuloMensagem = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        panelCorLinha = new javax.swing.JPanel();
        rotuloL = new javax.swing.JLabel();
        rotuloP = new javax.swing.JLabel();
        panelCorPreenchimento = new javax.swing.JPanel();
        btReta = new javax.swing.JToggleButton();
        btLapis = new javax.swing.JToggleButton();
        btRetangulo = new javax.swing.JToggleButton();
        panelAreaDeTrabalho = new javax.swing.JPanel();
        preto = new javax.swing.JButton();
        cinza = new javax.swing.JButton();
        branco = new javax.swing.JButton();
        roxoEscuro = new javax.swing.JButton();
        roxo = new javax.swing.JButton();
        roxoClaro = new javax.swing.JButton();
        azulEscuro = new javax.swing.JButton();
        azul = new javax.swing.JButton();
        azulClaro = new javax.swing.JButton();
        verdeEscuro = new javax.swing.JButton();
        verde = new javax.swing.JButton();
        verdeClaro = new javax.swing.JButton();
        amareloEscuro = new javax.swing.JButton();
        amarelo = new javax.swing.JButton();
        amareloClaro = new javax.swing.JButton();
        vermelhoEscuro = new javax.swing.JButton();
        vermelho = new javax.swing.JButton();
        laranja = new javax.swing.JButton();
        checkBoxPreencher = new javax.swing.JCheckBox();
        btElipse = new javax.swing.JToggleButton();
        btPoligono = new javax.swing.JToggleButton();
        btCirculo = new javax.swing.JToggleButton();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuItemArquivo = new javax.swing.JMenu();
        MenuItemNovo = new javax.swing.JMenuItem();
        MenuItemAbrir = new javax.swing.JMenuItem();
        MenuItemSalvar = new javax.swing.JMenuItem();
        MenuSeparador = new javax.swing.JSeparator();
        MenuItemSair = new javax.swing.JMenuItem();
        MenuItemAjuda = new javax.swing.JMenu();
        MenuItemHelp = new javax.swing.JMenuItem();
        MenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RotuloMensagem.setText("mensagem:");

        panelCorLinha.setBackground(new java.awt.Color(0, 0, 0));
        panelCorLinha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCorLinhaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCorLinhaLayout = new javax.swing.GroupLayout(panelCorLinha);
        panelCorLinha.setLayout(panelCorLinhaLayout);
        panelCorLinhaLayout.setHorizontalGroup(
            panelCorLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        panelCorLinhaLayout.setVerticalGroup(
            panelCorLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        rotuloL.setFont(new java.awt.Font("Tahoma", 0, 10));
        rotuloL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotuloL.setText("L");

        rotuloP.setFont(new java.awt.Font("Tahoma", 0, 10));
        rotuloP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotuloP.setText("P");

        panelCorPreenchimento.setBackground(new java.awt.Color(0, 0, 0));
        panelCorPreenchimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCorPreenchimentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCorPreenchimentoLayout = new javax.swing.GroupLayout(panelCorPreenchimento);
        panelCorPreenchimento.setLayout(panelCorPreenchimentoLayout);
        panelCorPreenchimentoLayout.setHorizontalGroup(
            panelCorPreenchimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        panelCorPreenchimentoLayout.setVerticalGroup(
            panelCorPreenchimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        btReta.setBackground(new java.awt.Color(255, 255, 255));
        btReta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reta.gif"))); // NOI18N
        btReta.setFocusable(false);
        btReta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btReta.setMaximumSize(new java.awt.Dimension(30, 30));
        btReta.setMinimumSize(new java.awt.Dimension(30, 30));
        btReta.setPreferredSize(new java.awt.Dimension(30, 30));
        btReta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btReta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetaActionPerformed(evt);
            }
        });

        btLapis.setBackground(new java.awt.Color(255, 255, 255));
        btLapis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lapis.gif"))); // NOI18N
        btLapis.setFocusable(false);
        btLapis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLapis.setMaximumSize(new java.awt.Dimension(30, 30));
        btLapis.setMinimumSize(new java.awt.Dimension(30, 30));
        btLapis.setPreferredSize(new java.awt.Dimension(30, 30));
        btLapis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLapis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLapisActionPerformed(evt);
            }
        });

        btRetangulo.setBackground(new java.awt.Color(255, 255, 255));
        btRetangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/retangulo.gif"))); // NOI18N
        btRetangulo.setFocusable(false);
        btRetangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRetangulo.setMaximumSize(new java.awt.Dimension(30, 30));
        btRetangulo.setMinimumSize(new java.awt.Dimension(30, 30));
        btRetangulo.setPreferredSize(new java.awt.Dimension(30, 30));
        btRetangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetanguloActionPerformed(evt);
            }
        });

        panelAreaDeTrabalho.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout panelAreaDeTrabalhoLayout = new javax.swing.GroupLayout(panelAreaDeTrabalho);
        panelAreaDeTrabalho.setLayout(panelAreaDeTrabalhoLayout);
        panelAreaDeTrabalhoLayout.setHorizontalGroup(
            panelAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        panelAreaDeTrabalhoLayout.setVerticalGroup(
            panelAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        preto.setBackground(new java.awt.Color(0, 0, 0));
        preto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretoActionPerformed(evt);
            }
        });

        cinza.setBackground(new java.awt.Color(153, 153, 153));
        cinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinzaActionPerformed(evt);
            }
        });

        branco.setBackground(new java.awt.Color(255, 255, 255));
        branco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brancoActionPerformed(evt);
            }
        });

        roxoEscuro.setBackground(new java.awt.Color(102, 0, 102));
        roxoEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roxoEscuroActionPerformed(evt);
            }
        });

        roxo.setBackground(new java.awt.Color(204, 0, 153));
        roxo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roxoActionPerformed(evt);
            }
        });

        roxoClaro.setBackground(new java.awt.Color(255, 153, 204));
        roxoClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roxoClaroActionPerformed(evt);
            }
        });

        azulEscuro.setBackground(new java.awt.Color(0, 0, 153));
        azulEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulEscuroActionPerformed(evt);
            }
        });

        azul.setBackground(new java.awt.Color(0, 0, 255));
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });

        azulClaro.setBackground(new java.awt.Color(153, 204, 255));
        azulClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulClaroActionPerformed(evt);
            }
        });

        verdeEscuro.setBackground(new java.awt.Color(0, 102, 0));
        verdeEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeEscuroActionPerformed(evt);
            }
        });

        verde.setBackground(new java.awt.Color(0, 204, 51));
        verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeActionPerformed(evt);
            }
        });

        verdeClaro.setBackground(new java.awt.Color(153, 255, 153));
        verdeClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeClaroActionPerformed(evt);
            }
        });

        amareloEscuro.setBackground(new java.awt.Color(102, 102, 0));
        amareloEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amareloEscuroActionPerformed(evt);
            }
        });

        amarelo.setBackground(new java.awt.Color(255, 255, 0));
        amarelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amareloActionPerformed(evt);
            }
        });

        amareloClaro.setBackground(new java.awt.Color(255, 255, 153));
        amareloClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amareloClaroActionPerformed(evt);
            }
        });

        vermelhoEscuro.setBackground(new java.awt.Color(102, 0, 0));
        vermelhoEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermelhoEscuroActionPerformed(evt);
            }
        });

        vermelho.setBackground(new java.awt.Color(255, 51, 0));
        vermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermelhoActionPerformed(evt);
            }
        });

        laranja.setBackground(new java.awt.Color(255, 153, 51));
        laranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laranjaActionPerformed(evt);
            }
        });

        checkBoxPreencher.setText("preencher");
        checkBoxPreencher.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkBoxPreencherStateChanged(evt);
            }
        });

        btElipse.setBackground(new java.awt.Color(255, 255, 255));
        btElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/elipse.gif"))); // NOI18N
        btElipse.setFocusable(false);
        btElipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btElipse.setMaximumSize(new java.awt.Dimension(30, 30));
        btElipse.setMinimumSize(new java.awt.Dimension(30, 30));
        btElipse.setPreferredSize(new java.awt.Dimension(30, 30));
        btElipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btElipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btElipseActionPerformed(evt);
            }
        });

        btPoligono.setBackground(new java.awt.Color(255, 255, 255));
        btPoligono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/poligono.gif"))); // NOI18N
        btPoligono.setFocusable(false);
        btPoligono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPoligono.setMaximumSize(new java.awt.Dimension(30, 30));
        btPoligono.setMinimumSize(new java.awt.Dimension(30, 30));
        btPoligono.setPreferredSize(new java.awt.Dimension(30, 30));
        btPoligono.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPoligonoActionPerformed(evt);
            }
        });

        btCirculo.setBackground(new java.awt.Color(255, 255, 255));
        btCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/circulo.gif"))); // NOI18N
        btCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCirculoActionPerformed(evt);
            }
        });

        MenuItemArquivo.setText("Arquivo");

        MenuItemNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemNovo.setText("Novo Arquivo");
        MenuItemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNovoActionPerformed(evt);
            }
        });
        MenuItemArquivo.add(MenuItemNovo);

        MenuItemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemAbrir.setText("Abrir Arquivo");
        MenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAbrirActionPerformed(evt);
            }
        });
        MenuItemArquivo.add(MenuItemAbrir);

        MenuItemSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemSalvar.setText("Salvar Arquivo");
        MenuItemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSalvarActionPerformed(evt);
            }
        });
        MenuItemArquivo.add(MenuItemSalvar);
        MenuItemArquivo.add(MenuSeparador);

        MenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemSair.setText("Sair");
        MenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSairActionPerformed(evt);
            }
        });
        MenuItemArquivo.add(MenuItemSair);

        MenuPrincipal.add(MenuItemArquivo);

        MenuItemAjuda.setText("Ajuda");

        MenuItemHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MenuItemHelp.setText("Ajuda");
        MenuItemAjuda.add(MenuItemHelp);

        MenuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MenuItemSobre.setText("Sobre");
        MenuItemAjuda.add(MenuItemSobre);

        MenuPrincipal.add(MenuItemAjuda);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separador1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                    .addComponent(RotuloMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkBoxPreencher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(preto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cinza, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(branco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roxoEscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roxo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roxoClaro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(azulEscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(azul, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(azulClaro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verdeEscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verdeClaro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amareloEscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amareloClaro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vermelhoEscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laranja, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCirculo, 0, 0, Short.MAX_VALUE)
                            .addComponent(btPoligono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btElipse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCorLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rotuloP, 0, 0, Short.MAX_VALUE)
                            .addComponent(panelCorPreenchimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btReta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btLapis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btRetangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelAreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLapis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btReta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRetangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btElipse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPoligono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(rotuloP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCorPreenchimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotuloL)
                        .addGap(11, 11, 11)
                        .addComponent(panelCorLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelAreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxPreencher)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(preto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cinza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(branco, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(roxoEscuro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(roxo, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(roxoClaro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(azulEscuro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(azul, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(azulClaro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(verdeEscuro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(verde, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(verdeClaro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(amareloEscuro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(amarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(laranja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amareloClaro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(vermelhoEscuro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(vermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RotuloMensagem)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// <editor-fold defaultstate="collapsed" desc="tipo da selecao de cor">
private void panelCorLinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCorLinhaMouseClicked
    PL = false;
    atribuicoes();
}//GEN-LAST:event_panelCorLinhaMouseClicked

private void panelCorPreenchimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCorPreenchimentoMouseClicked
    PL = true;
    atribuicoes();
}//GEN-LAST:event_panelCorPreenchimentoMouseClicked
 // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="botoes e definicoes">
private void btRetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetaActionPerformed
    if(btReta.isSelected() == true) {
        btElipse.setSelected(false);
        btPoligono.setSelected(false);
        btLapis.setSelected(false);
        btRetangulo.setSelected(false);
        btCirculo.setSelected(false);
    }
    btReta.setSelected(true);
    
    tipoFigura = 1;
    atribuicoes();
}//GEN-LAST:event_btRetaActionPerformed

private void btElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btElipseActionPerformed
    if(btElipse.isSelected() == true) {
        btLapis.setSelected(false);
        btPoligono.setSelected(false);
        btReta.setSelected(false);
        btRetangulo.setSelected(false);
        btCirculo.setSelected(false);
    }
    btElipse.setSelected(true);
    tipoFigura = 4;
    atribuicoes();
}//GEN-LAST:event_btElipseActionPerformed

private void btLapisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLapisActionPerformed
    if(btLapis.isSelected() == true) {
        btElipse.setSelected(false);
        btPoligono.setSelected(false);
        btReta.setSelected(false);
        btRetangulo.setSelected(false);
        btCirculo.setSelected(false);
    }
    btLapis.setSelected(true);
    tipoFigura = 0;
    atribuicoes();
}//GEN-LAST:event_btLapisActionPerformed

private void btRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetanguloActionPerformed
    if(btRetangulo.isSelected() == true) {
        btElipse.setSelected(false);
        btPoligono.setSelected(false);
        btReta.setSelected(false);
        btLapis.setSelected(false);
        btCirculo.setSelected(false);
    }
    btRetangulo.setSelected(true);
    tipoFigura = 3;
    atribuicoes();
}//GEN-LAST:event_btRetanguloActionPerformed

private void btPoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPoligonoActionPerformed
    if(btPoligono.isSelected() == true) {
        btElipse.setSelected(false);
        btLapis.setSelected(false);
        btReta.setSelected(false);
        btRetangulo.setSelected(false);
        btCirculo.setSelected(false);
    }
    btPoligono.setSelected(true);
    tipoFigura = 5;
    atribuicoes();
}//GEN-LAST:event_btPoligonoActionPerformed
 // </editor-fold>

private void MenuItemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNovoActionPerformed
    MDIDesenho novoDoc = new MDIDesenho(panelAreaDeTrabalho.getWidth(), panelAreaDeTrabalho.getHeight(), "teste", "hama");
    numDocumentos++;
    documentos.add(novoDoc);
    panelAreaDeTrabalho.add(novoDoc);
    btReta.setSelected(true);
    btElipse.setSelected(false);
    btPoligono.setSelected(false);
    btLapis.setSelected(false);
    btRetangulo.setSelected(false);
    btCirculo.setSelected(false);
    tipoFigura = 1;
    atribuicoes();
}//GEN-LAST:event_MenuItemNovoActionPerformed

// <editor-fold defaultstate="collapsed" desc="Cores">
private void pretoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretoActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(preto.getBackground());
    else panelCorLinha.setBackground(preto.getBackground());
    atribuicoes();
}//GEN-LAST:event_pretoActionPerformed

private void cinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinzaActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(cinza.getBackground());
    else panelCorLinha.setBackground(cinza.getBackground());
    atribuicoes();
}//GEN-LAST:event_cinzaActionPerformed

private void brancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brancoActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(branco.getBackground());
    else panelCorLinha.setBackground(branco.getBackground());
    atribuicoes();
}//GEN-LAST:event_brancoActionPerformed

private void roxoEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roxoEscuroActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(roxoEscuro.getBackground());
    else panelCorLinha.setBackground(roxoEscuro.getBackground());
    atribuicoes();
}//GEN-LAST:event_roxoEscuroActionPerformed

private void roxoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roxoActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(roxo.getBackground());
    else panelCorLinha.setBackground(roxo.getBackground());
    atribuicoes();
}//GEN-LAST:event_roxoActionPerformed

private void roxoClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roxoClaroActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(roxoClaro.getBackground());
    else panelCorLinha.setBackground(roxoClaro.getBackground());
    atribuicoes();
}//GEN-LAST:event_roxoClaroActionPerformed

private void azulEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulEscuroActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(azulEscuro.getBackground());
    else panelCorLinha.setBackground(azulEscuro.getBackground());
    atribuicoes();
}//GEN-LAST:event_azulEscuroActionPerformed

private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(azul.getBackground());
    else panelCorLinha.setBackground(azul.getBackground());
    atribuicoes();
}//GEN-LAST:event_azulActionPerformed

private void azulClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulClaroActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(azulClaro.getBackground());
    else panelCorLinha.setBackground(azulClaro.getBackground());
    atribuicoes();
}//GEN-LAST:event_azulClaroActionPerformed

private void verdeEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeEscuroActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(verdeEscuro.getBackground());
    else panelCorLinha.setBackground(verdeEscuro.getBackground());
    atribuicoes();
}//GEN-LAST:event_verdeEscuroActionPerformed

private void verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(verde.getBackground());
    else panelCorLinha.setBackground(verde.getBackground());
    atribuicoes();
}//GEN-LAST:event_verdeActionPerformed

private void verdeClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeClaroActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(verdeClaro.getBackground());
    else panelCorLinha.setBackground(verdeClaro.getBackground());
    atribuicoes();
}//GEN-LAST:event_verdeClaroActionPerformed

private void amareloEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amareloEscuroActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(amareloEscuro.getBackground());
    else panelCorLinha.setBackground(amareloEscuro.getBackground());
    atribuicoes();
}//GEN-LAST:event_amareloEscuroActionPerformed

private void amareloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amareloActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(amarelo.getBackground());
    else panelCorLinha.setBackground(amarelo.getBackground());
    atribuicoes();
}//GEN-LAST:event_amareloActionPerformed

private void amareloClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amareloClaroActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(amareloClaro.getBackground());
    else panelCorLinha.setBackground(amareloClaro.getBackground());
    atribuicoes();
}//GEN-LAST:event_amareloClaroActionPerformed

private void vermelhoEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermelhoEscuroActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(vermelhoEscuro.getBackground());
    else panelCorLinha.setBackground(vermelhoEscuro.getBackground());
    atribuicoes();
}//GEN-LAST:event_vermelhoEscuroActionPerformed

private void vermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermelhoActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(vermelho.getBackground());
    else panelCorLinha.setBackground(vermelho.getBackground());
    atribuicoes();
}//GEN-LAST:event_vermelhoActionPerformed

private void laranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laranjaActionPerformed
    if(PL == true) panelCorPreenchimento.setBackground(laranja.getBackground());
    else panelCorLinha.setBackground(laranja.getBackground());
    atribuicoes();
}//GEN-LAST:event_laranjaActionPerformed
// </editor-fold>

private void checkBoxPreencherStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkBoxPreencherStateChanged
    atribuicoes();
}//GEN-LAST:event_checkBoxPreencherStateChanged

private void MenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAbrirActionPerformed
    
}//GEN-LAST:event_MenuItemAbrirActionPerformed

private void MenuItemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSalvarActionPerformed

}//GEN-LAST:event_MenuItemSalvarActionPerformed

private void MenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSairActionPerformed

}//GEN-LAST:event_MenuItemSairActionPerformed

private void btCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCirculoActionPerformed
    if(btCirculo.isSelected() == true) {
        btElipse.setSelected(false);
        btPoligono.setSelected(false);
        btLapis.setSelected(false);
        btRetangulo.setSelected(false);
        btReta.setSelected(false);
    }
    btCirculo.setSelected(true);
    
    tipoFigura = 2;
    atribuicoes();
}//GEN-LAST:event_btCirculoActionPerformed

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

private void atribuicoes() {
    for(int i=0; i<documentos.size(); i++) {
        documentos.get(i).setConfig(panelCorLinha.getBackground(),
        panelCorPreenchimento.getBackground(),
        checkBoxPreencher.isSelected(),
        tipoFigura);
    }
}

// <editor-fold defaultstate="collapsed" desc="Variaveis">
    static JFrame App;
    static int numDocumentos = 0;
    private boolean PL = false;
    private int tipoFigura = 1;
    private List<MDIDesenho> documentos = new ArrayList<MDIDesenho>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemAbrir;
    private javax.swing.JMenu MenuItemAjuda;
    private javax.swing.JMenu MenuItemArquivo;
    private javax.swing.JMenuItem MenuItemHelp;
    private javax.swing.JMenuItem MenuItemNovo;
    private javax.swing.JMenuItem MenuItemSair;
    private javax.swing.JMenuItem MenuItemSalvar;
    private javax.swing.JMenuItem MenuItemSobre;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JSeparator MenuSeparador;
    private javax.swing.JLabel RotuloMensagem;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JButton amarelo;
    private javax.swing.JButton amareloClaro;
    private javax.swing.JButton amareloEscuro;
    private javax.swing.JButton azul;
    private javax.swing.JButton azulClaro;
    private javax.swing.JButton azulEscuro;
    private javax.swing.JButton branco;
    private javax.swing.JToggleButton btCirculo;
    private javax.swing.JToggleButton btElipse;
    private javax.swing.JToggleButton btLapis;
    private javax.swing.JToggleButton btPoligono;
    private javax.swing.JToggleButton btReta;
    private javax.swing.JToggleButton btRetangulo;
    private javax.swing.JCheckBox checkBoxPreencher;
    private javax.swing.JButton cinza;
    private javax.swing.JButton laranja;
    private javax.swing.JPanel panelAreaDeTrabalho;
    private javax.swing.JPanel panelCorLinha;
    private javax.swing.JPanel panelCorPreenchimento;
    private javax.swing.JButton preto;
    private javax.swing.JLabel rotuloL;
    private javax.swing.JLabel rotuloP;
    private javax.swing.JButton roxo;
    private javax.swing.JButton roxoClaro;
    private javax.swing.JButton roxoEscuro;
    private javax.swing.JButton verde;
    private javax.swing.JButton verdeClaro;
    private javax.swing.JButton verdeEscuro;
    private javax.swing.JButton vermelho;
    private javax.swing.JButton vermelhoEscuro;
    // End of variables declaration//GEN-END:variables
 // </editor-fold>

}
