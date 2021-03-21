/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Operacao;

/**
 *
 * @author administrador
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textPrimeiro = new javax.swing.JTextField();
        textSegundo = new javax.swing.JTextField();
        selectOperacao = new javax.swing.JComboBox<>();
        buttonCalcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();
        buttonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Calculadora Básica");

        jLabel2.setText("Primeiro Número");

        jLabel3.setText("Segundo Número");

        jLabel4.setText("Operação");

        textPrimeiro.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        textPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrimeiroActionPerformed(evt);
            }
        });
        textPrimeiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPrimeiroKeyTyped(evt);
            }
        });

        textSegundo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSegundoKeyTyped(evt);
            }
        });

        selectOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Adição", "Subtração", "Multiplicação", "Divisão" }));

        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(172, 172, 172));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setForeground(new java.awt.Color(1, 1, 1));

        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setText("Resultado:");

        labelResultado.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        labelResultado.setForeground(new java.awt.Color(1, 1, 1));
        labelResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelResultado.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPrimeiro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textSegundo)))
                    .addComponent(buttonCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selectOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonCalcular)
                .addGap(11, 11, 11)
                .addComponent(buttonLimpar)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrimeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrimeiroActionPerformed

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
//        // TODO add your handling code here:
//        String numero1 = textPrimeiro.getText();
//        String numero2 = textSegundo.getText();
//        //String textoOperacao = selectOperacao.getSelectedItem().toString();
//        int operacao = selectOperacao.getSelectedIndex();
//        int auxiliarOperacao = 0;
//        
//        switch(operacao){
//            case(0):
//                labelResultado.setText("Selecione uma operação!");
//                break;
//            case(1):
//                auxiliarOperacao = Integer.parseInt(numero1) + Integer.parseInt(numero2);
//                break;
//            case(2):
//                auxiliarOperacao = Integer.parseInt(numero1) - Integer.parseInt(numero2);
//                break;
//            case(3):
//                auxiliarOperacao = Integer.parseInt(numero1) * Integer.parseInt(numero2);
//                break;
//            case(4):
//                auxiliarOperacao = Integer.parseInt(numero1) / Integer.parseInt(numero2);
//                break;
//        }
//        labelResultado.setText("" + auxiliarOperacao);

        if (textPrimeiro.getText().equals("")) {
            labelResultado.setText("Insira o primeiro número!");
        } else if (selectOperacao.getSelectedIndex() == 0) {
            labelResultado.setText("Selecione a operação!");
        } else if (textSegundo.getText().equals("")) {
            labelResultado.setText("Insira o segundo número!");
        } else {
            int numero1 = Integer.parseInt(textPrimeiro.getText());
            int numero2 = Integer.parseInt(textSegundo.getText());
            int operacao = selectOperacao.getSelectedIndex();
            
            switch(operacao){
                case(1):
                    labelResultado.setText("" + Operacao.adicao(numero1, numero2));
                    break;
                case(2):
                    labelResultado.setText("" + Operacao.subtracao(numero1, numero2));
                    break;
                case(3):
                    labelResultado.setText("" + Operacao.multiplicacao(numero1, numero2));
                    break;
                case(4):
                    if(validaDivisao(numero2)) {
                        break;
                    };
                    
                    labelResultado.setText("" + Operacao.divisao(numero1, numero2));
                    break;
            }
        }
        

    }//GEN-LAST:event_buttonCalcularActionPerformed

    private void textPrimeiroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPrimeiroKeyTyped
        Principal.valida(evt);
    }//GEN-LAST:event_textPrimeiroKeyTyped

    private void textSegundoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSegundoKeyTyped
        Principal.valida(evt);
    }//GEN-LAST:event_textSegundoKeyTyped

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        textPrimeiro.setText("");
        selectOperacao.setSelectedIndex(0);
        textSegundo.setText("");
        labelResultado.setText("0");
    }//GEN-LAST:event_buttonLimparActionPerformed

    private static void valida(java.awt.event.KeyEvent evt) {
        String caracteres = "1234567890";
        
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }
    
    private boolean validaDivisao(int numero) {
        if (numero == 0) {
            labelResultado.setText("Não é possível divisão por zero!");
            return true;
        }
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JComboBox<String> selectOperacao;
    private javax.swing.JTextField textPrimeiro;
    private javax.swing.JTextField textSegundo;
    // End of variables declaration//GEN-END:variables
}