
import java.awt.Color;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    public Register(Login h) {
        initComponents();
        lgn = h;
        this.getContentPane().setBackground(Color.ORANGE);
    }

    private Login lgn;
    private String msg;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kid = new javax.swing.JLabel();
        pw = new javax.swing.JLabel();
        kid_tf = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        pw_tf = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kullanıcı Kaydı");
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        kid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kid.setText("Kullanıcı Adı");

        pw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pw.setText("Şifre");

        kid_tf.setBackground(new java.awt.Color(204, 255, 255));
        kid_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        confirm.setBackground(new java.awt.Color(204, 255, 255));
        confirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm.setText("Onayla");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        pw_tf.setBackground(new java.awt.Color(204, 255, 255));
        pw_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setIcon(Icon.getADD());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kid, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pw))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(kid_tf)
                        .addComponent(pw_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kid)
                            .addComponent(kid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pw)
                            .addComponent(pw_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(confirm)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try {
            Database.setQuery("INSERT INTO OYUNCU" + "(kid,sifre) " + "VALUES(?,?)");
            Database.db_prpstmt();
            Database.getPrpstmt().setString(1, kid_tf.getText());
            Database.getPrpstmt().setString(2, String.valueOf(pw_tf.getPassword()));
            Database.getPrpstmt().executeUpdate();
            Database.close_prp_stmt();
        } catch (SQLException e) {

            if (e.getSQLState().startsWith("23")) {
                msg = "Bu kullanıcı adı kullanımda. Lütfen başka bir kullanıcı adı deneyiniz";
                JOptionPane.showMessageDialog(new JFrame(), msg, "Hata", JOptionPane.WARNING_MESSAGE, Icon.getWARNING());
            } else {
                System.out.println("Error : " + e);
            }
            return;
        }
        msg = "Kaydınız başarıyla tamamlanmıştır. Lütfen giriş yapınız.";
        JOptionPane.showMessageDialog(new JFrame(), msg, "Kaydınız Başarılı", JOptionPane.INFORMATION_MESSAGE, Icon.getSCORE());

        lgn.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_confirmActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new kayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kid;
    private javax.swing.JTextField kid_tf;
    private javax.swing.JLabel pw;
    private javax.swing.JPasswordField pw_tf;
    // End of variables declaration//GEN-END:variables
}
