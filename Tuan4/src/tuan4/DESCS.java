/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DESCS extends javax.swing.JFrame {

    /**
     * Creates new form DESCS
     */
    public DESCS() {
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

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtInputKey = new javax.swing.JTextField();
        btnMaHoa = new javax.swing.JButton();
        btnMoKhoaA = new javax.swing.JButton();
        btnMoKhoaB = new javax.swing.JButton();
        btnGhiFile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPlaintext = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCipherText = new javax.swing.JTextArea();
        btnGiaiMa = new javax.swing.JButton();
        btnAllShow = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Input Key:");

        btnMaHoa.setText("Mã Hóa");
        btnMaHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaActionPerformed(evt);
            }
        });

        btnMoKhoaA.setText("Mở Khóa A");
        btnMoKhoaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoKhoaAActionPerformed(evt);
            }
        });

        btnMoKhoaB.setText("Mở Khóa B");
        btnMoKhoaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoKhoaBActionPerformed(evt);
            }
        });

        btnGhiFile.setText("Ghi File");
        btnGhiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiFileActionPerformed(evt);
            }
        });

        jLabel2.setText("Plaintext:");

        txtPlaintext.setColumns(20);
        txtPlaintext.setRows(5);
        jScrollPane1.setViewportView(txtPlaintext);

        jLabel3.setText("CipherText:");

        txtCipherText.setColumns(20);
        txtCipherText.setRows(5);
        jScrollPane2.setViewportView(txtCipherText);

        btnGiaiMa.setText("Giải Mã");
        btnGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiMaActionPerformed(evt);
            }
        });

        btnAllShow.setText("All Show");
        btnAllShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtInputKey, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMaHoa)
                        .addGap(33, 33, 33)
                        .addComponent(btnMoKhoaA)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoKhoaB)
                        .addGap(18, 18, 18)
                        .addComponent(btnGhiFile))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGiaiMa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAllShow)
                                .addGap(14, 14, 14)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtInputKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMaHoa)
                    .addComponent(btnMoKhoaA)
                    .addComponent(btnMoKhoaB)
                    .addComponent(btnGhiFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGiaiMa)
                    .addComponent(btnAllShow))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaActionPerformed
        // TODO add your handling code here:
        try{
            String key = txtInputKey.getText();
            FileInputStream fis = new FileInputStream("D:\\Des.txt");
            FileOutputStream fos = new FileOutputStream("D:\\EnDes.txt");
            encrypt(key, fis, fos);
            JOptionPane.showMessageDialog(null,"Đã mã hóa văn bản");
        }catch(Throwable e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMaHoaActionPerformed

    private void btnMoKhoaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoKhoaAActionPerformed
        // TODO add your handling code here:
        try{
            BufferedReader br = null;
            String fileName = "D:\\KhoaA.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null,"Đã mở File");
            char[] ca = new char[5];
            while(br.ready()){
                int len = br.read(ca);
                sb.append(ca,0,len);
            }
            br.close();
            System.out.println("Du lieu la:"+" "+sb);
            String chuoi = sb.toString();
            
            txtInputKey.setText(chuoi);
        }catch(IOException ex){
            Logger.getLogger(DESCS.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btnMoKhoaAActionPerformed

    private void btnMoKhoaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoKhoaBActionPerformed
        // TODO add your handling code here:
        try{
            BufferedReader br = null;
            String fileName = "D:\\KhoaB.txt";
            br = new BufferedReader (new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            
            JOptionPane.showMessageDialog(null,"Đã mở File");
            char[] ca = new char[5];
            while(br.ready()){
                int len = br.read(ca);
                sb.append(ca,0,len);
            }
            br.close();
            System.out.println("Du lieu la :"+" "+sb);
            String chuoi = sb.toString();
            txtInputKey.setText(chuoi);
        }catch(IOException ex){
            Logger.getLogger(DESCS.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btnMoKhoaBActionPerformed

    private void btnGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiFileActionPerformed
        // TODO add your handling code here:
       try{
        BufferedWriter bw = null;
        String fileName = "D:\\Des.txt";
        String s = txtPlaintext.getText();
        bw = new BufferedWriter (new FileWriter(fileName));
        bw.write(s);
        bw.close();
        JOptionPane.showMessageDialog(null,"Đã ghi File");
        txtCipherText.setText(s);
       }catch(IOException ex){
            Logger.getLogger(DESCS.class.getName()).log(Level.SEVERE,null,ex);
       }
    }//GEN-LAST:event_btnGhiFileActionPerformed

    private void btnGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiMaActionPerformed
        // TODO add your handling code here:
        FileInputStream fis2 = null;
        try{
            String key = txtInputKey.getText();
            fis2 = new FileInputStream("D:\\EnDes.txt");
            FileOutputStream fos2 = new FileOutputStream("D:\\DeDes.txt");
            decrypt(key,fis2, fos2);
            BufferedReader br = null;
            String fileName = "D:\\DeDes.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null,"Đã Giải Mã");
            char[] ca = new char[5];
            while(br.ready()){
                int len = br.read(ca);
                sb.append(ca,0,len);
            }
            br.close();
            System.out.println("Du lieu la :"+ " "+sb);
            String chuoi = sb.toString();
            txtCipherText.setText(chuoi);
        }catch(Throwable ex) {}
    }//GEN-LAST:event_btnGiaiMaActionPerformed

    private void btnAllShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllShowActionPerformed
        // TODO add your handling code here:
        try{
            BufferedReader br = null;
            String fileName = "D:\\DeDes.txt";
            br = new BufferedReader (new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null,"Đã mở File");
            char[] ca = new char[5];
            while(br.ready()){
                int len = br.read(ca);
                sb.append(ca,0,len);
            }
            br.close();
            String ff = "D:\\EnDes.txt";
            br = new BufferedReader(new FileReader(ff));
            StringBuffer sb1 = new StringBuffer();
            char[] ca1 = new char[5];
            while(br.ready()){
                int len = br.read(ca1);
                sb1.append(ca1,0,len);
            }
            System.out.println("Du lieu la: "+" "+sb);
            String chuoi = sb.toString();
            String chuoi1 = sb1.toString();
            txtPlaintext.setText(chuoi);
            txtCipherText.setText(chuoi1);
        }catch(IOException ex){}
    }//GEN-LAST:event_btnAllShowActionPerformed
public static void encrypt(String key, InputStream is, OutputStream os) throws Throwable {
		encryptOrDecrypt(key, Cipher.ENCRYPT_MODE, is, os);
	}

	public static void decrypt(String key, InputStream is, OutputStream os) throws Throwable {
		encryptOrDecrypt(key, Cipher.DECRYPT_MODE, is, os);
	}

	public static void encryptOrDecrypt(String key, int mode, InputStream is, OutputStream os) throws Throwable {

		DESKeySpec dks = new DESKeySpec(key.getBytes());
		SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
		SecretKey desKey = skf.generateSecret(dks);
		Cipher cipher = Cipher.getInstance("DES"); // DES/ECB/PKCS5Padding for SunJCE

		if (mode == Cipher.ENCRYPT_MODE) {
			cipher.init(Cipher.ENCRYPT_MODE, desKey);
			CipherInputStream cis = new CipherInputStream(is, cipher);
			doCopy(cis, os);
		} else if (mode == Cipher.DECRYPT_MODE) {
			cipher.init(Cipher.DECRYPT_MODE, desKey);
			CipherOutputStream cos = new CipherOutputStream(os, cipher);
			doCopy(is, cos);
		}
	}

	public static void doCopy(InputStream is, OutputStream os) throws IOException {
		byte[] bytes = new byte[64];
		int numBytes;
		while ((numBytes = is.read(bytes)) != -1) {
			os.write(bytes, 0, numBytes);
		}
		os.flush();
		os.close();
		is.close();
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
            java.util.logging.Logger.getLogger(DESCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DESCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DESCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DESCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DESCS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllShow;
    private javax.swing.JButton btnGhiFile;
    private javax.swing.JButton btnGiaiMa;
    private javax.swing.JButton btnMaHoa;
    private javax.swing.JButton btnMoKhoaA;
    private javax.swing.JButton btnMoKhoaB;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtCipherText;
    private javax.swing.JTextField txtInputKey;
    private javax.swing.JTextArea txtPlaintext;
    // End of variables declaration//GEN-END:variables
}
