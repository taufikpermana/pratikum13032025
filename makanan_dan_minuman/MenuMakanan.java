package praktikum19062025;

public class MenuMakanan extends javax.swing.JFrame {

    private MenuUtama utama;
    
    public MenuMakanan() {
        initComponents();
    }
    
    public MenuMakanan(MenuUtama utama){
        this.utama = utama;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbnasigoreng = new javax.swing.JCheckBox();
        cbmiegoreng = new javax.swing.JCheckBox();
        cbsateayam = new javax.swing.JCheckBox();
        cbsoto = new javax.swing.JCheckBox();
        txtnasigoreng = new javax.swing.JTextField();
        txtmiegoreng = new javax.swing.JTextField();
        txtsateayam = new javax.swing.JTextField();
        txtsoto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbnasgor = new javax.swing.JComboBox<>();
        cbmiegor = new javax.swing.JComboBox<>();
        cbsate = new javax.swing.JComboBox<>();
        cbsotoo = new javax.swing.JComboBox<>();
        txtnasgor = new javax.swing.JTextField();
        txtmiegor = new javax.swing.JTextField();
        txtsate = new javax.swing.JTextField();
        txtsotoo = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        btnharga = new javax.swing.JButton();
        txtharga = new javax.swing.JTextField();
        btnkembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setText("DAFTAR MENU MAKANAN");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        cbnasigoreng.setText("Nasi Goreng");
        cbnasigoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnasigorengActionPerformed(evt);
            }
        });

        cbmiegoreng.setText("Mie Goreng");
        cbmiegoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmiegorengActionPerformed(evt);
            }
        });

        cbsateayam.setText("Sate Ayam");
        cbsateayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsateayamActionPerformed(evt);
            }
        });

        cbsoto.setText("Soto");
        cbsoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsotoActionPerformed(evt);
            }
        });

        txtnasigoreng.setText("0");

        txtmiegoreng.setText("0");

        txtsateayam.setText("0");

        txtsoto.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbnasigoreng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbmiegoreng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbsateayam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbsoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsoto, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(txtsateayam)
                    .addComponent(txtmiegoreng)
                    .addComponent(txtnasigoreng)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbnasigoreng)
                    .addComponent(txtnasigoreng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmiegoreng)
                    .addComponent(txtmiegoreng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbsateayam)
                    .addComponent(txtsateayam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbsoto)
                    .addComponent(txtsoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        cbnasgor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbnasgor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnasgorActionPerformed(evt);
            }
        });

        cbmiegor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbmiegor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmiegorActionPerformed(evt);
            }
        });

        cbsate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbsate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsateActionPerformed(evt);
            }
        });

        cbsotoo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbsotoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsotooActionPerformed(evt);
            }
        });

        txtnasgor.setText("0");

        txtmiegor.setText("0");

        txtsate.setText("0");

        txtsotoo.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbnasgor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbmiegor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbsate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbsotoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnasgor, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(txtmiegor)
                    .addComponent(txtsate)
                    .addComponent(txtsotoo))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbnasgor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnasgor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmiegor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmiegor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbsate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbsotoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsotoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnharga.setText("Total harga");
        btnharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhargaActionPerformed(evt);
            }
        });

        txtharga.setText("0");

        btnkembali.setText("Kembali Kemenu Utama");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnharga)
                        .addGap(37, 37, 37)
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnreset)
                            .addComponent(btnkembali))
                        .addGap(86, 86, 86)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnharga)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkembali))
                .addGap(33, 33, 33)
                .addComponent(btnreset)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbnasigorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnasigorengActionPerformed
   txtnasigoreng.setText("18000");
    }//GEN-LAST:event_cbnasigorengActionPerformed

    private void cbnasgorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnasgorActionPerformed
    int jml = (int) cbnasgor.getSelectedIndex();
    double harga = Double.parseDouble(txtnasigoreng.getText());
    double total = jml*harga;
    txtnasgor.setText(Double.toString(total));
    }//GEN-LAST:event_cbnasgorActionPerformed

    private void cbmiegorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmiegorengActionPerformed
    txtmiegoreng.setText("15000");
    }//GEN-LAST:event_cbmiegorengActionPerformed

    private void cbsateayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsateayamActionPerformed
    txtsateayam.setText("13000");
    }//GEN-LAST:event_cbsateayamActionPerformed

    private void cbsotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsotoActionPerformed
    txtsoto.setText("12000");
    }//GEN-LAST:event_cbsotoActionPerformed

    private void cbmiegorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmiegorActionPerformed
    int jml = (int) cbmiegor.getSelectedIndex();
    double harga = Double.parseDouble(txtmiegoreng.getText());
    double total = jml*harga;
    txtmiegor.setText(Double.toString(total));
    }//GEN-LAST:event_cbmiegorActionPerformed

    private void cbsateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsateActionPerformed
    int jml = (int) cbsate.getSelectedIndex();
    double harga = Double.parseDouble(txtsateayam.getText());
    double total = jml*harga;
    txtsate.setText(Double.toString(total));   // TODO add your handling code here:
    }//GEN-LAST:event_cbsateActionPerformed

    private void cbsotooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsotooActionPerformed
    int jml = (int) cbsotoo.getSelectedIndex();
    double harga = Double.parseDouble(txtsoto.getText());
    double total = jml*harga;
    txtsotoo.setText(Double.toString(total));
    }//GEN-LAST:event_cbsotooActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
    txtnasgor.setText("0");
    txtmiegor.setText("0");
    txtsate.setText("0");
    txtsotoo.setText("0");
    txtharga.setText("0.0");
    cbnasgor.setSelectedIndex(0);
    cbmiegor.setSelectedIndex(0);
    cbsate.setSelectedIndex(0);
    cbsotoo.setSelectedIndex(0);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhargaActionPerformed
    double nasgor = Double.parseDouble(txtnasgor.getText());
    double miegor = Double.parseDouble(txtmiegor.getText());
    double sate = Double.parseDouble(txtsate.getText());
    double sotoo = Double.parseDouble(txtsotoo.getText());
    double total = nasgor + miegor + sate + sotoo;
    txtharga.setText(String.valueOf(total));
    
    }//GEN-LAST:event_btnhargaActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
     String total = txtharga.getText();
     utama.setTotalMakanan(total);
     this.dispose();
     
    }//GEN-LAST:event_btnkembaliActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnharga;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnreset;
    private javax.swing.JComboBox<String> cbmiegor;
    private javax.swing.JCheckBox cbmiegoreng;
    private javax.swing.JComboBox<String> cbnasgor;
    private javax.swing.JCheckBox cbnasigoreng;
    private javax.swing.JComboBox<String> cbsate;
    private javax.swing.JCheckBox cbsateayam;
    private javax.swing.JCheckBox cbsoto;
    private javax.swing.JComboBox<String> cbsotoo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtmiegor;
    private javax.swing.JTextField txtmiegoreng;
    private javax.swing.JTextField txtnasgor;
    private javax.swing.JTextField txtnasigoreng;
    private javax.swing.JTextField txtsate;
    private javax.swing.JTextField txtsateayam;
    private javax.swing.JTextField txtsoto;
    private javax.swing.JTextField txtsotoo;
    // End of variables declaration//GEN-END:variables
}
