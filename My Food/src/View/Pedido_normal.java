
import java.util.ArrayList;
import models.Product;
import static controllers.Products_controller.showlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joaquim Monteiro
 */
public class Pedido_normal extends javax.swing.JFrame {

    /**
     * Creates new form Pedido_normal
     */
    public Pedido_normal() {
    initComponents();
    ArrayList<Product> products = new ArrayList<Product>();
    products.add(new Product("pizza", 700));
    products.add(new Product("humburger", 150));
    products.add(new Product("crepes", 100));
    products.add(new Product("prato do dia", 250));
    products.add(new Product("mousse", 170));
    products.add(new Product("sandwich", 100));
    products.add(new Product("batata frita", 100));
    products.add(new Product("hot dog", 150));
    products.add(new Product("pasteis", 10));
    products.add(new Product("cachupa", 200));
    
    String[] names = new String[products.size()];
   
   for (int i = 0; i < products.size(); i++) {
    names[i] = products.get(i).getname();
     // System.out.println(products.get(i).getname());
    }
   
  //String[] teste;
   //     teste = new String[showlist()];
   jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>( names));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pedido1 = new javax.swing.JTextField();
        voltar2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        registar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Faça o seu pedido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 320, 40));

        jLabel3.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Faça a sua escolha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantidade:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        pedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedido1ActionPerformed(evt);
            }
        });
        getContentPane().add(pedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 240, 30));

        voltar2.setBackground(new java.awt.Color(255, 255, 255));
        voltar2.setFont(new java.awt.Font("Ravie", 3, 14)); // NOI18N
        voltar2.setText("Voltar");
        voltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar2ActionPerformed(evt);
            }
        });
        getContentPane().add(voltar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 240, 30));

        registar1.setFont(new java.awt.Font("Ravie", 3, 14)); // NOI18N
        registar1.setText("Registar");
        registar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registar1ActionPerformed(evt);
            }
        });
        getContentPane().add(registar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 453));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar2ActionPerformed
        Tipo_Pedido voltar_2 = new Tipo_Pedido();
        voltar_2.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltar2ActionPerformed

    private void registar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registar1ActionPerformed
        registar_pedido regist1 = new registar_pedido("pizza" ,78);
        regist1.setVisible(true);
        dispose();
    }//GEN-LAST:event_registar1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void pedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedido1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pedido_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Pedido_normal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField pedido1;
    private javax.swing.JButton registar1;
    private javax.swing.JButton voltar2;
    // End of variables declaration//GEN-END:variables
}
