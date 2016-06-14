
import java.sql.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    Timer myTimer;

    public Home(Login h) {
        initComponents();
        sonraki_soru.setVisible(false);
        panel.setVisible(false);
        //timer = new Timer();
        //timer.scheduleAtFixedRate(task, 0, 1000);
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
        sonraki_soru = new javax.swing.JButton();
        soru_sonuc_lbl = new javax.swing.JLabel();
        cevapla = new javax.swing.JButton();
        kalan_lb = new javax.swing.JLabel();
        form_baslik = new javax.swing.JLabel();
        yeni_oyun = new javax.swing.JButton();
        gecmis_oyunlar = new javax.swing.JButton();

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

        sonraki_soru.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        sonraki_soru.setText("Sonraki soru");
        sonraki_soru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonraki_soruActionPerformed(evt);
            }
        });

        soru_sonuc_lbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        soru_sonuc_lbl.setText("Doğrumu Yanlışmı");

        cevapla.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        cevapla.setText("Yanıtla");
        cevapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cevaplaActionPerformed(evt);
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
                        .addComponent(cevapla)
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
                .addComponent(sonraki_soru)
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
                    .addComponent(cevapla))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sonraki_soru)
                    .addComponent(soru_sonuc_lbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        form_baslik.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        form_baslik.setText("ÇARPMA OYUNU");

        yeni_oyun.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        yeni_oyun.setText("YENİ OYUNA BAŞLA");
        yeni_oyun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeni_oyunActionPerformed(evt);
            }
        });

        gecmis_oyunlar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        gecmis_oyunlar.setText("Geçmiş Oyunlarım");
        gecmis_oyunlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gecmis_oyunlarActionPerformed(evt);
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
                        .addComponent(form_baslik)
                        .addGap(81, 81, 81)
                        .addComponent(yeni_oyun))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(gecmis_oyunlar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(form_baslik))
                    .addComponent(yeni_oyun, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gecmis_oyunlar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static int soru_no;
    private static int sayi1, sayi2;
    private static int oyun_puan;
    private static boolean sure_kontrol = false;
    private final static int sure = 5;
    private static int i = 0;
    //private static Timer timer;
    private static String soru;
    private static String msj;
    private static Random sayi;

    private void yeni_oyunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeni_oyunActionPerformed
        myTimer = new Timer();
        myTimer.schedule(myTask, 0, 1000);
        panel.setVisible(true);
        soru_no = 1;
        soru_hazirla();
        yeni_soru_config();
        oyun_puan = 0;
    }//GEN-LAST:event_yeni_oyunActionPerformed

    private TimerTask myTask = new TimerTask() {

        @Override
        public void run() {
            i++;
            if (sure_kontrol == true) {
                if (i % sure == 0) {
                    zaman_bitti_config();
                } else {
                    kalan_lb.setText("Kalan Zaman:" + (sure - (i % sure)));

                }
            }
        }
    };


    private void cevaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cevaplaActionPerformed
        
        if ((sayi1 * sayi2) != Integer.parseInt(cevap_tf.getText())) {
            soru_sonuc_lbl.setText("Yanlış Cevap! Doğru Cevap : " + (sayi1 * sayi2));
        } else {
            oyun_puan += 5;
            soru_sonuc_lbl.setText("Cevap Doğru");

        }
        soru_sonuc_config();
        this.getRootPane().setDefaultButton(sonraki_soru);
    }//GEN-LAST:event_cevaplaActionPerformed

    private void sonraki_soruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonraki_soruActionPerformed
        myTask.cancel();
        if (soru_no < 5) {
            i = 0;
            sure_kontrol = true;
            cevap_tf.setText("");
            soru_sonuc_lbl.setEnabled(false);
            soru_sonuc_lbl.setVisible(false);
            soru_no++;
            soru_hazirla();
            yeni_soru_config();

        } else {
            try {
                Database.setQuery("INSERT INTO SKOR" + "(skor,o_id) " + "VALUES(?,?)");
                Database.db_prpstmt_update();
                Database.getPrpstmt().setInt(1, oyun_puan);
                Database.getPrpstmt().setInt(2, Store.getId());
                Database.getPrpstmt().executeUpdate();
                Database.close_prp_stmt();

            } catch (SQLException e) {
                System.out.println("Error : " + e);
            }

            panel.setVisible(false);
            msj = "Oyun bitti. Puanınız : " + oyun_puan;
            JOptionPane.showMessageDialog(new JFrame(), msj, "Sonucunuz", JOptionPane.INFORMATION_MESSAGE, Icon.getSCORE());
            myTask.cancel();

        }


    }//GEN-LAST:event_sonraki_soruActionPerformed

    private void gecmis_oyunlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gecmis_oyunlarActionPerformed
        score = new Score(this);
        score.setVisible(true);
    }//GEN-LAST:event_gecmis_oyunlarActionPerformed

    private void soru_hazirla() {
        sayi = new Random();
        sayi1 = sayi.nextInt(7) + 3;
        sayi2 = sayi.nextInt(7) + 3;
        soru_no_lbl.setText("Soru No : " + soru_no);
        soru = sayi1 + " ile " + sayi2 + "'nin çarpımı";
    }

    private void soru_sonuc_config() {
        soru_sonuc_lbl.setEnabled(true);
        soru_sonuc_lbl.setVisible(true);
        sonraki_soru.setVisible(true);
        sonraki_soru.setEnabled(true);
        cevap_tf.setEnabled(false);
        cevapla.setEnabled(false);
        kalan_lb.setVisible(false);
        sure_kontrol = false;
    }

    private void yeni_soru_config() {
        myTimer.schedule(myTask, 0, 1000);
        cevap_tf.setText("");
        soru_lbl.setText(soru);
        cevap_tf.setEnabled(true);
        cevapla.setEnabled(true);
        sonraki_soru.setEnabled(false);
        sonraki_soru.setVisible(false);
        soru_sonuc_lbl.setEnabled(false);
        soru_sonuc_lbl.setVisible(false);
        kalan_lb.setVisible(true);
        sure_kontrol = true;
        i = 0;
        panel.getRootPane().setDefaultButton(cevapla);
        kalan_lb.setText("");
    }

    private void zaman_bitti_config() {
        myTask.cancel();
        kalan_lb.setText("Zaman Bitti");
        sure_kontrol = false;
        cevap_tf.setEnabled(false);
        cevapla.setEnabled(false);
        sonraki_soru.setVisible(true);
        sonraki_soru.setEnabled(true);
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
    private javax.swing.JButton cevapla;
    private javax.swing.JLabel form_baslik;
    private javax.swing.JButton gecmis_oyunlar;
    private javax.swing.JLabel kalan_lb;
    private javax.swing.JPanel panel;
    private javax.swing.JButton sonraki_soru;
    private javax.swing.JLabel soru_lbl;
    private javax.swing.JLabel soru_no_lbl;
    private javax.swing.JLabel soru_sonuc_lbl;
    private javax.swing.JButton yeni_oyun;
    // End of variables declaration//GEN-END:variables
}
