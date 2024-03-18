/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.puntodeventa.Classes;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author aldri
 */
public class SearchTableSelectedRow implements ListSelectionListener {

    public void valueChanged(ListSelectionEvent e) {
        JTable tabla = (JTable) e.getSource();
        int indiceFila = tabla.getSelectedRow();
        JOptionPane.showMessageDialog(null, "Fila seleccionada: " + indiceFila);
    }
}
