/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads3a.grupo1.views;

import br.sp.senac.tads3a.grupo1.controllers.VendaController;
import br.sp.senac.tads3a.grupo1.models.Cliente;
import br.sp.senac.tads3a.grupo1.models.Funcionario;
import br.sp.senac.tads3a.grupo1.models.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class VendaView extends javax.swing.JFrame {

    public VendaView() {
        initComponents();

        ArrayList<Produto> produtos = VendaController.buscarProdutos();
        for (Produto produto : produtos) {
            jcbPastel.addItem(String.valueOf(produto.getProdutoId()) + " | " + produto.getDescricao() + " | R$ " + produto.getPreco());
        }
        AutoCompleteDecorator.decorate(jcbPastel);

        ArrayList<Cliente> clientes = VendaController.buscarClientes();
        for (Cliente cliente : clientes) {
            jcbCliente.addItem(String.valueOf(cliente.getClienteId()) + " | " + cliente.getNome());
        }
        AutoCompleteDecorator.decorate(jcbCliente);

        ArrayList<Funcionario> funcionarios = VendaController.buscarFuncionarios();
        for (Funcionario funcionario : funcionarios) {
            jcbFuncionario.addItem(String.valueOf(funcionario.getFuncionarioId()) + " | " + funcionario.getNome());
        }
        AutoCompleteDecorator.decorate(jcbFuncionario);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>();
        btnConfirm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jcbPastel = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcbFuncionario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        jLabel1.setText("Venda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jcbCliente.setEditable(true);
        jcbCliente.setOpaque(false);

        btnConfirm.setBackground(new java.awt.Color(255, 255, 153));
        btnConfirm.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        btnConfirm.setText("Comprar");
        btnConfirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnConfirm.setContentAreaFilled(false);
        btnConfirm.setOpaque(true);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel5.setText("Selecione o cliente *");

        jLabel8.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel8.setText("Selecione o produto *");

        jcbPastel.setEditable(true);
        jcbPastel.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel6.setText("Selecione o vendedor *");

        jcbFuncionario.setEditable(true);
        jcbFuncionario.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbPastel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPastel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        //Pega o valor do ID do CB
        String id_clienteS = jcbCliente.getSelectedItem().toString();
        //Transforma o valor em inteiro
        int id_cliente = Integer.parseInt(id_clienteS.substring(0, id_clienteS.indexOf(" ")));

        //Pega o valor do ID do CB
        String id_produtoS = jcbPastel.getSelectedItem().toString();
        //Transforma o valor em inteiro
        int id_produto = Integer.parseInt(id_produtoS.substring(0, id_produtoS.indexOf(" ")));

        //Pega o valor do ID do CB
        String id_funcionarioS = jcbFuncionario.getSelectedItem().toString();
        //Transforma o valor em inteiro
        int id_funcionario = Integer.parseInt(id_funcionarioS.substring(0, id_funcionarioS.indexOf(" ")));

        float valor = Float.parseFloat(id_produtoS.substring(id_produtoS.indexOf("$") + 1, id_produtoS.length()).trim());

        float valor = Float.parseFloat(id_produtoS.substring(id_produtoS.indexOf("$")+1, id_produtoS.length()).trim());


        if (VendaController.vendaVender(valor, id_cliente, id_produto, id_funcionario)) {
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso !");
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao registrar a venda");
            dispose();
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbFuncionario;
    private javax.swing.JComboBox<String> jcbPastel;
    // End of variables declaration//GEN-END:variables
}
