package vistas;

import controller.Controller;
import java.awt.CardLayout;
import productView.AddProduct;
import productView.SearchProduct;

/**
 *
 * @author aldri
 */
public class MainWindow extends javax.swing.JFrame {

    static CardLayout navegador;
    Login loginPanel;
    Home homePanel;
    //Product
    AddProduct addProdPanel;
    SearchProduct searchProd;

    public static Controller mainController = new Controller();

    public MainWindow() {
        initComponents();
        initFrames();
    }

    static public void navigate(String namePanel) {
        navegador.show(panelContainer, namePanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContainer = new javax.swing.JPanel();
        menuNavBar = new javax.swing.JMenuBar();
        prodMenuButton = new javax.swing.JMenu();
        addProdMenuButton = new javax.swing.JMenuItem();
        searchProdMenuButton = new javax.swing.JMenuItem();
        userMenuButton = new javax.swing.JMenu();
        homeMenuButton = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        panelContainer.setBackground(new java.awt.Color(153, 153, 153));
        panelContainer.setLayout(new java.awt.CardLayout());

        prodMenuButton.setText("Product");

        addProdMenuButton.setText("Agregar");
        addProdMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addProdMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdMenuButtonActionPerformed(evt);
            }
        });
        prodMenuButton.add(addProdMenuButton);

        searchProdMenuButton.setLabel("Buscar");
        searchProdMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProdMenuButtonActionPerformed(evt);
            }
        });
        prodMenuButton.add(searchProdMenuButton);

        menuNavBar.add(prodMenuButton);

        userMenuButton.setText("Users");
        menuNavBar.add(userMenuButton);

        homeMenuButton.setText("Home");
        homeMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuButtonActionPerformed(evt);
            }
        });
        menuNavBar.add(homeMenuButton);

        setJMenuBar(menuNavBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProdMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdMenuButtonActionPerformed
        navigate("AddProduct");
    }//GEN-LAST:event_addProdMenuButtonActionPerformed

    private void searchProdMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProdMenuButtonActionPerformed
        // TODO add your handling code here:
        navigate("searchProd");
    }//GEN-LAST:event_searchProdMenuButtonActionPerformed

    private void homeMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuButtonActionPerformed
        // TODO add your handling code here:
        navigate("Home");
    }//GEN-LAST:event_homeMenuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    private void initFrames() {
        showMenu(false);
        loginPanel = new Login();
        homePanel = new Home();
        addProdPanel = new AddProduct();
        searchProd = new SearchProduct();

        navegador = (CardLayout) panelContainer.getLayout();
        panelContainer.add(loginPanel, "Login");
        panelContainer.add(homePanel, "Home");
        panelContainer.add(addProdPanel, "AddProduct");
        panelContainer.add(searchProd, "searchProd");
    }

    public static void showMenu(boolean show) {
        menuNavBar.setVisible(show);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addProdMenuButton;
    private javax.swing.JMenu homeMenuButton;
    private static javax.swing.JMenuBar menuNavBar;
    private static javax.swing.JPanel panelContainer;
    private javax.swing.JMenu prodMenuButton;
    private javax.swing.JMenuItem searchProdMenuButton;
    private javax.swing.JMenu userMenuButton;
    // End of variables declaration//GEN-END:variables
}
