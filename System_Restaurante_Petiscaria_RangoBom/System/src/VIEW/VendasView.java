package VIEW;

import controler.ProdutoController;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class VendasView extends javax.swing.JPanel {

    private JScrollPane painelTrocas;

    private DefaultComboBoxModel<String> infoComboBox;
    private int ultimaSelecao;
    private boolean controleRemocao;
    private String novaInfo;

    public VendasView() {
        initComponents();
        carregaPagamento();
        ultimaSelecao = 0;
        controleRemocao = true;
        novaInfo = "";
        this.painelTrocas = painelTrocas;
    }

    public VendasView(JScrollPane painelTrocas) {
        initComponents();
        this.painelTrocas = painelTrocas;
    }

    public void carregaPagamento() {
        this.infoComboBox = new DefaultComboBoxModel<>();
        //criando um link de ligação entre o vetor que controla o combobox e o combobox do usuário
        this.formaPgCombo.setModel(infoComboBox);
        this.infoComboBox.addElement("Dinheiro");
        this.infoComboBox.addElement("Cartão Débito");
        this.infoComboBox.addElement("Cartão Crédito");
        this.infoComboBox.addElement("Ticket");
    }

    public boolean verificaCampoCod() {
        if (codigoText.getText().isEmpty()) {
            this.codigoText.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se os campos da venda foram preenchidos!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    //chamado caso tenha problemas ao efetuar a venda. Limpa os campos para recomeçar 
    //(verificar na execução maiores finalidades
    public void limpaCampos() {
        codigoText.setText("");
        quantText.setText("");
        totalLabel2.setText("");
        //itensVendaList.removeAll(); nao removerá a lista apenas o item inserido
    }
    
    public boolean verificaCampos() {
        if (codigoText.getText().isEmpty()) {
            this.codigoText.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se os campos da venda foram preenchidos!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (quantText.getText().isEmpty()) {
            this.quantText.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se os campos da venda foram preenchidos!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    //evento ativado quando aperta a tecla 
    public void keyPressed(KeyEvent e) {
        boolean retorno = verificaCampoCod();

        if (retorno == false) {
            JOptionPane.showMessageDialog(this, "Verifique se o campo Código está preenchido!", "Erro de preenchimento!", JOptionPane.WARNING_MESSAGE);
        } else {
            //busca pelo código, conversão de texto para inteiro.
            int codigo = Integer.parseInt(codigoText.getText());
            ProdutoController.buscaProdutoCod(codigo);
            ..
        }
    }

    //responsável por verificar a opção selecionada pelo usuário
    /*public String retornoOpcaoPagamento(String evento){
        switch(evento){
            case "Dinheiro":
                return "Dinheiro";
                
            case "Cartão Débito":
                return "Cartão Débito";
                
            case "Cartão Crédito":
                return "Cartão Crédito";
                
            case "Ticket":
                return "Ticket";
                
            default:
                return "";
        }
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vendasLabel = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        codigoText = new javax.swing.JTextField();
        quantLabel = new javax.swing.JLabel();
        quantText = new javax.swing.JTextField();
        formaPgLabel = new javax.swing.JLabel();
        formaPgCombo = new javax.swing.JComboBox<>();
        confirmaButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itensVendaList = new javax.swing.JList<>();
        removerButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        totalLabel2 = new javax.swing.JLabel();
        exibNomeMercLabel = new javax.swing.JLabel();

        vendasLabel.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        vendasLabel.setText("Vendas");
        vendasLabel.setToolTipText("");

        codigoLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigoLabel.setText("Código:");

        codigoText.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextActionPerformed(evt);
            }
        });

        quantLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        quantLabel.setText("Quantidade:");

        quantText.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        formaPgLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        formaPgLabel.setText("Forma de Pagamento:");

        formaPgCombo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        formaPgCombo.setAutoscrolls(true);
        formaPgCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                formaPgComboItemStateChanged(evt);
            }
        });
        formaPgCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formaPgComboMouseClicked(evt);
            }
        });
        formaPgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formaPgComboActionPerformed(evt);
            }
        });

        confirmaButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        confirmaButton.setText("Confirmar");
        confirmaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        itensVendaList.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(itensVendaList);

        removerButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        removerButton.setText("Remover");

        totalLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        totalLabel.setText("Total:");

        totalLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        totalLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        exibNomeMercLabel.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(vendasLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confirmaButton)
                        .addGap(65, 65, 65)
                        .addComponent(cancelarButton)
                        .addGap(160, 160, 160)
                        .addComponent(removerButton)
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codigoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(exibNomeMercLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(totalLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(totalLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(quantLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(quantText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(formaPgLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(formaPgCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(49, 49, 49)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(vendasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoLabel)
                            .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exibNomeMercLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantLabel)
                            .addComponent(quantText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(totalLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(formaPgLabel)
                            .addComponent(formaPgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmaButton)
                            .addComponent(cancelarButton)
                            .addComponent(removerButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        this.painelTrocas.setViewportView(telaPrincipal);
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void confirmaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaButtonActionPerformed
        boolean retorno = verificaCampos();

        if (retorno != false) {
            JOptionPane.showMessageDialog(this, "Venda efetuada com sucesso!", "Venda Efetuada!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "As informações não foram preenchidas corretamente!", "Erro de Preenchimento!", JOptionPane.WARNING_MESSAGE);
            limpaCampos();
        }
    }//GEN-LAST:event_confirmaButtonActionPerformed

    private void formaPgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formaPgComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formaPgComboActionPerformed

    private void formaPgComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formaPgComboMouseClicked

    }//GEN-LAST:event_formaPgComboMouseClicked

    /*public boolean verificaExistencia(DefaultComboBoxModel<String> model, String valor) {
        for (int i = 0; i < model.getSize(); i++) {
            if (model.getElementAt(i).equals(valor)) {
                return true;
            }
        }
        return false;
    }*/
    private void formaPgComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_formaPgComboItemStateChanged
        if (controleRemocao == true) {
            controleRemocao = false;
        } else {
            controleRemocao = true;
        }
        //verifica se o índice selecionado é maior que 0
        if (this.formaPgCombo.getSelectedIndex() > 0) {
            this.ultimaSelecao = this.formaPgCombo.getSelectedIndex();
        }
        //armazena na variável o item selecionado
        novaInfo = (String) this.formaPgCombo.getSelectedItem();
        /*if (verificaExistencia(this.infoComboBox, novaInfo) == false && controleRemocao == true) {
            int indiceAlterado = this.ultimaSelecao;
            this.infoComboBox.removeElementAt(indiceAlterado);
            this.infoComboBox.insertElementAt(novaInfo, indiceAlterado);
        }*/
    }//GEN-LAST:event_formaPgComboItemStateChanged

    private void codigoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoText;
    private javax.swing.JButton confirmaButton;
    private javax.swing.JLabel exibNomeMercLabel;
    private javax.swing.JComboBox<String> formaPgCombo;
    private javax.swing.JLabel formaPgLabel;
    private javax.swing.JList<String> itensVendaList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel quantLabel;
    private javax.swing.JTextField quantText;
    private javax.swing.JButton removerButton;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalLabel2;
    private javax.swing.JLabel vendasLabel;
    // End of variables declaration//GEN-END:variables
}
