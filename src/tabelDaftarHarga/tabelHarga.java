/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelDaftarHarga;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import koneksi.config;
import transaksi.transaksi;

/**
 *
 * @author Riz
 */
public class tabelHarga extends javax.swing.JFrame {

    private String HARGABARANG;
    private String NAMABARANG;
    private String KODEBARANG;
    public transaksi t;

    /**
     * Creates new form tabelHarga
     */
    public tabelHarga() throws SQLException {
        initComponents();
        tampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelHargaLaundry = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        kembali = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelHargaLaundry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelHargaLaundry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelHargaLaundryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelHargaLaundry);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 190));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 510, 40));

        setSize(new java.awt.Dimension(528, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void tabelHargaLaundryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelHargaLaundryMouseClicked
        // TODO add your handling code here:
        int mouseKlik = tabelHargaLaundry.rowAtPoint(evt.getPoint());
        t.KODEBARANG = tabelHargaLaundry.getValueAt(mouseKlik, 0).toString();
        t.NAMABARANG = tabelHargaLaundry.getValueAt(mouseKlik, 1).toString();
        t.HARGABARANG = tabelHargaLaundry.getValueAt(mouseKlik, 2).toString();
        try {
            t.barangTerpilih();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(tabelHarga.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tabelHargaLaundryMouseClicked

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
            java.util.logging.Logger.getLogger(tabelHarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabelHarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabelHarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabelHarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new tabelHarga().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(tabelHarga.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    public javax.swing.JTable tabelHargaLaundry;
    // End of variables declaration//GEN-END:variables
public DefaultTableModel tableModel;
public String sql;
public tabelHarga tp = null;
public void tampilData() throws SQLException{
    tableModel = new DefaultTableModel();
    tableModel.addColumn("Kode Barang");
    tableModel.addColumn("Nama Barang");
    tableModel.addColumn("Harga");
    tabelHargaLaundry.setModel(tableModel);
    java.sql.Connection conn=(Connection)config.configDB();
    try{
        java.sql.Statement stm = conn.createStatement();
        sql ="SELECT * FROM daftar";
        java.sql.ResultSet res = stm.executeQuery(sql);
        while (res.next()){
            tableModel.addRow(new Object[]{
            res.getString("kodeb"),
            res.getString("barang"),
            res.getString("harga"),
          });
        }
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }

}

    private void barangTerpilih() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
