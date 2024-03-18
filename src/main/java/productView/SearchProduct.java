
package productView;

import com.mycompany.puntodeventa.Classes.Product;
import javax.swing.table.DefaultTableModel;
import vistas.MainWindow;

/**
 *
 * @author aldri
 */
public class SearchProduct extends javax.swing.JPanel {

    public SearchProduct() {
        initComponents();
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        addProdButton = new javax.swing.JToggleButton();
        deleteProdButton = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();

        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        prodTable.getTableHeader().setReorderingAllowed(false);
        prodTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prodTable);

        addProdButton.setText("Add ");
        addProdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdButtonActionPerformed(evt);
            }
        });

        deleteProdButton.setText("Delete");
        deleteProdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProdButtonActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(deleteProdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addProdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(addProdButton)
                .addGap(18, 18, 18)
                .addComponent(deleteProdButton)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton3)
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteProdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProdButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteProdButtonActionPerformed

    private void addProdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addProdButtonActionPerformed

    private void prodTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_prodTableMouseClicked

    public static void fillTable() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"Name", "Quantity", "Price"};
        modelo.setColumnIdentifiers(columnas);
        for (Product p : MainWindow.mainController.getInventory()) {
            Object[] row = {p.getName(), p.getQuantity(), p.getPrice()};
            modelo.addRow(row);
        }
        prodTable.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addProdButton;
    private javax.swing.JToggleButton deleteProdButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton3;
    private static javax.swing.JTable prodTable;
    // End of variables declaration//GEN-END:variables
}
