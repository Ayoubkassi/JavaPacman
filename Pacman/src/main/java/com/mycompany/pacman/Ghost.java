/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ayoub
 */
public class Ghost extends Componant{
    
    public Ghost(int x , int y){
        this.x = x;
        this.y = y;
        direction='L';
    }
    
    public boolean choice(){
        
        
        if( x % cellSize == 0  && y % cellSize == 0 )
            return true;
        
        return false;
    }
    
    public char selectDirection(){
        int random;
        int newx=x, newy=y;
        Set<Character> mySet = new HashSet<Character>();
        
        char backwards = 'R';
        
        switch(direction){
            
            case 'L':
                backwards = 'R';
                break;
                
            case 'R':
                backwards = 'L';
                break;
                
            case 'U':
                backwards = 'D';
                break;
                
            case 'D':
                backwards = 'U';
                break;
            
            
        }
        
        char newDirection = backwards;
        
        while( newDirection == backwards || !isValid(newx,newy) ){
            if( mySet.size() == 3 ){
                mySet.clear();
                newDirection = backwards;
                break;
            }
            
            random = (int)Math.random() * 4 +1;
            if(random == 1){
                newDirection = 'L';
                x-=speed;
            }
            else if(random == 2){
                newDirection = 'R';
                x+=cellSize;
            }
            
            else if(random == 3){
                newDirection = 'U';
                y-=speed;
            }
            
            else if(random == 4){
                newDirection = 'D';
                y+=cellSize;
            }
            
            if( newDirection != backwards ){
                mySet.add(newDirection);
            }
    }
    
    return newDirection;

    
        }
}
    