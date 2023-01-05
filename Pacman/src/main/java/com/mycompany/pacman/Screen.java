/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author ayoub
 */
public class Screen extends JPanel{
    
    final String url = new String("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/titleScreen.jpg");
    Image titleScreen = Toolkit.getDefaultToolkit().getImage(url);
    Image red_ghost1 = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/ghost10.jpg");
    Image red_ghost2 = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/ghost11.jpg");
    
    Image yellow_ghost1 = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/ghost20.jpg");
    Image yellow_ghost2 = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/ghost21.jpg");
    
    Image blue_ghost1 = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/ghost30.jpg");
    Image blue_ghost2 = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/ghost31.jpg");
    
    Image pink_ghost1 = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/ghost40.jpg");
    Image pink_ghost2 = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/ghost41.jpg");
    
    
    
    Image pacman = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/pacman.jpg");
    Image pacman_left = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/pacmanleft.jpg");
    Image pacman_right = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/pacmanright.jpg");
    Image pacman_up = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/pacmanup.jpg");
    Image pacman_down = Toolkit.getDefaultToolkit().getImage("/home/ayoub/Desktop/JavaPacman/Pacman/src/main/java/assets/pacmandown.jpg");
    
    Boolean title;
    boolean balls[][];
    boolean states[][];
    int lives = 3;
    
    
    public void drawLives(Graphics g){
        g.setColor(Color.YELLOW);
        
        for (int i = 0; i < lives; i++) {
           // g.fillOval((Componant.cellSize + 5)* i + 15, Componant.max+10, Componant.cellSize, Componant.cellSize);
           g.drawImage(pacman_left,(Componant.cellSize + 5)* i + 15, Componant.max+10, null);
        }
    }
    
    
    public void init(){
        for (int i = 0; i < Componant.cellSize; i++) {
            for (int j = 0; j < Componant.cellSize; j++) {
                balls[i][j] = true;
                states[i][j] = true;
            }
        }
        
        balls[10][8]=false;
        balls[10][9]=false;
        balls[11][9]=false;
        balls[9][9] =false;
        balls[10][15]= false;
        
        
    }
    
    
    public Screen(){
        title = false;
        balls = new boolean[Componant.cellSize][Componant.cellSize];
        states = new boolean[Componant.cellSize][Componant.cellSize];
        init();
    }
    
    
    public void update(Graphics g , int x , int y , int width , int height){
        
        //g.drawRect(x, y, width, height); 
        g.fillRect(x, y, width, height);
        
        for (int i = x/20; i < x/20 + width/20; i++) {
            for (int j = y/20; j < y/20 + height/20; j++) {
                balls[i][j] = false;
                states[i][j] = false;
            }
        }
        
        
        
    }
    
    public void drawBalls(Graphics g){
        g.setColor(Color.yellow);
        
        for (int i = 1; i < Componant.cellSize; i++) {
            for (int j = 1; j < Componant.cellSize; j++) {
                if(balls[i][j])
                    g.fillOval(i*20+8, j*20+8, 4, 4);
            }
        }
        
        
    }
    
    public void drawBoard(Graphics g){
        g.setColor(Color.white);
        g.drawRect(19, 19, 382, 382);
        
        g.setColor(Color.blue);
        update(g,40,40,60,20);
        update(g,120,40,60,20);
        update(g,200,20,20,40);
        update(g,240,40,60,20);
        update(g,320,40,60,20);
        update(g,40,80,60,20);
        update(g,160,80,100,20);
        update(g,200,80,20,60);
        update(g,320,80,60,20);
        update(g,20,120,80,60);
        update(g,320,120,80,60);
        update(g,20,200,80,60);
        update(g,320,200,80,60);
        update(g,160,160,40,20);
        update(g,220,160,40,20);
        update(g,160,180,20,20);
        update(g,160,200,100,20);
        update(g,240,180,20,20);
        update(g,120,120,60,20);
        update(g,120,80,20,100);
        update(g,280,80,20,100);
        update(g,240,120,60,20);
        update(g,280,200,20,60);    
        update(g,120,200,20,60); 
        update(g,160,240,100,20);
        update(g,200,260,20,40);
        update(g,120,280,60,20);
        update(g,240,280,60,20);
        update(g,40,280,60,20);
        update(g,80,280,20,60);
        update(g,320,280,60,20);
        update(g,320,280,20,60);
        update(g,20,320,40,20);
        update(g,360,320,40,20);
        update(g,160,320,100,20);
        update(g,200,320,20,60);
        update(g,40,360,140,20);
        update(g,240,360,140,20);
        update(g,280,320,20,60);
        update(g,120,320,20,60);
        
        if(title)
            g.drawImage(titleScreen, 0, 0, null);
        
        repaint();
        
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0, 0, 420, 500);
        
        drawBoard(g);
        drawBalls(g);
        drawLives(g);
        
        g.drawImage(red_ghost1, 10*Componant.cellSize ,8*Componant.cellSize, this);
        g.drawImage(yellow_ghost2, 10*Componant.cellSize ,9*Componant.cellSize, this);
        g.drawImage(pink_ghost1, 11*Componant.cellSize ,9*Componant.cellSize, this);
        g.drawImage(blue_ghost2, 9*Componant.cellSize ,9*Componant.cellSize, this);
        
        g.drawImage(pacman_left, 10*Componant.cellSize ,15*Componant.cellSize, this);
        
  
    }
    
    
}
