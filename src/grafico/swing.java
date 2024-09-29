/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafico;

/**
 *
 * @author rex_a
 */

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.GridBagLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing extends Thread{
    private JButton boton = new JButton();
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    
    swing(){
        int ancho = 400;
        int alto = 300;
        
        boton.setText("Clic para cerrar la ventana");
        panel.setLayout(new GridBagLayout());
        panel.add(boton);
        frame.add(panel);
        
        frame.setSize(alto, ancho);
        frame.setVisible(true);
        
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                frame.dispose();
            }
        });
    }
}
