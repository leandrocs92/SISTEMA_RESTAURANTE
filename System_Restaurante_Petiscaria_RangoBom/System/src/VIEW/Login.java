package VIEW;

import controler.PessoaController;
import MODEL.Pessoa;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Login extends javax.swing.JPanel {

    private JScrollPane painelTrocas;

    public Login() {
        initComponents();
    }

    public Login(JScrollPane painelTrocas) {
        initComponents();
        this.painelTrocas = painelTrocas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        cpfText = new javax.swing.JTextField();
        entrarButton = new javax.swing.JButton();
        cadastrarButton = new javax.swing.JButton();
        recSenhaButton = new javax.swing.JButton();
        senhaPassword = new javax.swing.JPasswordField();

        loginLabel.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login");

        cpfLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cpfLabel.setText("CPF:");

        senhaLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        senhaLabel.setText("Senha:");

        cpfText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        entrarButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });

        cadastrarButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        recSenhaButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        recSenhaButton.setText("Recuperar Senha");
        recSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recSenhaButtonActionPerformed(evt);
            }
        });

        senhaPassword.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(entrarButton)
                                .addGap(40, 40, 40)
                                .addComponent(cadastrarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(recSenhaButton)))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(senhaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senhaPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpfLabel)
                        .addGap(18, 18, 18)
                        .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel)
                    .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel)
                    .addComponent(senhaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarButton)
                    .addComponent(cadastrarButton))
                .addGap(18, 18, 18)
                .addComponent(recSenhaButton)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        //verificando se os campos estão preenchidos
        if (!cpfText.getText().isEmpty() && senhaPassword.getText().isEmpty()) {
            //pegando as informações dos campos
            String cpf = cpfText.getText();
            String senha = senhaPassword.getText();
            //verificando se possui o usuário no banco de dados e se as informações de login estão corretas
            Pessoa novoUser = PessoaController.verificaUser(cpf, senha);
            if (novoUser != null) {
                VendasView telaVendas = new VendasView(novoUser, this.painelTrocas);
            } else {
                JOptionPane.showMessageDialog(null, "O usuário informado não está cadastrado no sistema.", "Usuário sem cadastro!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente, favor preenche-los.", "Campos vazios!", JOptionPane.ERROR_MESSAGE);
            if (cpfText.getText().isEmpty()) {
                this.cpfText.setBackground(Color.red);
            } else {
                this.senhaPassword.setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        CadastroFuncionario telaCadastro = new CadastroFuncionario(this.painelTrocas);
        this.painelTrocas.setViewportView(telaCadastro);
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void recSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recSenhaButtonActionPerformed
        RecuperaSenha telaRecupera = new RecuperaSenha(this.painelTrocas);
        this.painelTrocas.setViewportView(telaRecupera);
    }//GEN-LAST:event_recSenhaButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfText;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JButton recSenhaButton;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaPassword;
    // End of variables declaration//GEN-END:variables
}
