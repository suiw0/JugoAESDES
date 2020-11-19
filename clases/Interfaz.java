package clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() throws Exception {
        initComponents();
        jTextArea2.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea2.setLineWrap(true);
    }

    SecretKey key = KeyGenerator.getInstance("DES").generateKey();
    DES des = new DES(key);
    AES aes = new AES();
    
    byte[] hidden = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 120, 260, 87);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(300, 260, 260, 90);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jButton1.setText("Puchame para cifrar en DES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 180, 209, 23);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 11)); // NOI18N
        jButton2.setText("Descifración en DES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 220, 209, 23);

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 11)); // NOI18N
        jButton3.setText("Cifracion en AES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(50, 260, 209, 23);

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jButton4.setText("Puchame para descrifrar en AES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(50, 300, 209, 28);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(50, 130, 209, 20);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel1.setText("Aqui escribe la clave, pls");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 100, 128, 15);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 11)); // NOI18N
        jLabel2.setText("Entrada (Lo que desees cifrar)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 100, 154, 15);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel3.setText("Salida");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 240, 31, 15);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel4.setText("Cifrados AES (Advanced Encryption Standard) y DES (Data Encryption Standard)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 30, 546, 26);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/fondoooo.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 620, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cadena = jTextArea1.getText();
        try {
            String encryptedDES = des.encryptDES(cadena);
            jTextArea2.setText(encryptedDES);
        } catch (Exception ex) {
            jTextArea2.setText("No se pq no sé cifró, lloración");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String cadena = jTextArea1.getText();
        try {
            String decryptedDES = des.decryptDES(cadena);
            jTextArea2.setText(decryptedDES);
        } catch (Exception ex) {
            jTextArea2.setText("No se pq no sé descifró, lloración");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String cadena = jTextArea1.getText();
        String llave = jTextField1.getText();
        try {
            String encryptedAES = aes.encryptAES(llave, cadena);
            jTextArea2.setText(encryptedAES);
            hidden = aes.encryptAESHidden(llave, cadena);
        } catch (Exception ex) {
            jTextArea2.setText("La clave debe ser de 16, 24 o 32 caracteres");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String llave = jTextField1.getText();
        try {
            String decryptedAES = aes.decryptAES(llave, hidden);
            jTextArea2.setText(decryptedAES);
        } catch (Exception ex) {
            jTextArea2.setText("La clave debe ser de 16, 24 o 32 caracteres");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
