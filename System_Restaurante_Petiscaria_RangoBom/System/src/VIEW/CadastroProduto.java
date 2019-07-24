package VIEW;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public class CadastroProduto extends javax.swing.JFrame {

    private JScrollPane painelTrocas;
    
    public CadastroProduto() {
        initComponents();
    }
    public CadastroProduto(JScrollPane painelTrocas){
        initComponents();
        this.painelTrocas = painelTrocas;
    }
    
    //verifica se os campos obrigatórios foram preenchidos corretamente
    
    public boolean verificaCampos(){
        if(codigoMercText.getText().isEmpty()){
            this.codigoMercText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique o preenchimento dos campos obrigatórios!", "Erro de preenchimento.", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(nomeText.getText().isEmpty()){
            this.nomeText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique o preenchimento dos campos obrigatórios!", "Erro de preenchimento.", JOptionPane.WARNING_MESSAGE);
            return false;    
        }
        if(tipoMercText.getText().isEmpty()){
            this.tipoMercText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique o preenchimento dos campos obrigatórios!","Erro de preenchimento",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(fornecedorText.getText().isEmpty()){
            this.fornecedorText.getText().isEmpty();
            JOptionPane.showMessageDialog(this, "Verifique o preenchimento dos campos obrigatórios!", "Erro de preenchimento.", JOptionPane.WARNING_MESSAGE);
            return false;        
        }
         if(quantCompradaText.getText().isEmpty()){
            this.quantCompradaText.getText().isEmpty();
            JOptionPane.showMessageDialog(this, "Verifique o preenchimento dos campos obrigatórios!", "Erro de preenchimento.", JOptionPane.WARNING_MESSAGE);
            return false;        
        }
          if(precoCustoText.getText().isEmpty()){
            this.precoCustoText.getText().isEmpty();
            JOptionPane.showMessageDialog(this, "Verifique o preenchimento dos campos obrigatórios!", "Erro de preenchimento.", JOptionPane.WARNING_MESSAGE);
            return false;        
        }
           if(precoVendaText.getText().isEmpty()){
            this.precoVendaText.getText().isEmpty();
            JOptionPane.showMessageDialog(this, "Verifique o preenchimento dos campos obrigatórios!", "Erro de preenchimento.", JOptionPane.WARNING_MESSAGE);
            return false;        
        }
            if(quantMinEstoque.getText().isEmpty()){
            this.quantMinEstoque.getText().isEmpty();
            JOptionPane.showMessageDialog(this, "Verifique o preenchimento dos campos obrigatórios!", "Erro de preenchimento.", JOptionPane.WARNING_MESSAGE);
            return false;        
        }
        return true;
    }
    
    public void limpaCampos(){
        codigoMercText.setText("");
        nomeText.setText("");
        tipoMercText.setText("");
        fornecedorText.setText("");
        quantCompradaText.setText("");
        precoCustoText.setText("");
        precoVendaText.setText("");
        quantMinEstoque.setText("");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tipoMercText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        codigoMercText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fornecedorText = new javax.swing.JTextField();
        precoCustoText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        quantCompradaText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        precoVendaText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        quantMinEstoque = new javax.swing.JTextField();
        cadastrarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel1.setText("Cadastro de Produto");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel2.setText("Nome:");

        nomeText.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        nomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel3.setText("Tipo de Mercadoria:");

        tipoMercText.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel4.setText("Código:");

        codigoMercText.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel5.setText("Fonecedor:");

        fornecedorText.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N

        precoCustoText.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel6.setText("Preço Custo:");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel7.setText("Quantidade Comprada:");

        quantCompradaText.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel8.setText("Preço Venda:");

        precoVendaText.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel9.setText("Quantidade Min. Estoque:");

        quantMinEstoque.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N

        cadastrarButton.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoMercText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigoMercText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fornecedorText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantCompradaText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(precoVendaText))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(precoCustoText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantMinEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(173, 173, 173)
                            .addComponent(cadastrarButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelarButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(324, 324, 324)
                            .addComponent(jLabel1))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(codigoMercText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tipoMercText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fornecedorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(quantCompradaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(precoCustoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(precoVendaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(quantMinEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        this.painelTrocas.setViewportView(telaPrincipal);
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        //chamar verificação de campos
        boolean retorno = verificaCampos();
        if(!retorno){
            JOptionPane.showMessageDialog(this, "Não foi possível efetuar o cadastro do produto!", "Erro de cadastro", JOptionPane.WARNING_MESSAGE);
        } else{
            ..
        }
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField codigoMercText;
    private javax.swing.JTextField fornecedorText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField precoCustoText;
    private javax.swing.JTextField precoVendaText;
    private javax.swing.JTextField quantCompradaText;
    private javax.swing.JTextField quantMinEstoque;
    private javax.swing.JTextField tipoMercText;
    // End of variables declaration//GEN-END:variables
}
