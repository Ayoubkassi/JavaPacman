/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

/**
 *
 * @author ayoub
 */
public class Componant {
    
    int frameCount = 0;
    boolean states[][];
    static int cellSize = 20;
    static int max = 400;
    static int speed = 4;
    
    char direction;
    int x,y;
    int lastX,lastY;
    
    
    int xBall,yBall;
    int last_xBall,last_yBall;
    
    
    public Componant(){
        states = new boolean[20][20];
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                states[i][j]= false;
                
            }
        }
        
    }
    
    
    
    
    
    public void updateStates(boolean[][] newStates){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                this.states[i][j]= newStates[i][j];
                
            }
        }
    }
    
    
    
    
 
    
    public boolean isValid(int x,int y){
        if(x >= cellSize && x < max && y >= cellSize && y < max && states[x/20-1][y/20-1] )
            return true;
        else 
            return false;
      
    }
    
}
