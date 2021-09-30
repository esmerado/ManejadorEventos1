/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manejadoreventosmvn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author esmer
 */
public class Actions2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Generamos nuestro objeto button.
        JButton btn2 = (JButton) e.getSource();
        
        //Cambiamos el fondo del botón.
        btn2.setBackground(Color.DARK_GRAY);
        
        //Cambiamos color de la letra.
        btn2.setForeground(Color.pink);
        
        //Cambiamos la fuente del texto.
        Font f = new Font("Tahoma", Font.BOLD, 18);
        btn2.setFont(f);
        
    }
    
}
