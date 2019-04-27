/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author LEANDRO
 */
public class FramePrincipal extends javax.swing.JFrame {

    private DefaultComboBoxModel<String> infoComboBox;
    private int ultimaSelecao;
    private boolean controleRemocao;

    public FramePrincipal() {
        initComponents();
        carregaCidades();
        ultimaSelecao = 0;
        controleRemocao = true;
    }

    public void carregaCidades() {
        this.infoComboBox = new DefaultComboBoxModel<>();
        //criando um link de ligação entre o vetor que controla o combobox e o combobox do usuário
        this.cidades.setModel(infoComboBox);
        this.infoComboBox.addElement("Viçosa");
        this.infoComboBox.addElement("Urucânia");
        this.infoComboBox.addElement("Rio Casca");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cidades = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoTexto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cidades.setEditable(true);
        cidades.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cidades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cidadesItemStateChanged(evt);
            }
        });
        cidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cidadesMouseClicked(evt);
            }
        });

        campoTexto.setColumns(20);
        campoTexto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        campoTexto.setRows(5);
        campoTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTextoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTextoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(campoTexto);

        jLabel1.setText("Número de Caracteres:");

        contador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contador.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(cidades, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(cidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean verificaExistencia(DefaultComboBoxModel<String> model, String valor) {
        for (int i = 0; i < model.getSize(); i++) {
            if (model.getElementAt(i).equals(valor)) {
                return true;
            }
        }
        return false;
    }
    private void cidadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cidadesItemStateChanged
        if (controleRemocao == true) {
            controleRemocao = false;
        } else {
            controleRemocao = true;
        }
        if (this.cidades.getSelectedIndex() > 0) {
            this.ultimaSelecao = this.cidades.getSelectedIndex();
        }
        String novaInfo = (String) this.cidades.getSelectedItem();
        if (verificaExistencia(this.infoComboBox, novaInfo) == false && controleRemocao == true) {
            int indiceAlterado = this.ultimaSelecao;
            this.infoComboBox.removeElementAt(indiceAlterado);
            this.infoComboBox.insertElementAt(novaInfo, indiceAlterado);
        }
    }//GEN-LAST:event_cidadesItemStateChanged

    private void cidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cidadesMouseClicked

    }//GEN-LAST:event_cidadesMouseClicked

    private void campoTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoKeyPressed
        
    }//GEN-LAST:event_campoTextoKeyPressed

    private void campoTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoKeyReleased
        String texto = campoTexto.getText();
        if(texto.length() > 20){
            texto = texto.substring(0, 20);
            campoTexto.setText(texto);
        }
        contador.setText(texto.length() + "");
    }//GEN-LAST:event_campoTextoKeyReleased

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea campoTexto;
    private javax.swing.JComboBox<String> cidades;
    private javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
