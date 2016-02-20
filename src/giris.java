
import java.awt.Color;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class giris extends javax.swing.JFrame {

    public giris() {
        initComponents();
        this.getContentPane().setBackground(Color.GREEN);
    }

    kayit kyt;
    home hm;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pw = new javax.swing.JLabel();
        kid_tf = new javax.swing.JTextField();
        kayit_buton = new javax.swing.JButton();
        kid = new javax.swing.JLabel();
        giris_buton = new javax.swing.JButton();
        pw_tf = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı Girişi");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(200, 200));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(30, 30));

        pw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pw.setText("Şifre :");

        kid_tf.setBackground(new java.awt.Color(204, 255, 255));
        kid_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        kayit_buton.setBackground(new java.awt.Color(204, 255, 255));
        kayit_buton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kayit_buton.setText("Kayıt Ol");
        kayit_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_butonActionPerformed(evt);
            }
        });

        kid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kid.setText("Kullanıcı Adı :");

        giris_buton.setBackground(new java.awt.Color(204, 255, 255));
        giris_buton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        giris_buton.setText("Giriş Yap");
        giris_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_butonActionPerformed(evt);
            }
        });

        pw_tf.setBackground(new java.awt.Color(204, 255, 255));
        pw_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setIcon(icon.login);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(giris_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kayit_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kid)
                            .addComponent(pw))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pw_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kid)
                            .addComponent(kid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pw_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pw)))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giris_buton)
                    .addComponent(kayit_buton))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayit_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_butonActionPerformed
        kyt = new kayit(this);
        kyt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kayit_butonActionPerformed

    private void giris_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_butonActionPerformed
        try {
            Veritabani.query = "SELECT id,sifre FROM OYUNCU WHERE kid='" + kid_tf.getText() + "'";
            Veritabani.db_stmt();
            if (Veritabani.rs.isBeforeFirst()) {
                while (Veritabani.rs.next()) {
                    String sifre = Veritabani.rs.getString("sifre");
                    if (String.valueOf(pw_tf.getPassword()).equals(sifre)) {
                        store.setId(Veritabani.rs.getInt("id"));
                        hm = new home(this);
                        hm.setVisible(true);
                        this.dispose();
                    } else {
                        String msg = "Girdiğiniz şifre yanlış. Lütfen tekrar deneyiniz.";
                        JOptionPane.showMessageDialog(new JFrame(), msg, "Hatalı Şifre", JOptionPane.WARNING_MESSAGE,icon.warning);
                    }

                }
                Veritabani.close_stmt();
            } else {
                String msg= "Girdiğiniz kullanıcı adına ait kayıt bulunamadı";
                JOptionPane.showMessageDialog(new JFrame(),msg,"Hata",JOptionPane.WARNING_MESSAGE,icon.warning);
            }

        } catch (SQLException e) {
            System.out.println("Error : " + e);
        }

    }//GEN-LAST:event_giris_butonActionPerformed

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
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris_buton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton kayit_buton;
    private javax.swing.JLabel kid;
    private javax.swing.JTextField kid_tf;
    private javax.swing.JLabel pw;
    private javax.swing.JPasswordField pw_tf;
    // End of variables declaration//GEN-END:variables
}
