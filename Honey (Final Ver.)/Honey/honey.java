import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.World;

/**
 * Write a description of class honey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class honey extends Actor
{   
    int dy = -20;
    int g = 1; 
    //Actor MainC = getOneIntersectingObject(MC.class);
    public void act()
    { 
        setLocation(getX(),getY()+ g);
        dy = dy + g;
        /*if (MainC != null){
            World mundo = getWorld();
            game Game = (game) mundo;
            Counter counter = Game.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if (isAtEdge()){
         getWorld().removeObject(this);
        }*/
        if (isAtEdge()){
         getWorld().removeObject(this);
        }
    }

    }

    
