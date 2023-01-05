/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pacman;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author ayoub
 */
public class Game implements KeyListener{
    
    Screen screen = new Screen();
    Timer timer;
    char direction = 'L';
    boolean flag = true;
    
    
    
    public Game() {
        JFrame frame = new JFrame();
        frame.setSize(420,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(screen,BorderLayout.CENTER);
        frame.setTitle("Youssef Pacman");
        frame.setVisible(true);
        frame.addKeyListener(this);
        timer = new Timer(30, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!screen.title){
                    if(flag){
                        
                        try {
                            Thread.sleep(2000);
                            flag = false;
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                    screen.ghost1.move();
                    if(screen.ghost1.getShape().intersects(screen.pacman.getShape())){
                        screen.reset();
                    }
                    screen.ghost2.move();
                    if(screen.ghost2.getShape().intersects(screen.pacman.getShape())){
                        screen.reset();
                    }
                    screen.ghost3.move();
                    if(screen.ghost3.getShape().intersects(screen.pacman.getShape())){
                        screen.reset();
                    }
                    screen.ghost4.move();
                    if(screen.ghost4.getShape().intersects(screen.pacman.getShape())){
                        screen.reset();
                    }

                    screen.ghost1.updateStates(screen.states);
                    screen.ghost2.updateStates(screen.states);
                    screen.ghost3.updateStates(screen.states);
                    screen.ghost4.updateStates(screen.states);

                    screen.pacman.move(direction);
                    screen.balls[screen.pacman.x/20][screen.pacman.y/20] = false;
                    screen.pacman.updateStates(screen.states);
                }
            }
            
        });
        
        
        timer.start();
        
        
        
    }

    public static void main(String[] args) {
        new Game();
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_LEFT)
            direction='L';
        
        else if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
            direction='R';
        
        else if(ke.getKeyCode() == KeyEvent.VK_DOWN)
            direction='D';
        
        else if(ke.getKeyCode() == KeyEvent.VK_UP)
            direction='U';
        
        else if(ke.getKeyCode() == KeyEvent.VK_ENTER)
            screen.title = false;
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
