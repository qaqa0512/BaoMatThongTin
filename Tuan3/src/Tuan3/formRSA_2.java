/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 *
 * @author Administrator
 */
public class formRSA_2 extends javax.swing.JFrame {

    /**
     * Creates new form formRSA_2
     */
    public formRSA_2() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBanro = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGiaima = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtBanma = new javax.swing.JTextArea();
        btnMahoa = new javax.swing.JButton();
        btnGiaima = new javax.swing.JButton();
        btnTaokhoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("RSA");

        jLabel2.setText("Bản rõ");

        txtBanro.setColumns(20);
        txtBanro.setRows(5);
        jScrollPane1.setViewportView(txtBanro);

        txtGiaima.setColumns(20);
        txtGiaima.setRows(5);
        jScrollPane2.setViewportView(txtGiaima);

        jLabel3.setText("Giải mã");

        jLabel4.setText("Bản mã");

        txtBanma.setColumns(20);
        txtBanma.setRows(5);
        jScrollPane3.setViewportView(txtBanma);

        btnMahoa.setText("Mã hóa");
        btnMahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMahoaActionPerformed(evt);
            }
        });

        btnGiaima.setText("Giải mã");
        btnGiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaimaActionPerformed(evt);
            }
        });

        btnTaokhoa.setText("Tạo Khóa");
        btnTaokhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaokhoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1)
                        .addGap(0, 235, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTaokhoa)
                                .addGap(83, 83, 83)
                                .addComponent(btnMahoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGiaima))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMahoa)
                        .addComponent(btnTaokhoa))
                    .addComponent(btnGiaima))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMahoaActionPerformed
        // TODO add your handling code here:
        try{
            String s = txtBanro.getText();
        FileInputStream f = new FileInputStream("D:\\Skey_RSA_pub.dat");
        ObjectInputStream b = new ObjectInputStream(f);
        RSAPublicKey pbk = (RSAPublicKey)b.readObject();
        BigInteger e = pbk.getPublicExponent();
        BigInteger n = pbk.getModulus();
        System.out.println("e="+e);
        System.out.println("n"+n);
        byte ptext[] = s.getBytes("UTF8");
        BigInteger m = new BigInteger(ptext);
        BigInteger c = m.modPow(e, n);
        System.out.println("c="+c);
        String cs = c.toString();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Enc_RSA.dat")));
        txtBanma.setText(cs);
        out.write(cs,0,cs.length());
        out.close(); 
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMahoaActionPerformed

    private void btnTaokhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaokhoaActionPerformed
        // TODO add your handling code here:
        try{
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
            kpg.initialize(1024);
            
            KeyPair kp = kpg.genKeyPair();
            PublicKey pbkey = kp.getPublic();
            PrivateKey prkey = kp.getPrivate();
        
            FileOutputStream f1 = new FileOutputStream("D:\\Skey_RSA_pub.dat");
            ObjectOutputStream b1 = new ObjectOutputStream(f1);
            b1.writeObject(pbkey);
        
            FileOutputStream f2 = new FileOutputStream("D:\\Skey_RSA_priv.dat");
            ObjectOutputStream b2 = new ObjectOutputStream(f2);
            b2.writeObject(prkey);
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTaokhoaActionPerformed

    private void btnGiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaimaActionPerformed
        // TODO add your handling code here:
        try{
            
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Enc_RSA.dat")));
        String ctext = in.readLine();
        BigInteger c = new BigInteger(ctext);
        FileInputStream f =new FileInputStream("D:\\Skey_RSA_priv.dat");
        ObjectInputStream b = new ObjectInputStream(f);
        RSAPrivateKey prk = (RSAPrivateKey)b.readObject();
        BigInteger d = prk.getPrivateExponent();
        BigInteger n =prk.getModulus();
        System.out.println("d="+d);
        System.out.println("n"+n);
        BigInteger m = c.modPow(d, n);
        System.out.println("m"+m);
        byte[] mt = m.toByteArray();
        String giaima = new String (mt, "UTF-8");
        txtGiaima.setText(giaima);
        System.out.println(giaima);
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGiaimaActionPerformed

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
            java.util.logging.Logger.getLogger(formRSA_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formRSA_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formRSA_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formRSA_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formRSA_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiaima;
    private javax.swing.JButton btnMahoa;
    private javax.swing.JButton btnTaokhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtBanma;
    private javax.swing.JTextArea txtBanro;
    private javax.swing.JTextArea txtGiaima;
    // End of variables declaration//GEN-END:variables
}
