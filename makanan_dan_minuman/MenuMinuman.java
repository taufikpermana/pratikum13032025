package praktikum19062025;

public class MenuMinuman extends javax.swing.JFrame {

    private MenuUtama utama;
    
    public MenuMinuman() {
        initComponents();
    }
    
    public MenuMinuman(MenuUtama utama){
        this.utama = utama;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDaftarMinumAN = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        checkApel = new javax.swing.JCheckBox();
        checkMangga = new javax.swing.JCheckBox();
        checkJeruk = new javax.swing.JCheckBox();
        checkNaga = new javax.swing.JCheckBox();
        txtApel = new javax.swing.JTextField();
        txtMangga = new javax.swing.JTextField();
        txtJeruk = new javax.swing.JTextField();
        txtNaga = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbApel = new javax.swing.JComboBox<>();
        cbMangga = new javax.swing.JComboBox<>();
        cbJeruk = new javax.swing.JComboBox<>();
        cbNaga = new javax.swing.JComboBox<>();
        txtJmlApel = new javax.swing.JTextField();
        txtJmlMangga = new javax.swing.JTextField();
        txtJmlJeruk = new javax.swing.JTextField();
        txtJmlNaga = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelDaftarMinumAN.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        labelDaftarMinumAN.setText("DAFTAR MENU MINUMAN");

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));

        checkApel.setText("Jus apel");
        checkApel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkApelActionPerformed(evt);
            }
        });

        checkMangga.setText("Jus mangga");
        checkMangga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkManggaActionPerformed(evt);
            }
        });

        checkJeruk.setText("Jus jeruk");
        checkJeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkJerukActionPerformed(evt);
            }
        });

        checkNaga.setText("Jus naga");
        checkNaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNagaActionPerformed(evt);
            }
        });

        txtApel.setText("0");

        txtMangga.setText("0");

        txtJeruk.setText("0");

        txtNaga.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkApel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkMangga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkJeruk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkNaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNaga, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(txtJeruk)
                    .addComponent(txtMangga)
                    .addComponent(txtApel)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkApel)
                    .addComponent(txtApel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkMangga)
                    .addComponent(txtMangga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkJeruk)
                    .addComponent(txtJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkNaga)
                    .addComponent(txtNaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        cbApel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbApel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbApelActionPerformed(evt);
            }
        });

        cbMangga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbMangga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbManggaActionPerformed(evt);
            }
        });

        cbJeruk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbJeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJerukActionPerformed(evt);
            }
        });

        cbNaga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbNaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNagaActionPerformed(evt);
            }
        });

        txtJmlApel.setText("0");

        txtJmlMangga.setText("0");

        txtJmlJeruk.setText("0");

        txtJmlNaga.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbApel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMangga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtJmlApel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(txtJmlMangga)
                    .addComponent(txtJmlJeruk)
                    .addComponent(txtJmlNaga))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbApel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJmlApel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMangga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJmlMangga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJmlJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJmlNaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnTotal.setText("Total harga");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        txtTotal.setText("0");

        btnKembali.setText("Kembali Kemenu Utama");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(labelDaftarMinumAN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTotal)
                        .addGap(37, 37, 37)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset)
                            .addComponent(btnKembali))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDaftarMinumAN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali))
                .addGap(33, 33, 33)
                .addComponent(btnReset)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkApelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkApelActionPerformed
   txtApel.setText("10000");
    }//GEN-LAST:event_checkApelActionPerformed

    private void cbApelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbApelActionPerformed
    int jml = (int) cbApel.getSelectedIndex();
    double harga = Double.parseDouble(txtApel.getText());
    double total = jml*harga;
    txtJmlApel.setText(Double.toString(total));
    }//GEN-LAST:event_cbApelActionPerformed

    private void checkManggaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkManggaActionPerformed
    txtMangga.setText("11000");
    }//GEN-LAST:event_checkManggaActionPerformed

    private void checkJerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkJerukActionPerformed
    txtJeruk.setText("9000");
    }//GEN-LAST:event_checkJerukActionPerformed

    private void checkNagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNagaActionPerformed
    txtNaga.setText("15000");
    }//GEN-LAST:event_checkNagaActionPerformed

    private void cbManggaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbManggaActionPerformed
    int jml = (int) cbMangga.getSelectedIndex();
    double harga = Double.parseDouble(txtMangga.getText());
    double total = jml*harga;
    txtJmlMangga.setText(Double.toString(total));
    }//GEN-LAST:event_cbManggaActionPerformed

    private void cbJerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJerukActionPerformed
    int jml = (int) cbJeruk.getSelectedIndex();
    double harga = Double.parseDouble(txtJeruk.getText());
    double total = jml*harga;
    txtJmlJeruk.setText(Double.toString(total));
    }//GEN-LAST:event_cbJerukActionPerformed

    private void cbNagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNagaActionPerformed
    int jml = (int) cbNaga.getSelectedIndex();
    double harga = Double.parseDouble(txtNaga.getText());
    double total = jml*harga;
    txtJmlNaga.setText(Double.toString(total));
    }//GEN-LAST:event_cbNagaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    txtJmlApel.setText("0");
    txtJmlMangga.setText("0");
    txtJmlJeruk.setText("0");
    txtJmlNaga.setText("0");
    txtTotal.setText("0.0");
    cbApel.setSelectedIndex(0);
    cbMangga.setSelectedIndex(0);
    cbJeruk.setSelectedIndex(0);
    cbNaga.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
    double apel = Double.parseDouble(txtJmlApel.getText());
    double mangga = Double.parseDouble(txtJmlMangga.getText());
    double jeruk = Double.parseDouble(txtJmlJeruk.getText());
    double naga= Double.parseDouble(txtJmlNaga.getText());
    double total = apel + mangga + jeruk+ naga;
    txtTotal.setText(String.valueOf(total));
    
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
     String total = txtTotal.getText();
     utama.setTotalMinuman(total);
     this.dispose();
     
    }//GEN-LAST:event_btnKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuMinuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTotal;
    private javax.swing.JComboBox<String> cbApel;
    private javax.swing.JComboBox<String> cbJeruk;
    private javax.swing.JComboBox<String> cbMangga;
    private javax.swing.JComboBox<String> cbNaga;
    private javax.swing.JCheckBox checkApel;
    private javax.swing.JCheckBox checkJeruk;
    private javax.swing.JCheckBox checkMangga;
    private javax.swing.JCheckBox checkNaga;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelDaftarMinumAN;
    private javax.swing.JTextField txtApel;
    private javax.swing.JTextField txtJeruk;
    private javax.swing.JTextField txtJmlApel;
    private javax.swing.JTextField txtJmlJeruk;
    private javax.swing.JTextField txtJmlMangga;
    private javax.swing.JTextField txtJmlNaga;
    private javax.swing.JTextField txtMangga;
    private javax.swing.JTextField txtNaga;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
