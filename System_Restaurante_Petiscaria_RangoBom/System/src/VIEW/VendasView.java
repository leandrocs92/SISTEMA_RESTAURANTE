package VIEW;

import controler.ProdutoController;
import MODEL.Produto;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class VendasView extends javax.swing.JPanel {

    private JScrollPane painelTrocas;

    private DefaultComboBoxModel<String> infoComboBox;
    private int ultimaSelecao;
    private boolean controleRemocao;
    private String novaInfo;
    private Vector produtosVendidos;
    private Produto produtoVenda;

    public VendasView() {
        initComponents();
        carregaPagamento();
        ultimaSelecao = 0;
        controleRemocao = true;
        novaInfo = "";
        this.painelTrocas = painelTrocas;
        produtosVendidos = new Vector();
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

    //evento ativado quando aperta a tecla enter
    public void keyPressed(KeyEvent e) {
        produtoVenda = null;
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean retorno = verificaCampoCod();
            if (retorno == false) {
                JOptionPane.showMessageDialog(this, "Verifique se o campo Código está preenchido!", "Erro de preenchimento!", JOptionPane.WARNING_MESSAGE);
                limpaCampos();
            } else {
                //busca pelo código, conversão de texto para inteiro.
                double codigo = Double.parseDouble(codigoText.getText());
                produtoVenda = ProdutoController.buscaProdutoCod(codigo);
                if(produtoVenda != null){
                    exibNomeMercLabel.setText(produtoVenda.getNome());
                }else{
                    //verificar a necessidade do Else
                    ..
                }
            }
        }
    }

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
        concluirButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itensVendaList = new javax.swing.JList<>();
        removerButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        totalLabel2 = new javax.swing.JLabel();
        exibNomeMercLabel = new javax.swing.JLabel();
        inserirLista = new javax.swing.JButton();

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

        concluirButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        concluirButton.setText("Concluir Venda");
        concluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirButtonActionPerformed(evt);
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

        exibNomeMercLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        inserirLista.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inserirLista.setText("Inserir");
        inserirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(vendasLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codigoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exibNomeMercLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(totalLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(quantLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(quantText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addComponent(inserirLista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(formaPgLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(formaPgCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(concluirButton)
                                    .addGap(43, 43, 43)
                                    .addComponent(cancelarButton))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removerButton)
                                .addGap(102, 102, 102)))))
                .addGap(45, 70, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inserirLista, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(totalLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(formaPgLabel)
                            .addComponent(formaPgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(concluirButton)
                            .addComponent(cancelarButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removerButton)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        this.painelTrocas.setViewportView(telaPrincipal);
    }//GEN-LAST:event_cancelarButtonActionPerformed
    //botão de concluir deverá verificar se a lista de produtos está vazia
    private void concluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirButtonActionPerformed
        boolean retorno = verificaCampos();
        if (retorno != false) {
            JOptionPane.showMessageDialog(this, "Venda efetuada com sucesso!", "Venda Efetuada!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "As informações não foram preenchidas corretamente!", "Erro de Preenchimento!", JOptionPane.WARNING_MESSAGE);
            limpaCampos();
        }
    }//GEN-LAST:event_concluirButtonActionPerformed

    private void formaPgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formaPgComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formaPgComboActionPerformed

    private void formaPgComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formaPgComboMouseClicked

    }//GEN-LAST:event_formaPgComboMouseClicked

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
        //armazena na variável o item selecionado - deverá ser inserida na contabilização de uma venda
        novaInfo = (String) this.formaPgCombo.getSelectedItem();
    }//GEN-LAST:event_formaPgComboItemStateChanged

    private void codigoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextActionPerformed

    private void inserirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirListaActionPerformed
        //inserir cada item da compra
        produtosVendidos.addElement(evt);
        itensVendaList.add(produtoVenda.getNome());
        //terminar
    }//GEN-LAST:event_inserirListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoText;
    private javax.swing.JButton concluirButton;
    private javax.swing.JLabel exibNomeMercLabel;
    private javax.swing.JComboBox<String> formaPgCombo;
    private javax.swing.JLabel formaPgLabel;
    private javax.swing.JButton inserirLista;
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
