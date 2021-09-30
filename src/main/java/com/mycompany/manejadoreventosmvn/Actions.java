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
public class Actions implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Generamos nuestro objeto button.
        JButton btn = (JButton) e.getSource();
        
        //Cambiamos el fondo del botón.
        btn.setBackground(Color.green);
        
        //Cambiamos color de la letra.
        btn.setForeground(Color.blue);
        
        //Cambiamos la fuente del texto.
        Font f = new Font("Verdana", Font.PLAIN, 18);
        btn.setFont(f);
        
        
        
        
    }
    
}
