/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pacman;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author ayoub
 */
public class Pacman {
    
    Screen screen = new Screen();
    
    
    public Pacman(){
        JFrame frame = new JFrame();
        frame.setSize(420,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(screen,BorderLayout.CENTER);
        frame.setTitle("Youssef Pacman");
        frame.setVisible(true);
        
        
        
    }

    public static void main(String[] args) {
        new Pacman();
        
    }
}
