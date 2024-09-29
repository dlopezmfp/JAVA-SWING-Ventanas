/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafico;

/**
 *
 * @author rex_a
 */

import java.awt.Toolkit;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Image;
 
import java.awt.GridBagLayout;
    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class awt extends Thread{
    private static final long serialVersionUID= 1L;
    
    private Button boton = new Button();
    private Panel panel = new Panel();
    private Frame frame = new Frame();
    
    public awt(){
        
        int ancho = 400;
        int alto = 300;
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        
        boton.setLabel("Botón para cerrar la ventana");
        panel.setLayout(new GridBagLayout());
        panel.add(boton);
        frame.setTitle("Ventana de prueba");
        frame.add(panel);
        frame.setSize(ancho,alto);
        frame.setLocation(200,500);
        
        try{
             Image imagen = pantalla.getImage("./src/hogar.png");
            frame.setIconImage(imagen);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
       
        frame.setVisible(true);
        
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                frame.dispose();
            }
        });
    }
}
    
