package praktikum19062025;

import javax.swing.JOptionPane;


public class MenuUtama extends javax.swing.JFrame {

    public MenuUtama() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pelanggan = new javax.swing.JLabel();
        nomeja = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtmeja = new javax.swing.JTextField();
        btnmakanan = new javax.swing.JButton();
        btnminuman = new javax.swing.JButton();
        btntotal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        totalmakanan = new javax.swing.JLabel();
        totalminuman = new javax.swing.JLabel();
        totalharga = new javax.swing.JLabel();
        pajak = new javax.swing.JLabel();
        bayar = new javax.swing.JLabel();
        txtmakanan = new javax.swing.JTextField();
        txtminuman = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtpajak = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        btnselesai = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        uang = new javax.swing.JLabel();
        txtuang = new javax.swing.JTextField();
        btnkembalian = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtkembalian = new javax.swing.JTextField();
        kembalian = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("FORM PEMESANAN KANTIN ABC");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        pelanggan.setBackground(new java.awt.Color(0, 51, 51));
        pelanggan.setForeground(new java.awt.Color(0, 51, 51));
        pelanggan.setText("Nama Pelanggan");

        nomeja.setBackground(new java.awt.Color(255, 255, 255));
        nomeja.setForeground(new java.awt.Color(0, 51, 51));
        nomeja.setText("No Meja");

        btnmakanan.setText("Daftar Makanan");
        btnmakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmakananActionPerformed(evt);
            }
        });

        btnminuman.setText("Daftar Minuman");
        btnminuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminumanActionPerformed(evt);
            }
        });

        btntotal.setText("Total");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnminuman)
                    .addComponent(btnmakanan))
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pelanggan)
                            .addComponent(nomeja))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(txtmeja)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btntotal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pelanggan)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeja)
                    .addComponent(txtmeja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnmakanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnminuman)
                .addGap(18, 18, 18)
                .addComponent(btntotal)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        totalmakanan.setText("Total Makanan");

        totalminuman.setText("Total Minuman");

        totalharga.setText("Total Harga");

        pajak.setText("Pajak 10%");

        bayar.setText("Total Bayar");

        txtmakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmakananActionPerformed(evt);
            }
        });

        txtminuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtminumanActionPerformed(evt);
            }
        });

        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalmakanan)
                    .addComponent(totalminuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalharga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pajak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtminuman)
                    .addComponent(txtmakanan)
                    .addComponent(txtpajak)
                    .addComponent(txtharga)
                    .addComponent(txtbayar))
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalmakanan)
                    .addComponent(txtmakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalminuman)
                    .addComponent(txtminuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalharga)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pajak)
                    .addComponent(txtpajak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bayar)
                    .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        btnselesai.setText("Selesai");
        btnselesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselesaiActionPerformed(evt);
            }
        });

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        uang.setText("Total Uang");

        btnkembalian.setText("Hitung Kembalian");
        btnkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembalianActionPerformed(evt);
            }
        });

        kembalian.setText("Total Kembalian");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kembalian)
                    .addComponent(uang, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtuang, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 184, Short.MAX_VALUE)
                .addComponent(btnkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uang)
                    .addComponent(txtuang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnkembalian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembalian)
                    .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnselesai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnkeluar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnkeluar)
                            .addComponent(btnselesai)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        double totMakanan = Double.parseDouble(txtmakanan.getText());
        double totMinuman = Double.parseDouble(txtminuman.getText());
        double total = totMakanan+totMinuman;
        double pajak = total*0.1;
        double totalBayar = total+pajak;
        txtharga.setText(Double.toString(total));
        txtpajak.setText(Double.toString(pajak));
        txtbayar.setText(Double.toString(totalBayar));
    }//GEN-LAST:event_btntotalActionPerformed

    private void txtmakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmakananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmakananActionPerformed

    private void txtminumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtminumanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtminumanActionPerformed

    private void btnmakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmakananActionPerformed
    MenuMakanan frm = new MenuMakanan(this);
    frm.setVisible(true);
    }//GEN-LAST:event_btnmakananActionPerformed

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbayarActionPerformed

    private void btnminumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminumanActionPerformed
    MenuMinuman frm = new MenuMinuman (this);
    frm.setVisible(true);
    }//GEN-LAST:event_btnminumanActionPerformed

    private void btnkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembalianActionPerformed
    double uang = Double.parseDouble(txtuang.getText());
        double totalBayar = Double.parseDouble(txtbayar.getText());
        if (uang<totalBayar){
            double kurang =uang-totalBayar;
            JOptionPane.showMessageDialog(this,"Uang Pembayaran Kurang sebesar:"+kurang,"Warning",JOptionPane.INFORMATION_MESSAGE);
            }
        else{
            double kembalian = uang - totalBayar;
        txtkembalian.setText(Double.toString(kembalian));
        }
                       
    }//GEN-LAST:event_btnkembalianActionPerformed

    private void btnselesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselesaiActionPerformed
     if(txtnama.getText() == null || txtnama.getText().trim().isEmpty() ||
             txtmeja.getText() == null || txtmeja.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Nama dan meja harus diisi",
                    "Error",JOptionPane.INFORMATION_MESSAGE);
            txtnama.requestFocus();
        }
        else{
            if(txtharga.getText() == "0" || txtharga.getText()
                    == null || txtharga.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Belanja dulu yah:)",
                        "Error",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
            JOptionPane.showMessageDialog(this, "Nama Pelanggan: " + txtnama.getText()
                    + "\nMeja: " + txtmeja.getText()
                    + "\nTotal Makanan: " + txtmakanan.getText()
                    + "\nTotal Minuman: " + txtminuman.getText()
                    + "\nTotal Harga: " + txtharga.getText()
                    + "\nPajak 10%: " + txtpajak.getText()
                    + "\nTotal Bayar: " + txtbayar.getText() 
                    + "\nTotal Uang: " + txtuang.getText()
                    + "\nTotal Kembalian: " + txtkembalian.getText(),
                    "Success",JOptionPane.INFORMATION_MESSAGE);}}
    }//GEN-LAST:event_btnselesaiActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
    int confirm = JOptionPane.showConfirmDialog(
            this, 
            "Yakin ingin keluar?", 
            "Konfirmasi dulu saat Keluar", 
            JOptionPane.YES_NO_OPTION
        );
    
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);}
    }//GEN-LAST:event_btnkeluarActionPerformed

    public void setTotalMakanan(String nilai){
        txtmakanan.setText(nilai);
    }
     public void setTotalMinuman(String nilai){
        txtminuman.setText(nilai);
    }
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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bayar;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnkembalian;
    private javax.swing.JButton btnmakanan;
    private javax.swing.JButton btnminuman;
    private javax.swing.JButton btnselesai;
    private javax.swing.JButton btntotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel kembalian;
    private javax.swing.JLabel nomeja;
    private javax.swing.JLabel pajak;
    private javax.swing.JLabel pelanggan;
    private javax.swing.JLabel totalharga;
    private javax.swing.JLabel totalmakanan;
    private javax.swing.JLabel totalminuman;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkembalian;
    private javax.swing.JTextField txtmakanan;
    private javax.swing.JTextField txtmeja;
    private javax.swing.JTextField txtminuman;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtpajak;
    private javax.swing.JTextField txtuang;
    private javax.swing.JLabel uang;
    // End of variables declaration//GEN-END:variables
}
