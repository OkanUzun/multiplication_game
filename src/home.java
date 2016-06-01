
import java.sql.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home(Login h) {
        initComponents();
        next.setVisible(false);
        panel.setVisible(false);
        timer = new Timer();
        timer.scheduleAtFixedRate(task, 0, 1000);
        login = h;
        //this.getContentPane().setBackground(Color.ORANGE);
        //panel.setBackground(Color.ORANGE);
    }

    private static Login login;
    private static Score score;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        soru_no_lbl = new javax.swing.JLabel();
        soru_lbl = new javax.swing.JLabel();
        cevap_lbl = new javax.swing.JLabel();
        cevap_tf = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        soru_sonuc_lbl = new javax.swing.JLabel();
        reply = new javax.swing.JButton();
        kalan_lb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        new_game = new javax.swing.JButton();
        last_games = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        soru_no_lbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        soru_no_lbl.setText("Soru No :");

        soru_lbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        soru_lbl.setText("Soru..");
        soru_lbl.setToolTipText("");

        cevap_lbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        cevap_lbl.setText("Cevap : ");

        cevap_tf.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N

        next.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        next.setText("Sonraki soru");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        soru_sonuc_lbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        soru_sonuc_lbl.setText("Doğrumu Yanlışmı");

        reply.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        reply.setText("Yanıtla");
        reply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replyActionPerformed(evt);
            }
        });

        kalan_lb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(cevap_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cevap_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(reply)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(soru_no_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(soru_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kalan_lb)
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(soru_sonuc_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(43, 43, 43))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soru_no_lbl)
                    .addComponent(soru_lbl)
                    .addComponent(kalan_lb))
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cevap_lbl)
                    .addComponent(cevap_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reply))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(soru_sonuc_lbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setText("ÇARPMA OYUNU");

        new_game.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        new_game.setText("YENİ OYUNA BAŞLA");
        new_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_gameActionPerformed(evt);
            }
        });

        last_games.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        last_games.setText("Geçmiş Oyunlarım");
        last_games.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_gamesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81)
                        .addComponent(new_game))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(last_games)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1))
                    .addComponent(new_game, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(last_games))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int soru_no;
    private int a, b;
    private int puan = 0;
    private boolean sure = false;
    private int seconds = 6;
    private int i = 0;
    private Timer timer;
    private String soru;
    private int cevap;
    private String msg;

    private void new_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_gameActionPerformed
        panel.setVisible(true);
        soru_no = 1;
        Random rand = new Random();
        a = rand.nextInt(8) + 3;
        b = rand.nextInt(8) + 3;
        soru_no_lbl.setText("Soru No : " + soru_no);
        soru = a + " ile " + b + "'nin çarpımı";
        cevap_tf.setText("");
        soru_lbl.setText(soru);
        cevap_tf.setEnabled(true);
        reply.setEnabled(true);
        next.setEnabled(false);
        next.setVisible(false);
        soru_sonuc_lbl.setEnabled(false);
        soru_sonuc_lbl.setVisible(false);
        kalan_lb.setVisible(true);
        sure = true;
        seconds = 6;
        i = 0;
        panel.getRootPane().setDefaultButton(reply);
        puan = 0;
        kalan_lb.setText("");
    }//GEN-LAST:event_new_gameActionPerformed

    private final TimerTask task = new TimerTask() {

        @Override
        public void run() {
            i++;
            if (sure == true) {
                if (i % seconds == 0) {
                    kalan_lb.setText("Zaman Bitti");
                    sure = false;
                    cevap_tf.setEnabled(false);
                    reply.setEnabled(false);
                    next.setVisible(true);
                    next.setEnabled(true);

                } else {
                    kalan_lb.setText("Kalan Zaman:" + (seconds - (i % seconds)));

                }
            }
        }
    };


    private void replyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replyActionPerformed
        cevap = a * b;
        if (!cevap_tf.getText().equals(Integer.toString(cevap))) {
            soru_sonuc_lbl.setText("Yanlış Cevap! Doğru Cevap : " + cevap);
            soru_sonuc_lbl.setEnabled(true);
            soru_sonuc_lbl.setVisible(true);
            next.setVisible(true);
            next.setEnabled(true);
            cevap_tf.setEnabled(false);
            reply.setEnabled(false);
            kalan_lb.setVisible(false);
            sure = false;
        } else {
            puan += 5;
            soru_sonuc_lbl.setText("Cevap Doğru");
            soru_sonuc_lbl.setEnabled(true);
            soru_sonuc_lbl.setVisible(true);
            next.setVisible(true);
            next.setEnabled(true);
            cevap_tf.setEnabled(false);
            reply.setEnabled(false);
            kalan_lb.setVisible(false);
            sure = false;

        }
        this.getRootPane().setDefaultButton(next);
    }//GEN-LAST:event_replyActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if (soru_no < 5) {
            i = 0;
            sure = true;
            cevap_tf.setText("");
            soru_sonuc_lbl.setEnabled(false);
            soru_sonuc_lbl.setVisible(false);
            soru_no++;
            Random rand = new Random();
            a = rand.nextInt(7) + 3;
            b = rand.nextInt(7) + 3;
            soru_no_lbl.setText("Soru No : " + soru_no);
            soru = a + " ile " + b + "'nin çarpımı";
            soru_lbl.setText(soru);
            cevap_tf.setEnabled(true);
            reply.setEnabled(true);
            next.setEnabled(false);
            next.setVisible(false);
            soru_sonuc_lbl.setEnabled(false);
            soru_sonuc_lbl.setVisible(false);
            kalan_lb.setText("");
            kalan_lb.setVisible(true);
            panel.getRootPane().setDefaultButton(reply);

        } else {
            try {
                Database.setQuery("INSERT INTO SKOR" + "(skor,o_id) " + "VALUES(?,?)");
                Database.db_prpstmt_update();
                Database.getPrpstmt().setInt(1, puan);
                Database.getPrpstmt().setInt(2, Store.getId());
                Database.getPrpstmt().executeUpdate();
                Database.close_prp_stmt();

            } catch (SQLException e) {
                System.out.println("Error : " + e);
            }

            panel.setVisible(false);
            msg = "Oyun bitti. Puanınız : " + puan;
            JOptionPane.showMessageDialog(new JFrame(), msg, "Sonucunuz", JOptionPane.INFORMATION_MESSAGE, Icon.getSCORE());

        }


    }//GEN-LAST:event_nextActionPerformed

    private void last_gamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_gamesActionPerformed
        score = new Score(this);
        score.setVisible(true);
    }//GEN-LAST:event_last_gamesActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cevap_lbl;
    private javax.swing.JTextField cevap_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kalan_lb;
    private javax.swing.JButton last_games;
    private javax.swing.JButton new_game;
    private javax.swing.JButton next;
    private javax.swing.JPanel panel;
    private javax.swing.JButton reply;
    private javax.swing.JLabel soru_lbl;
    private javax.swing.JLabel soru_no_lbl;
    private javax.swing.JLabel soru_sonuc_lbl;
    // End of variables declaration//GEN-END:variables
}
